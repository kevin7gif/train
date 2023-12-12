package com.kevin.train.common.Exception;

/**
 * @author kevin
 * @version 1.0
 * @date 2023-12-12 14:14
 */
public class BusinessException extends RuntimeException{
    private BusinessExceptionEnum exceptionEnum;

    public BusinessException(BusinessExceptionEnum exceptionEnum) {
        this.exceptionEnum = exceptionEnum;
    }

    public BusinessExceptionEnum getExceptionEnum() {
        return exceptionEnum;
    }

    public void setExceptionEnum(BusinessExceptionEnum exceptionEnum) {
        this.exceptionEnum = exceptionEnum;
    }
}
