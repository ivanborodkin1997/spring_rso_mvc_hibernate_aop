package com.ivanborodkin.spring.mvc_hibernate_aop.service;

import com.ivanborodkin.spring.mvc_hibernate_aop.entity.Member;

import java.util.List;

public interface MemberService {

    public List<Member> getAllMembers();

    public void saveMember(Member member);

    public Member getMember(int id);

    public void deleteMember(int id);

}
