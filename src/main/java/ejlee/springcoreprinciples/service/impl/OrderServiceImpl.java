package ejlee.springcoreprinciples.service.impl;

import ejlee.springcoreprinciples.discount.DiscountPolicy;
import ejlee.springcoreprinciples.discount.FixDiscountPolicy;
import ejlee.springcoreprinciples.discount.RateDiscountPolicy;
import ejlee.springcoreprinciples.member.Member;
import ejlee.springcoreprinciples.order.Order;
import ejlee.springcoreprinciples.repository.MemberRepository;
import ejlee.springcoreprinciples.repository.impl.MemoryMemberRepository;
import ejlee.springcoreprinciples.service.OrderService;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    // DIP 에 위반
    // 역할과 구현에 맞게 분리시켰는데 왜 ?
    // 해당 클레스는 구현 클레스에도 의존하고있기때문
    // 역할에만 의존해야하는데, 구현에도 의존중 new RateDiscountPolicy

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.disCount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
