package hello.core.member;
import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MemberServiceTest {
    MemberService memberService;
    @BeforeEach
    public void berforeEach(){
        AppConfig appConfig=new AppConfig();
        memberService=appConfig.memberService();
    }
    @Test //회원가입 테스트
    void join(){
        //given
        Member member=new Member(1L, "memberA",Grade.VIP);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        //then 검증
        Assertions.assertThat(member).isEqualTo(findMember); //member가 findmember와 같냐

    }
}
