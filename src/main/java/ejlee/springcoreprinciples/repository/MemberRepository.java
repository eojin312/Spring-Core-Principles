package ejlee.springcoreprinciples.repository;

import ejlee.springcoreprinciples.member.Member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
