package common.exception;

/**
 * 自定义异常类
 *
 * @author Lime
 * @date 2018/7/4
 */
public class AppException extends RuntimeException {
    /*错误码*/

    private Integer code;

    public AppException(Integer code) {
        this.code = code;
    }

    public AppException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public AppException(String message, Throwable cause, Integer code) {
        super(message, cause);
        this.code = code;
    }

    public AppException(Throwable cause, Integer code) {
        super(cause);
        this.code = code;
    }

    public AppException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Integer code) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
    }


    //此处输出异常代码,此处还未定义
    // 以及异常信息
    @Override
    public String toString() {
        return "AppException{" +
                "code=" + code +
                ",message=" + getMessage() +
                '}';
    }
}
