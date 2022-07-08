package ejlee.springcoreprinciples.service.impl;

import ejlee.springcoreprinciples.member.Grade;
import ejlee.springcoreprinciples.member.Member;
import ejlee.springcoreprinciples.service.MemberService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceImplTest {

    @Test
    void createOrder() {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
    }
}
