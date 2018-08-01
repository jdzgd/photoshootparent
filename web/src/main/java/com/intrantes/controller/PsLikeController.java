package com.intrantes.controller;

import com.intrantes.service.PsLikeService;
import com.intrantes.service.PsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by Lime on 2017/10/30
 */
@Controller
@RequestMapping("/like")
public class PsLikeController {
//    static Logger logger = LogManager.getLogger(PsLikeController.class.getName());
    @Autowired
    PsLikeService psLikeService;
    @Autowired
    PsUserService psUserService;

    @PostMapping(value = "/likeRecord")
    /**
     *当用户点赞时，触发该功能，插入一条点赞记录
     *@param [likeCollectionID]
     *@return void
     *@date 2017/11/8
     */
    @ResponseBody
    public Integer insertLikeRecordByUserId(@RequestBody Map<String, Integer> likeJson) {
//                Map<String,String>map = JSON.parseObject(likeJson,new TypeReference<Map<String, String>>(){});
        psLikeService.insertLikeRecordByUserId(likeJson.get("likeCollectionid"), psUserService.getCurrentPsUserId());
        return 1;
    }
}
