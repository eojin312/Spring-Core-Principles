package ejlee.springcoreprinciples.service;

import ejlee.springcoreprinciples.member.Grade;
import ejlee.springcoreprinciples.member.Member;
import ejlee.springcoreprinciples.service.impl.MemberServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    @Test
    void join() {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);

        memberService.join(member);

        Member findMeber = memberService.findMember(1L);
        Assertions.assertEquals(member.getGrade(), findMeber.getGrade());
    }
}
