package ejlee.springcoreprinciples.discount;

import ejlee.springcoreprinciples.member.Member;

public interface DiscountPolicy {

    /**
     *
     * @param member
     * @param price
     * @return ν μΈλμ
     */
    int disCount(Member member, int price);
}
