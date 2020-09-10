package com.ysq.backstage.model;

import org.springframework.stereotype.Component;

/**
 * @ClassName CURDResult
 * @Description TODO
 * @Author yangshaoqi
 * @Date 2020/9/10 10:02
 * @Version 1.0
 **/
@Component
public class CURDResult {
    private int success = 1;//默认成功
    private String msg = "";

    public CURDResult() {
    }

    public CURDResult(int success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "CURDResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                '}';
    }
}
