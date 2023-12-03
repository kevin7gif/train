package com.kevin.train.member.service;

/**
 * @author kevin
 * @version 1.0
 * @date 2023-11-22 11:04
 */
public interface MemberService {

    /** 注册 */
    public long register(String mobile);

    /** 总数*/
    public int count();
}
