package com.jobcho.HYWU_TOGETHER.controller;

import com.jobcho.HYWU_TOGETHER.model.Member;
import com.jobcho.HYWU_TOGETHER.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RequestMapping("/api")
@RestController
public class MemberController {
    @Autowired
    private MemberRepository memberRepository;

    @PostMapping("/insert") // CREATE
    public Member insert(@RequestBody Map<String, String> map){
        return memberRepository.save(
                new Member(map.get("usr_name"), map.get("usr_mail"))
        );
    }

    @GetMapping("/select") // READ
    public List<Member> selectAll(){
        return memberRepository.findAll();
    }

    @GetMapping("/select/{id}") // READ
    public Member selectOne(@PathVariable("id") long id){
        return memberRepository.findById(id).orElse(null);
    }

    @PostMapping("/update/{id}") // UPDATE
    public Member updateOne(@PathVariable("id") long id, @RequestBody Map<String, String> map){
        System.out.println(id);
        System.out.println(map);
        Member member = memberRepository.findById(id).orElse(null);
        member.setUsr_mail(map.get("usr_mail"));
        member.setUsr_name(map.get("usr_name"));
        return memberRepository.save(member);
    }

    @PostMapping("/delete/{id}") // DELETE
    public String deleteOne(@PathVariable("id") long id){
        memberRepository.deleteById(id);
        return "삭제 완료";
    }

}
