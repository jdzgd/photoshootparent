package com.intrantes.entity;

import lombok.Data;

/**
 * Created by Lime on 2017/12/18
 */
@Data
public class IMMessage {
    /**
     * 应用ID
     */
    private byte appId;
    /**
     * 版本号
     */
    private int version;
    /**
     * 用户ID
     */
    private int uid;
    /**
     * 消息类型    0:登陆    1：文字消息
     */
    private byte msgType;
    /**
     * 接收方
     */
    private int receiveId;
    /**
     * 消息内容
     */
    private String msg;

}