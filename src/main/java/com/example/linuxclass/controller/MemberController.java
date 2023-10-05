package com.example.linuxclass.controller;

import com.example.linuxclass.domain.entity.Member;
import com.example.linuxclass.domain.request.MemberRequest;
import com.example.linuxclass.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/member")
@CrossOrigin("*")
public class MemberController {
    private final MemberService memberService;

    @PostMapping
    public void save(@RequestBody MemberRequest request) {
        memberService.signup(request);
    }

    @GetMapping
    public List<Member> getAll(){
        return memberService.getAll();
    }
}
