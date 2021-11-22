package com.ivanborodkin.spring.mvc_hibernate_aop.controller;

import com.ivanborodkin.spring.mvc_hibernate_aop.entity.Member;
import com.ivanborodkin.spring.mvc_hibernate_aop.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @RequestMapping("/")
    public String toComeIn() {
        return "input";
    }

    @RequestMapping("/add-new-member")
    public String addNewMember(Model model) {
        Member member = new Member();
        model.addAttribute("member", member);
        return "member-info";
    }

    @RequestMapping("/thanks")
    public String thanks() {
        return "thanks";
    }

    @RequestMapping("/show-all-members")
    public String showAllMembers(Model model) {
        List<Member> allMembers = memberService.getAllMembers();
        model.addAttribute("allMembs", allMembers);
        return "all-members";
    }

    @RequestMapping("/save-new-member")
    public String saveNewMember(@ModelAttribute("member") Member member) {
        memberService.saveMember(member);
            return "redirect:/thanks";

    }

    @RequestMapping("/save-member")
    public String saveMember(@ModelAttribute("member") Member member) {
        memberService.saveMember(member);
        return "redirect:/show-all-members";

    }

    @RequestMapping("/update-info")
    public String updateMember(@RequestParam("memId") int id, Model model) {
        Member member = memberService.getMember(id);
        model.addAttribute("member", member);
        return "changing-member";

    }

    @RequestMapping("/delete-member")
    public String deleteMember(@RequestParam("memId") int id, Model model) {
        memberService.deleteMember(id);
        return "redirect:/show-all-members";
    }

}
