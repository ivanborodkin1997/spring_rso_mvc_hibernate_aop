package com.ivanborodkin.spring.mvc_hibernate_aop.service;

import com.ivanborodkin.spring.mvc_hibernate_aop.dao.MemberDAO;
import com.ivanborodkin.spring.mvc_hibernate_aop.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDAO memberDAO;

    @Override
    public List<Member> getAllMembers() {
        return memberDAO.getAllMembers();
    }

    @Override
    public void saveMember(Member member) {
        memberDAO.saveMember(member);
    }

    @Override
    public Member getMember(int id) {
        return memberDAO.getMember(id);
    }

    @Override
    public void deleteMember(int id) {
        memberDAO.deleteMember(id);
    }

}
