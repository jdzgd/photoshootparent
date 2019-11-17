package com.instrantes.photoshoot.entity;

import lombok.Data;

@Data
public class PsWatch {
    private Integer watchUserid;
    private Integer watchFansid;
    private  PsUser psUser;

}
