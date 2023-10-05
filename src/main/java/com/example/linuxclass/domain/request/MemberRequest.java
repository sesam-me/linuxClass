package com.example.linuxclass.domain.request;

import com.example.linuxclass.domain.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberRequest {
    private String name;
    private String description;

    public Member toEntity() {
        return Member.builder()
                .name(name)
                .description(description)
                .build();
    }
}
