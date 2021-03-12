package com.ivanborodkin.spring.mvc_hibernate_aop.service;

import com.ivanborodkin.spring.mvc_hibernate_aop.dao.MemberDAO;
import com.ivanborodkin.spring.mvc_hibernate_aop.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDAO memberDAO;

    @Override
    @Transactional
    public List<Member> getAllMembers() {
        return memberDAO.getAllMembers();
    }

    @Override
    @Transactional
    public void saveMember(Member member) {
        memberDAO.saveMember(member);
    }

    @Override
    @Transactional
    public Member getMember(int id) {
        return memberDAO.getMember(id);
    }

    @Override
    @Transactional
    public void deleteMember(int id) {
        memberDAO.deleteMember(id);
    }


}
