package com.my.exception;

/**
 * 自定义系统异常类
 *
 * @author gjq
 * @create 2019-09-13-19:38
 */
public class SysException extends Exception {

    //存储提示信息
    private String message;

    public SysException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
