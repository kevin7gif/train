package com.kevin.train.common.Exception;

import com.kevin.train.common.resp.CommonResp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 统一异常处理，数据预处理等
 * @author kevin
 * @version 1.0
 * @date 2023-12-03 16:38
 */
@ControllerAdvice
public class ExceptionHandler {

    private static final Logger LOG= LoggerFactory.getLogger(ExceptionHandler.class);

    /**
     * 所有异常统一处理
     * @param e
     * @return
     */
    @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
    @ResponseBody
    public CommonResp exception(Exception e){
        CommonResp commonResp=new CommonResp<>();
        LOG.error("系统异常：",e);
        commonResp.setSuccess(false);
        commonResp.setMessage("系统出现异常，请联系管理员");
        return commonResp;
    }

    /**
     * 业务异常统一处理
     * @param e
     * @return
     */
    @org.springframework.web.bind.annotation.ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public CommonResp exception(BusinessException e){
        CommonResp commonResp=new CommonResp<>();
        LOG.error("业务异常：{}",e.getExceptionEnum().getDesc());
        commonResp.setSuccess(false);
        commonResp.setMessage(e.getExceptionEnum().getDesc());
        return commonResp;
    }

    /**
     * 校验异常统一处理
     * @param e
     * @return
     */
    @org.springframework.web.bind.annotation.ExceptionHandler(value = BindException.class)
    @ResponseBody
    public CommonResp exception(BindException e){
        CommonResp commonResp=new CommonResp<>();
        // 需要提示校验失败的信息，这里的写法是跟踪bindException的源码，在defaultMessage中存有校验失败的提示信息
        LOG.error("校验异常：{}",e.getBindingResult().getAllErrors().get(0).getDefaultMessage());
        commonResp.setSuccess(false);
        commonResp.setMessage(e.getBindingResult().getAllErrors().get(0).getDefaultMessage());
        return commonResp;
    }
}
