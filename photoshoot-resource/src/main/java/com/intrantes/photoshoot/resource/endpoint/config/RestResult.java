package com.intrantes.photoshoot.resource.endpoint.config;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

import static com.intrantes.photoshoot.resource.endpoint.config.CodeEnum.SUCCESS;

/**
 * 统一封装API返回信息
 *
 * @author Lime
 * @date 2018/08/17
 */
@Getter
@Setter
@ToString
public class RestResult<T> implements Serializable {
    /**
     * 序列化标识
     */
    private static final long serialVersionUID = 1L;
    /**
     * 状态码
     */
    private int code;
    /**
     * 消息
     */
    private String msg;
    /**
     * 额外的内容
     */
    private T data;

    /**
     * count
     */
    private long count;

    RestResult() {
        this.code = SUCCESS.getCode();
        this.msg = SUCCESS.getMsg();
    }

    public RestResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    RestResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    RestResult(int code, String msg, T data,long count) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.count = count;
    }
}
