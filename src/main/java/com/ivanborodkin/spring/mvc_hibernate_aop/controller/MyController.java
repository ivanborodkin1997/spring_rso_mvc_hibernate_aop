package com.ivanborodkin.spring.mvc_hibernate_aop.controller;

import com.ivanborodkin.spring.mvc_hibernate_aop.dao.MemberDAO;
import com.ivanborodkin.spring.mvc_hibernate_aop.entity.Member;
import com.ivanborodkin.spring.mvc_hibernate_aop.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private MemberService memberService;

    @RequestMapping("/")
    public String addNewMember(Model model) {

        Member member = new Member();
        model.addAttribute("member", member);

        return "member-info";
    }

    @RequestMapping("/showAllMembs")
    public String showAllMembers(Model model) {
        List<Member> allMembers = memberService.getAllMembers();
        model.addAttribute("allMembs", allMembers);
        return "all-members";
    }


    @RequestMapping("/saveMember")
    public String saveMember(@ModelAttribute("member")
                                         Member member) {

        memberService.saveMember(member);

        return "redirect:/showAllMembs";
    }

    @RequestMapping("/updateInfo")
    public String updateMember(@RequestParam("memId") int id, Model model) {
        Member member = memberService.getMember(id);
        model.addAttribute("member", member);
        return "member-info";

    }

    @RequestMapping("/deleteMember")
    public String deleteMember(@RequestParam("memId") int id, Model model) {

        memberService.deleteMember(id);
        return "redirect:/showAllMembs";
    }
}
