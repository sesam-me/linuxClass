package com.example.linuxclass.service;

import com.example.linuxclass.domain.Dto.MemberDto;
import com.example.linuxclass.domain.entity.Member;
import com.example.linuxclass.domain.request.MemberRequest;
import com.example.linuxclass.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;


//    회원가입
    public void signup(MemberRequest request) {
        memberRepository.save(request.toEntity());
    }


//    조회
    public List<Member> getAll() {
        List<Member> memberList = memberRepository.findAll();
        return memberList;
    }
}
