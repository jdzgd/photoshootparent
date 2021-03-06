package com.intrantes.controller;


import com.alibaba.fastjson.support.spring.annotation.FastJsonFilter;
import com.alibaba.fastjson.support.spring.annotation.FastJsonView;
import com.instrantes.photoshoot.entity.PsCollection;
import com.instrantes.photoshoot.entity.PsLike;
import com.intrantes.service.PsCollectionService;
import com.intrantes.service.PsLikeService;
import com.intrantes.service.PsUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping(value = "/collection")
@Slf4j
public class PsCollectionController {
    static Logger logger = LogManager.getLogger(PsCollectionController.class);

    @Autowired
    PsCollectionService psCollectionService;
    @Autowired
    PsUserService psUserService;
    @Autowired
    PsLikeService psLikeService;

    /**
     *此处需要加入验证，验证是否找到用户ID
     *@param
     *@return int
     *Date 2017/10/25
     */
    protected Integer getCurrentPsUserId() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return psUserService.selectPsUserUserIdByName(authentication.getName());
    }

    /**
    * 根据用户id查询作品的详情
    * <br/>
    * @param id
    * @return java.util.List<com.intrantes.entity.PsCollection>
    */
    @RequestMapping(value = "/userCollections", method = RequestMethod.POST)
    @ResponseBody
    public List<PsCollection> selectPsCollectionByUserId(Integer id) {
        return  psCollectionService.selectPsCollectionByUserId(id);
    }
     /**
     *批量上传多个图片
      * @param hashMap key有两个picArray（大图）smallPicArray（小图）
     *@return void
     *Date: 2017/11/21
     */
    @RequestMapping(value = "/publishPic", method = RequestMethod.POST)
    @ResponseBody
    public void batchInsertPsCollection(@RequestBody HashMap<String,ArrayList<String>> hashMap) {
        int currentUserId = psUserService.getCurrentPsUserId();
        psCollectionService.batchInsertPsCollection(hashMap,currentUserId);
    }

    /**
     *此处应该加入随机显示功能，或者显示最新的
     * 已经实现（大数据库分段查询功能），即每次仅查询一部分图片。而不是整个数据库的所有图片
     *@param currentPicId 图片当前ID
     *@param picLoadNum 图片数目
     *@return java.util.List<com.instrantes.pojo.PsCollection>
     *Date 2017/11/3
     */
    //查询所有作品信息
    @RequestMapping(value = "/allCollection", method = RequestMethod.POST)
    @ResponseBody
    public List<PsCollection> selectAllCollection(Integer currentPicId, Integer picLoadNum) {
//        throw new ApplicationException("sss", 10001);
        if (getCurrentPsUserId() == null) {
            System.out.println("---------------------------------:" + getCurrentPsUserId());
            return psCollectionService.selectAllCollection(0, currentPicId, picLoadNum);
        }
        return psCollectionService.selectAllCollection(getCurrentPsUserId(), currentPicId, picLoadNum);
    }
    /**
     *根据登陆用户的ID，获取当前登陆用户的所有作品
     *@param
     *@return java.util.List<com.instrantes.pojo.PsCollection>
     *Date 2017/11/13
     */
    @RequestMapping(value = "/personCollection", method = RequestMethod.POST)
    @ResponseBody
    public List<PsCollection> selectCollectionInfoByUserId() {
        List<PsCollection> psCollections = psCollectionService.selectCollectionInfoByUserId(psUserService.getCurrentPsUserId());
        return psCollections;
    }

    /**单个作品信息*/
    @FastJsonView(exclude = {@FastJsonFilter(clazz=PsCollection.class,props = {"collectionAdress","collectionCreatetime"})})
    @RequestMapping(value = "/singleColletion", method = RequestMethod.POST)
    @ResponseBody
    public PsCollection selectSingleCollectionInfoByCollectionId(Integer collectionId) {
        Integer psUserId=psUserService.getCurrentPsUserId();
        PsCollection psCollection=psCollectionService.selectSingleCollectionInfoByCollectionId(collectionId);
        psCollection.setPsUser(psUserService.selectPsUserGeneralInformationById(psUserId));
        try{
        psCollection.setPsLike( psLikeService.selectStatus(collectionId,psUserId));
            log.info("------------------------------------------{}",psCollection.getPsLike().getLikeStatus());
        } catch (Exception e){
            PsLike psLike=new PsLike();
            psLike.setLikeStatus(0);
            psCollection.setPsLike(psLike);
        }
        return psCollection;
    }

}
