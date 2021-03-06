package com.ivanborodkin.spring.mvc_hibernate_aop.controller;

import com.ivanborodkin.spring.mvc_hibernate_aop.dao.MemberDAO;
import com.ivanborodkin.spring.mvc_hibernate_aop.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private MemberDAO memberDAO;

    @RequestMapping("/")
    public String showAllMembers(Model model) {
        List<Member> allMembers = memberDAO.getAllMembers();
        model.addAttribute("allMembs", allMembers);
        return "all-members";
    }
}
