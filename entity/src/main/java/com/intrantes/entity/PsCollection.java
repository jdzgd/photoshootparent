package com.intrantes.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * ps_collection实体类
 *
 * @author
 */
@TableName("ps_collection")
public class PsCollection {
    /**
     * 作评id
     */
    @TableId(value = "collection_id",type = IdType.AUTO)
    private Integer collectionId;
    /**
     * 作品用户id
     */
    private Integer collectionUserid;
    /**
     * 作品类型id
     */
    private Integer collectionTagid;
    /**
     * 作品图片位置
     */
    private String collectionPhotoLocation;
    /**
     * 作品名称
     */
    private String collectionPhotoname;
    /**
     * 作品图照片描述
     */
    private String collectionPhotointroduction;
    /**
     * 作品价格
     */
    private Object collectionPrice;
    /**
     * 作品照片信息
     */
    private String collectionPhotoinformation;
    /**
     * 作品拍摄位置
     */
    private String collectionAdress;
    /**
     * 作品状态
     */
    private Integer collectionFlag;
    /**
     * 作品创建时间
     */
    private java.util.Date collectionCreatetime;
    /**
     * 作品修改时间
     */
    private java.util.Date collectionUpdatetime;
    /**
     * 作品缩略图位置
     */
    private String collectionSmallPhotoLocation;

    /**
     * 此处为新添加：作品所属用户、喜欢的总人数、当前用户是否喜欢
     */
    @TableField(exist=false)
    private String userName;
    @TableField(exist=false)
    private Integer likeCount;
    @TableField(exist=false)
    private Integer likeStatus;
    @TableField(exist=false)
    private PsUser psUser;
    /**
     * 添加PsLike实体类
     */
    @TableField(exist=false)
    private PsLike psLike;

    /**
     * 实例化
     */
    public PsCollection() {
        super();
    }

    public PsCollection(Integer collectionUserid, String collectionPhotoLocation,String collectionSmallPhotoLocation) {
        this.collectionUserid = collectionUserid;
        this.collectionPhotoLocation = collectionPhotoLocation;
        this.collectionSmallPhotoLocation = collectionSmallPhotoLocation;
    }

    public PsCollection(Integer collectionId, Integer collectionUserid, Integer collectionTagid, String collectionPhotoLocation, String collectionPhotoname, String collectionPhotointroduction, Object collectionPrice, String collectionPhotoinformation, String collectionAdress, Integer collectionFlag, java.util.Date collectionCreatetime, java.util.Date collectionUpdatetime) {
        super();
        this.collectionId = collectionId;
        this.collectionUserid = collectionUserid;
        this.collectionTagid = collectionTagid;
        this.collectionPhotoLocation = collectionPhotoLocation;
        this.collectionPhotoname = collectionPhotoname;
        this.collectionPhotointroduction = collectionPhotointroduction;
        this.collectionPrice = collectionPrice;
        this.collectionPhotoinformation = collectionPhotoinformation;
        this.collectionAdress = collectionAdress;
        this.collectionFlag = collectionFlag;
        this.collectionCreatetime = collectionCreatetime;
        this.collectionUpdatetime = collectionUpdatetime;
    }



    public Integer getCollectionId() {
        return this.collectionId;
    }

    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    public Integer getCollectionUserid() {
        return this.collectionUserid;
    }

    public void setCollectionUserid(Integer collectionUserid) {
        this.collectionUserid = collectionUserid;
    }

    public Integer getCollectionTagid() {
        return this.collectionTagid;
    }

    public void setCollectionTagid(Integer collectionTagid) {
        this.collectionTagid = collectionTagid;
    }

    public String getCollectionPhotoLocation() {
        return this.collectionPhotoLocation;
    }

    public void setCollectionPhotoLocation(String collectionPhotoLocation) {
        this.collectionPhotoLocation = collectionPhotoLocation;
    }


    public String getCollectionPhotoname() {
        return this.collectionPhotoname;
    }

    public void setCollectionPhotoname(String collectionPhotoname) {
        this.collectionPhotoname = collectionPhotoname;
    }

    public String getCollectionPhotointroduction() {
        return this.collectionPhotointroduction;
    }

    public void setCollectionPhotointroduction(String collectionPhotointroduction) {
        this.collectionPhotointroduction = collectionPhotointroduction;
    }

    public Object getCollectionPrice() {
        return this.collectionPrice;
    }

    public void setCollectionPrice(Object collectionPrice) {
        this.collectionPrice = collectionPrice;
    }

    public String getCollectionPhotoinformation() {
        return this.collectionPhotoinformation;
    }

    public void setCollectionPhotoinformation(String collectionPhotoinformation) {
        this.collectionPhotoinformation = collectionPhotoinformation;
    }

    public String getCollectionAdress() {
        return this.collectionAdress;
    }

    public void setCollectionAdress(String collectionAdress) {
        this.collectionAdress = collectionAdress;
    }

    public Integer getCollectionFlag() {
        return this.collectionFlag;
    }

    public void setCollectionFlag(Integer collectionFlag) {
        this.collectionFlag = collectionFlag;
    }

    public java.util.Date getCollectionCreatetime() {
        return this.collectionCreatetime;
    }

    public void setCollectionCreatetime(java.util.Date collectionCreatetime) {
        this.collectionCreatetime = collectionCreatetime;
    }

    public java.util.Date getCollectionUpdatetime() {
        return this.collectionUpdatetime;
    }

    public void setCollectionUpdatetime(java.util.Date collectionUpdatetime) {
        this.collectionUpdatetime = collectionUpdatetime;
    }

    public String getCollectionSmallPhotoLocation() {
        return collectionSmallPhotoLocation;
    }

    public void setCollectionSmallPhotoLocation(String collectionSmallPhotoLocation) {
        this.collectionSmallPhotoLocation = collectionSmallPhotoLocation;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getLikeStatus() {
        return likeStatus;
    }

    public void setLikeStatus(Integer likeStatus) {
        this.likeStatus = likeStatus;
    }

    public PsUser getPsUser() {
        return psUser;
    }

    public void setPsUser(PsUser psUser) {
        this.psUser = psUser;
    }

    public PsLike getPsLike() {
        return psLike;
    }

    public void setPsLike(PsLike psLike) {
        this.psLike = psLike;
    }

    @Override
    public String toString() {
        return "PsCollection [collectionId=" + collectionId + " , collectionUserid=" + collectionUserid + " , collectionTagid=" + collectionTagid + " , collectionPhotoLocation=" + collectionPhotoLocation + " , collectionPhotoname=" + collectionPhotoname + " , collectionPhotointroduction=" + collectionPhotointroduction + " , collectionPrice=" + collectionPrice + " , collectionPhotoinformation=" + collectionPhotoinformation + " , collectionAdress=" + collectionAdress + " , collectionFlag=" + collectionFlag + " , collectionCreatetime=" + collectionCreatetime + " , collectionUpdatetime=" + collectionUpdatetime + " , collectionSmallPhotoLocation=" + collectionSmallPhotoLocation + "  ]";

    }


}
