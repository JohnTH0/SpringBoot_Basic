package core.plain_java;

import core.plain_java.member.Grade;
import core.plain_java.member.Member;
import core.plain_java.member.MemberService;
import core.plain_java.member.MemberServiceimpl;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceimpl();

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("member = " + member.getName());
        System.out.println("findMember = " + findMember.getName());
    }
}
