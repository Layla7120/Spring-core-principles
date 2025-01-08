package hello.core.discount;

import hello.core.member.Member;

import java.math.BigDecimal;

public interface DiscountPolicy {

    int discount(Member member, int price);


}
