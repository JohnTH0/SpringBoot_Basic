package core.plain_java.discount;

import core.plain_java.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);
}
