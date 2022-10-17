package hello.autowired;

import hello.core.member.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;

import java.util.Optional;

public class AutowiredTest {

    @Test
    void AutowiredOption() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }

    static class TestBean {
        /* 스프링 빈이 없는 경우 호출x */
        @Autowired(required = false)
        public void setNoBean1(Member noBean1) {
            System.out.println("noBea1 = " + noBean1);
        }

        /* 스프링 빈이 없는 경우 null 처리 */
        @Autowired
        public void setNoBean2(@Nullable Member noBean2) {
            System.out.println("noBea2 = " + noBean2);
        }

        /* 스프링 빈이 없는 경우 Optional.empty 처리 */
        @Autowired
        public void setNoBean3(Optional<Member> noBean3) {
            System.out.println("noBea3 = " + noBean3);
        }
    }
}
