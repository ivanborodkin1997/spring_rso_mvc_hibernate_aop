package com.ivanborodkin.spring.mvc_hibernate_aop.dao;

import com.ivanborodkin.spring.mvc_hibernate_aop.entity.Member;

import java.util.List;

public interface MemberDAO {
    public List<Member> getAllMembers();
}
