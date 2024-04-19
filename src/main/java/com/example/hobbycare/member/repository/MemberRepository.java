package com.example.hobbycare.member.repository;

import com.example.hobbycare.member.entity.Member;
import com.example.hobbycare.member.entity.MemberId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, MemberId> {


}
