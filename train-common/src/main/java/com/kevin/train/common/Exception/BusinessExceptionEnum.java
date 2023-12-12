package com.kevin.train.common.Exception;

/**
 * @author kevin
 * @version 1.0
 * @date 2023-12-12 14:09
 */
public enum BusinessExceptionEnum {
    MEMBER_MOBILE_EXIST("手机号已被注册");

    private String desc;

    BusinessExceptionEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "BusinessExceptionEnum{" +
                "desc='" + desc + '\'' +
                '}';
    }
}
