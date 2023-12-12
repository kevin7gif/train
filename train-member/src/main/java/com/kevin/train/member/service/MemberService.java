package com.kevin.train.member.service;

import com.kevin.train.member.req.MemberRegisterReq;

/**
 * @author kevin
 * @version 1.0
 * @date 2023-11-22 11:04
 */
public interface MemberService {

    /** 注册 */
    public long register(MemberRegisterReq mobile);

    /** 总数*/
    public int count();
}
