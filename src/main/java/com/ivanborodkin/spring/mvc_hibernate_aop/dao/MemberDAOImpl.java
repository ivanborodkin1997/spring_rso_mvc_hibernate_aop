package com.ivanborodkin.spring.mvc_hibernate_aop.dao;

import com.ivanborodkin.spring.mvc_hibernate_aop.entity.Member;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberDAOImpl implements MemberDAO {

    private final SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Member> getAllMembers() {
        Session session = sessionFactory.getCurrentSession();
        List<Member> allMembers = session.createQuery("from Member", Member.class).getResultList();
        return allMembers;
    }

    @Override
    @Transactional
    public void saveMember(Member member) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(member);
    }

    @Override
    @Transactional
    public Member getMember(int id) {
        Session session = sessionFactory.getCurrentSession();

        Member member = session.get(Member.class, id);
        return member;
    }

    @Override
    @Transactional
    public void deleteMember(int id) {
        Session session = sessionFactory.getCurrentSession();

        Query<Member> query = session.createQuery("delete from Member " +
                "where id =:memberId");
        query.setParameter("memberId", id);
        query.executeUpdate();

    }

}
