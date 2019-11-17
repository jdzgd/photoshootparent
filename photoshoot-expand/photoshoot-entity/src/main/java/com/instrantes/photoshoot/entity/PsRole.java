package com.instrantes.photoshoot.entity;

import lombok.Data;

@Data
public class PsRole {
    private Integer roleId;
    private String roleName;
    private PsUser psUser;

}
