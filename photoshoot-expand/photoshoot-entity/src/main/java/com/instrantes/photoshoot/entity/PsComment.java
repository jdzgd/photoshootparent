package com.instrantes.photoshoot.entity;

import lombok.Data;

import java.util.Date;

@Data
public class PsComment {

    private Integer commentReplyId;//回复别人的id
    private Date commentTime;
    private Integer commentCollectionid;
    private String commentContent;
    private Integer commentUserid;
    private Integer commentStatus;

}
