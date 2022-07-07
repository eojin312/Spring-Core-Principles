package ejlee.springcoreprinciples.service.impl;

import ejlee.springcoreprinciples.discount.DiscountPolicy;
import ejlee.springcoreprinciples.discount.FixDiscountPolicy;
import ejlee.springcoreprinciples.member.Member;
import ejlee.springcoreprinciples.order.Order;
import ejlee.springcoreprinciples.repository.MemberRepository;
import ejlee.springcoreprinciples.repository.impl.MemoryMemberRepository;
import ejlee.springcoreprinciples.service.OrderService;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.disCount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
