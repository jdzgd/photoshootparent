package com.intrantes.entity;


import java.io.Serializable;

/**
 * 用户实体类
 *
 * @author Lime
 * @date 2018/7/23
 */
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


    public PsRole getPsRole() {
        return psRole;
    }

    public void setPsRole(PsRole psRole) {
        this.psRole = psRole;
    }


    public PsUser() {
        super();
    }

    public PsUser(Integer userId, String userIsDelete, String userName, String userPassword, String userNickname, Integer userRole, Integer userSex, Integer userAge, String userIntroduction, String userHeadphotoLocation, java.util.Date userUpdatetime, java.util.Date userCreatetime) {
        super();
        this.userId = userId;
        this.userIsDelete = userIsDelete;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userNickname = userNickname;
        this.userRole = userRole;
        this.userSex = userSex;
        this.userAge = userAge;
        this.userIntroduction = userIntroduction;
        this.userHeadphotoLocation = userHeadphotoLocation;
        this.userUpdatetime = userUpdatetime;
        this.userCreatetime = userCreatetime;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserIsDelete() {
        return this.userIsDelete;
    }

    public void setUserIsDelete(String userIsDelete) {
        this.userIsDelete = userIsDelete;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return this.userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserNickname() {
        return this.userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public Integer getUserRole() {
        return this.userRole;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }

    public Integer getUserSex() {
        return this.userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public Integer getUserAge() {
        return this.userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserIntroduction() {
        return this.userIntroduction;
    }

    public void setUserIntroduction(String userIntroduction) {
        this.userIntroduction = userIntroduction;
    }

    public String getUserHeadphotoLocation() {
        return this.userHeadphotoLocation;
    }

    public void setUserHeadphotoLocation(String userHeadphotoLocation) {
        this.userHeadphotoLocation = userHeadphotoLocation;
    }

    public Integer getFansSum() {
        return fansSum;
    }

    public void setFansSum(Integer fansSum) {
        this.fansSum = fansSum;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public java.util.Date getUserUpdatetime() {
        return this.userUpdatetime;
    }

    public void setUserUpdatetime(java.util.Date userUpdatetime) {
        this.userUpdatetime = userUpdatetime;
    }

    public java.util.Date getUserCreatetime() {
        return this.userCreatetime;
    }

    public void setUserCreatetime(java.util.Date userCreatetime) {
        this.userCreatetime = userCreatetime;
    }

}
