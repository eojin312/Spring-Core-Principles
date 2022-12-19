package ejlee.springcoreprinciples.discount;

import ejlee.springcoreprinciples.member.Grade;
import ejlee.springcoreprinciples.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 되어야한다")
    void disCount() {

        // given
        Member member = new Member(1L, "memberVip", Grade.VIP);

        // when
        int discount = discountPolicy.disCount(member, 10000);

        // then
        assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("VIP 가 아니면 할인 적용되지않아야한다")
    void vip_x() {
        Member member = new Member(1L, "memberBasic", Grade.BASIC);

        int discount = discountPolicy.disCount(member, 10000);
        assertThat(discount).isEqualTo(0);
        assertThat(discount).isNotEqualTo(1000);
    }
}
