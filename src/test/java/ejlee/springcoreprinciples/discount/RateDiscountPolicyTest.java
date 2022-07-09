package ejlee.springcoreprinciples.discount;

import ejlee.springcoreprinciples.member.Grade;
import ejlee.springcoreprinciples.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 되어야한다")
    void disCount() {

        Member member = new Member(1L, "memberVip", Grade.VIP);

        int discount = discountPolicy.disCount(member, 10000);
        Assertions.assertThat(discount).isEqualTo(1000);
    }
}
