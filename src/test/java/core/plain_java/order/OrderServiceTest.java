package core.plain_java.order;

import core.plain_java.member.Grade;
import core.plain_java.member.Member;
import core.plain_java.member.MemberService;
import core.plain_java.member.MemberServiceimpl;
import order.Order;
import order.OrderService;
import order.OrderServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService = new MemberServiceimpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberATest", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemATest", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
