package ejlee.springcoreprinciples.discount;

import ejlee.springcoreprinciples.member.Member;

public interface DiscountPolicy {

    /**
     *
     * @param member
     * @param price
     * @return 할인대상
     */
    int disCount(Member member, int price);
}
