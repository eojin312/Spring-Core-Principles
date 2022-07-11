package ejlee.springcoreprinciples.discount;

import ejlee.springcoreprinciples.member.Grade;
import ejlee.springcoreprinciples.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 10000;

    @Override
    public int disCount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
