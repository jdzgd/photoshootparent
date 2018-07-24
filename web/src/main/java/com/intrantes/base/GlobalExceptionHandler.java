package com.intrantes.base;


import com.alibaba.fastjson.JSON;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;


/**
 * 集中处理类异常
 * <p>
 * 注解@ControllerAdvice将作用在所有注解了@RequestMapping的控制器的方法上。
 * 注解@ExceptionHandler用于全局处理控制器里的异常。 只能配置程序中抛出的错误
 *
 * @author Lime
 * @date 2017/11/9
 */


@ControllerAdvice(basePackages = "com.intrantes")
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    private final static Logger log = LogManager.getLogger(GlobalExceptionHandler.class);
    /**
     * 默认异常界面
     */
    public static final String DEFAULT_ERROR_VIEW = "500page";
    /**
     * 默认404页面
     */
    public static final String DEFAULT_NOT_FOUND_VIEW = "404page";

    /**
     * 作为全局捕获SQLException
     */
    @ExceptionHandler(SQLException.class)
    public String handleSQLException(HttpServletRequest request, Exception ex) {
        log.error("SQLException Occured:: URL=" + request.getRequestURL());
        return DEFAULT_ERROR_VIEW;
    }

    /**
     * 作为全局捕获IllegalStateException
     */
    @ExceptionHandler(IllegalStateException.class)
    public String handleIllegalStateException(HttpServletRequest request, Exception ex) {
        log.error("IllegalStateException Occured:: URL=" + request.getRequestURL());
        return DEFAULT_NOT_FOUND_VIEW;
    }

    /**
     * 处理自定义抛出异常，并返回对应异常json
     *
     * @param ex, 自定义抛出异常
     * @param ex, request
     * @return org.springframework.http.ResponseEntity<java.lang.Object>
     * @author Lime
     * @date 2018/7/4
     */
    @ExceptionHandler(value = {AppException.class})
    @ResponseBody
    public ResponseEntity<Object> handleException(AppException ex, HttpServletRequest request) throws IOException {
        log.error("" + ex.getMessage());
        log.error("访问资源 " + request.getRequestURI() + " 错误");

        ex = new AppException(UserReturnCode.USER_NOT_ALLOW.getMessage(), UserReturnCode.USER_NOT_ALLOW.getCode());
//        返回异常json，设置返回状态
        return new ResponseEntity<>(ex.toString(), HttpStatus.BAD_REQUEST);
    }

    /**
     * 根据各种异常构建 ResponseEntity 实体. 服务于以上各种异常
     */
//    private ResponseEntity<Object> getResponseEntity(RuntimeException ex, WebRequest request, ReturnCode returnCode) {
////        ReturnTemplate returnTemplate = new ReturnTemplate();
////        returnTemplate.setStatusCode(specificException);
////        returnTemplate.setErrorMsg(ex.getMessage());
//        return handleExceptionInternal(ex,returnCode.getCode(),
//                new HttpHeaders(), HttpStatus.OK, request);
//    }
    @ResponseBody
    private void outputMessage(HttpServletResponse response, Integer errCode, String errMsg) throws IOException {
        AppException result = new AppException(errMsg, errCode);
        String json = JSON.toJSONString(result);
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/json");
        ServletOutputStream os = response.getOutputStream();
        os.write(json.getBytes("utf-8"));
    }

    protected <T> ResponseEntity<T> response(T body, HttpStatus status) {
        log.debug("Responding with a status of {}", status);
        return new ResponseEntity<>(body, new HttpHeaders(), status);
    }

    //    //全局类定义异常,此处是样例

//
//    @ExceptionHandler(ApplicationException.class)
//    @ResponseBody
//    public void handleBizExp(HttpServletRequest request, Exception ex) {
//        log.info("Business exception handler  " + ex.getMessage());
//        request.getSession(true).setAttribute(EXPTION_MSG_KEY, ex.getMessage());
//    }


}
