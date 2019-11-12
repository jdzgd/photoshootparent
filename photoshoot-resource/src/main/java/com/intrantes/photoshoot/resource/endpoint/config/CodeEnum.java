package com.intrantes.photoshoot.resource.endpoint.config;

import lombok.Getter;

/**
 * @author jiangdongzhao
 * @version V1.0.0
 * @date 2019/11/12
 */
@Getter
public enum CodeEnum {
    /**
     * 请求成功
     */
    SUCCESS(1, "请求成功");

    private int code;
    private String msg;

    CodeEnum(int code, String msg) {
    }
}
