package com.back.domain.member.member.dto;

import com.back.domain.member.member.entity.Member;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;

public record MemberWithUsernameDto(
        @NotNull int id,
        @NotNull LocalDateTime createDate,
        @NotNull LocalDateTime modifyDate,
        @NotNull String username,
        @NotNull String name
) {
    public MemberWithUsernameDto(Member member) {
        this(
                member.getId(),
                member.getCreateDate(),
                member.getModifyDate(),
                member.getUsername(),
                member.getName()
        );
    }
}