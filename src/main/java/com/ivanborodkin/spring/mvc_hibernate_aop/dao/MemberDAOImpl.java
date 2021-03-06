package com.ivanborodkin.spring.mvc_hibernate_aop.dao;

import com.ivanborodkin.spring.mvc_hibernate_aop.entity.Member;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class MemberDAOImpl implements MemberDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Member> getAllMembers() {

        Session session = sessionFactory.getCurrentSession();
        List<Member> allMembers = session.createQuery("from Member"
                , Member.class).getResultList();
        return allMembers;
    }
}
