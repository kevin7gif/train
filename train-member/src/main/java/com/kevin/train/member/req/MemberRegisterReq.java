package com.kevin.train.member.req;

import jakarta.validation.constraints.NotBlank;

/**
 * 注册接口的请求参数封装
 * @author kevin
 * @version 1.0
 * @date 2023-12-12 14:33
 */
public class MemberRegisterReq {
    @NotBlank(message = "【手机号】不能为空!")
    private String mobile;

    @Override
    public String toString() {
        return "MemberRegisterReq{" +
                "mobile='" + mobile + '\'' +
                '}';
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
