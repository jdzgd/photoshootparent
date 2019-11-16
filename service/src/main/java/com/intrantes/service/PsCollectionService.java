package com.intrantes.service;

import com.instrantes.photoshoot.entity.PsCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface PsCollectionService{
//    long getPsCollectionRowCount();
//    PsCollection selectPsCollectionById(Integer id);
    void batchInsertPsCollection(HashMap<String, ArrayList<String>> hashMap, Integer currentUserId);
    //查询所有作品信息
    List<PsCollection> selectAllCollection(Integer likeUserId, Integer currentPicId, Integer picLoadNum);
//    int insertPsCollection(PsCollection value);
//    int insertNonEmptyPsCollection(PsCollection value);
//    int deletePsCollectionById(Integer id);
//    int updatePsCollectionById(PsCollection enti);
//    int updateNonEmptyPsCollectionById(PsCollection enti);
    List<PsCollection> selectPsCollectionByUserId(Integer id);

    List<PsCollection> selectCollectionInfoByUserId(Integer userId);    //查询个人所有作品信息

    PsCollection selectSingleCollectionInfoByCollectionId(Integer collectionId);//查询单个作品信息
}