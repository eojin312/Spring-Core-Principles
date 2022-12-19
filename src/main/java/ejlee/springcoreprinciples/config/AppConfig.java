package ejlee.springcoreprinciples.config;

import ejlee.springcoreprinciples.discount.FixDiscountPolicy;
import ejlee.springcoreprinciples.repository.impl.MemoryMemberRepository;
import ejlee.springcoreprinciples.service.MemberService;
import ejlee.springcoreprinciples.service.OrderService;
import ejlee.springcoreprinciples.service.impl.MemberServiceImpl;
import ejlee.springcoreprinciples.service.impl.OrderServiceImpl;

// application 에 대한 환경구성은 여기서
public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
