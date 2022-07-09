package ejlee.springcoreprinciples.service.impl;

import ejlee.springcoreprinciples.member.Grade;
import ejlee.springcoreprinciples.member.Member;
import ejlee.springcoreprinciples.order.Order;
import ejlee.springcoreprinciples.service.MemberService;
import ejlee.springcoreprinciples.service.OrderService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceImplTest {

    @Test
    void createOrder() {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 1000);

        System.out.println(order);

    }
}
