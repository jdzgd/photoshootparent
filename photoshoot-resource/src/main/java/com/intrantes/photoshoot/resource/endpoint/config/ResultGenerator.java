package com.intrantes.photoshoot.resource.endpoint.config;

import org.springframework.stereotype.Component;

import static com.intrantes.photoshoot.resource.endpoint.config.CodeEnum.SUCCESS;


/**
 * 工厂模式
 * 接口信息生成工具
 * 。@Component 添加到Spring组件中
 *
 * @author Lime
 */
@Component
public class ResultGenerator {


    /**
     * 成功
     */
    public static <E> RestResult<E> ok() {
        return new RestResult<E>();
    }

    /**
     * 带返回数据的成功
     */
    public static <E> RestResult<E> ok(E o) {
        return new RestResult<E>(SUCCESS.getCode(), SUCCESS.getMsg(), o);
    }

//    /**
//     * 错误
//     */
//    public static <E> RestResult<E> error() {
//        return new RestResult<E>(INTERNAL_SERVER_ERROR.getCode(), INTERNAL_SERVER_ERROR.getMsg());
//    }
//
//    /**
//     * 错误
//     * 返回自定义消息
//     */
//    public static <E> RestResult<E> error(String message) {
//        return new RestResult<E>(INTERNAL_SERVER_ERROR.getCode(), Strings.isNullOrEmpty(message) ? INTERNAL_SERVER_ERROR.getMsg() : message);
//    }
//
//    /**
//     * 错误
//     * 返回自定义code和自定义消息
//     */
//    public static <E> RestResult<E> error(int code, String message) {
//        return new RestResult<E>(code, Strings.isNullOrEmpty(message) ? INTERNAL_SERVER_ERROR.getMsg() : message);
//    }

}
