package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE) //TYPE : class 레벨에 붙음
@Retention(RetentionPolicy.RUNTIME)
@Documented
//컴포넌트 스캔에 추가할것
public @interface MyIncludeComponent {
}
