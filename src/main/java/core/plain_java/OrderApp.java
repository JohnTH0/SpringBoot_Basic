package core.plain_java;

import core.plain_java.member.Grade;
import core.plain_java.member.Member;
import core.plain_java.member.MemberService;
import core.plain_java.member.MemberServiceimpl;
import order.Order;
import order.OrderService;
import order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {

        MemberService memberService = new MemberServiceimpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "MemberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
        System.out.println("order.calculatePrice() = " + order.calculatePrice());
        
    }
}
