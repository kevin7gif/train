package com.kevin.train.member.service.impl;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.IdUtil;
import com.kevin.train.common.Exception.BusinessException;
import com.kevin.train.common.Exception.BusinessExceptionEnum;
import com.kevin.train.common.util.SnowUtil;
import com.kevin.train.member.mapper.MemberMapper;
import com.kevin.train.member.pojo.Member;
import com.kevin.train.member.pojo.MemberExample;
import com.kevin.train.member.req.MemberRegisterReq;
import com.kevin.train.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public long register(MemberRegisterReq req) {
        // 创建查询条件，判断手机号是否已经被注册
        MemberExample example=new MemberExample();
        example.createCriteria().andMobileEqualTo(req.getMobile());
        List<Member> members = memberMapper.selectByExample(example);

        if(CollUtil.isNotEmpty(members)){
            throw new BusinessException(BusinessExceptionEnum.MEMBER_MOBILE_EXIST);
        }

        // 没有注册，直接进行插入操作
        Member member=new Member();
        member.setId(SnowUtil.getSnowflakeNextId());
        member.setMobile(req.getMobile());
        memberMapper.insert(member);
        return member.getId();
    }

    @Override
    public int count() {
        long l = memberMapper.countByExample(null);
        return Math.toIntExact(l);
    }
}
