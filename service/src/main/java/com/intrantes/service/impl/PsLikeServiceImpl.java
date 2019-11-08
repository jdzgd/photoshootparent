package com.intrantes.service.impl;

import com.intrantes.dao.PsLikeDao;
import com.intrantes.entity.PsLike;
import com.intrantes.service.PsLikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class PsLikeServiceImpl implements PsLikeService {
    @Autowired
    private PsLikeDao psLikeDao;

    /**
     * 查询likeStatus
     *
     * @param collectionId 作品的id
     * @param userId       用户的id
     * @return com.instrantes.pojo.PsLike
     * Date: 2017/11/22
     */
    @Override
    public PsLike selectStatus(Integer collectionId, Integer userId) {
        return psLikeDao.selectStatus(collectionId, userId);
    }


    @PreAuthorize("hasAuthority('ROLE_ORDIN')")
/**
 *用户点赞后插入一条点赞记录，该方法被保护，用于只有有ROLE_ORDIN权限的用户才能进行调用
 *@param [likeCollectionid, likeUserid]
 *@return void
 *Date: 2017/11/15
 */
    @Override
    public void insertLikeRecordByUserId(Integer likeCollectionid, Integer likeUserid) {
        psLikeDao.insertLikeRecordByUserId(likeCollectionid, likeUserid);
    }
}