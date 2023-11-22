package com.kevin.train.member.controller;

import com.kevin.train.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kevin
 * @version 1.0
 * @date 2023-11-22 11:09
 */
@RestController
@RequestMapping("/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/count")
    public Integer count(){
        return memberService.count();
    }
}
