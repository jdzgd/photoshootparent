package com.intrantes.entity;


import lombok.Data;

import java.io.Serializable;

/**
 * 用户实体类
 *
 * @author Lime
 * @date 2018/7/23
 */
@Data
public class PsUser implements Serializable {
    private Integer userId;
    private String userIsDelete;
    private String userName;
    private String userPassword;
    private String userNickname;
    private Integer userRole;
    private Integer userSex;
    private Integer userAge;
    private String userIntroduction;
    private String userHeadphotoLocation;
    private java.util.Date userUpdatetime;
    private java.util.Date userCreatetime;
    private String userEmail;
    private PsRole psRole;
    private Integer fansSum;

}
