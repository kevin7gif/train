package com.kevin.train.member.service.impl;

import com.kevin.train.member.mapper.MemberMapper;
import com.kevin.train.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kevin
 * @version 1.0
 * @date 2023-11-22 11:03
 */
@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberMapper memberMapper;

    @Override
    public int count() {
        int count = memberMapper.count();
        return count;
    }
}
