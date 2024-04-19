package com.example.hobbycare.member.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Data;

@Entity
@Data
@IdClass(MemberId.class)
public class Member {

    @Id
    private Long id;

    @Id
    private String userId;

    @Column
    private String userPwd;

    @Column
    private String userNm;

    @Column
    private String joinDt;

    @Column
    private String useYn;

    @Column
    private String dormancyDt;

    @Column
    private String secessionDt;

    @Column
    private int loginFailCnt;

    @Column
    private String nickName;


}
