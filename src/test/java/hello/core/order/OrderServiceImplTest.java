package hello.core.order;

import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Grade;
import hello.core.member.MemoryMemberRepository;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Member;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class OrderServiceImplTest {

    @Test
    void createorder() {
//        MemoryMemberRepository memberRepository = new MemoryMemberRepository();
//        memberRepository.save(new Member(1L, "name", Grade.VIP));
//        OrderServiceImpl orderService = new OrderServiceImpl(memberRepository, new FixDiscountPolicy());
//        Order order = orderService.createOrder(1L, "itemA", 10000);
//        assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
