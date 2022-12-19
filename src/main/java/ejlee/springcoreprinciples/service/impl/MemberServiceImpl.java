package ejlee.springcoreprinciples.service.impl;

import ejlee.springcoreprinciples.member.Member;
import ejlee.springcoreprinciples.repository.MemberRepository;
import ejlee.springcoreprinciples.service.MemberService;
import ejlee.springcoreprinciples.repository.impl.MemoryMemberRepository;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
