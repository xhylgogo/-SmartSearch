package com.xx.utils;


public class Result<D> {

    /**错误码*/
    private int code;
    /**提示信息*/
    private String msg;
    /**具体的内容*/
    private D data;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public D getData() {
        return data;
    }

    public void setData(D data) {
        this.data = data;
    }
}
