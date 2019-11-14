package com.instrantes.photoshoot.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class PsLike implements Serializable {
    private Integer likeId;
    private Integer likeCollectionid;
    private Integer likeUserid;
    private java.util.Date likeCreatetime;
    private Integer likeStatus;


}
