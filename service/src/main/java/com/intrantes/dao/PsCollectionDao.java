package com.intrantes.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.intrantes.entity.PsCollection;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PsCollectionDao extends BaseMapper<PsCollection> {
    //    批量上传多个图片
    void batchInsertPsCollection(@Param("psCollectionList") List<PsCollection> psCollectionList);

    List<PsCollection> selectAllCollection(@Param("likeUserId") Integer likeUserId, @Param("currentPicId") Integer currentPicId, @Param("picLoadNum") Integer picLoadNum);    //查询所有作品信息

    List<PsCollection> selectPsCollectionByUserId(Integer id);

    List<PsCollection> selectCollectionInfoByUserId(Integer id);    //查询所有作品信息

    PsCollection selectSingleCollectionInfoByCollectionId(Integer collectionId);
}