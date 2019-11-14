package com.intrantes.service;


import com.instrantes.photoshoot.entity.PsLike;

public interface PsLikeService{
    PsLike selectStatus(Integer collectionId, Integer userId);//查询likeStatus，传入参数：collectionID,userID
    public void insertLikeRecordByUserId(Integer likeCollectionid, Integer likeUserid); //插入点赞记录，
}