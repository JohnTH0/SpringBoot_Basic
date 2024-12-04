package order;

import core.plain_java.discount.DiscountPolicy;
import core.plain_java.discount.FixDiscountPolicy;
import core.plain_java.member.Member;
import core.plain_java.member.MemberRepository;
import core.plain_java.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
