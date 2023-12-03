package com.kevin.train.common.resp;

/**
 * 通用的返回结果
 * @author kevin
 * @version 1.0
 * @date 2023-12-03 16:17
 */
public class CommonResp<T> {
    /**业务上的成功或失败*/
    private boolean success=true;

    /**返回信息*/
    private String message;

    /**返回泛型数据，自定义类型*/
    private T content;

    public CommonResp() {
    }

    public CommonResp(T content) {
        this.content = content;
    }

    public CommonResp(boolean success, String message, T content) {
        this.success = success;
        this.message = message;
        this.content = content;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "CommonResp{" +
                "success=" + success +
                ", message='" + message + '\'' +
                ", content=" + content +
                '}';
    }
}
