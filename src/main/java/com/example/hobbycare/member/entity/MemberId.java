package com.example.hobbycare.member.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class MemberId implements Serializable {

    private Long id;
    private String userId;
}
