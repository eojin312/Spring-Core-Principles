package ejlee.springcoreprinciples.service;

import ejlee.springcoreprinciples.member.Member;

public interface MemberService {

    void join(Member member);


    Member findMember(Long memberId);
}
