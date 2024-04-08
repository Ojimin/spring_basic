package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

//import static org.springframework.context.annotation.ComponentScan.*;
@Configuration
@ComponentScan(
        basePackages = "hello.core.member",
        excludeFilters = @ComponentScan.Filter(type= FilterType.ANNOTATION, classes
        = Configuration.class)) //filter: 이거를 제외하고 컴포넌트 스캔해라
public class AutoAppConfig {

    //수동빈 vs 자동빈
    @Bean(name = "memoryMemberRepository")
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
