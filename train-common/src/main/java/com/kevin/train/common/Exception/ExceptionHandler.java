package com.kevin.train.common.Exception;

import com.kevin.train.common.resp.CommonResp;
import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


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
     * @throws Exception
     */
    @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
    @ResponseBody
    public CommonResp exception(Exception e)throws Exception{
        CommonResp commonResp=new CommonResp<>();
        LOG.error("系统异常：",e);
        commonResp.setSuccess(false);
        // commonResp.setMessage("系统出现异常，请联系管理员");
        commonResp.setMessage(e.getMessage());
        return commonResp;
    }
}
