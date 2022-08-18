package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @ComponentScan: @Component 어노테이션으로 붙은 클래스를 스캔해서 @Bean으로 등록
 * basePackages: 지정된 패키지를 스캔 위치로 지정
 * basePackageClasses: 클래스의 패키지를 스캔 위치로 지정
 * excludeFilters: 스캔 제외 대상 클래스
 *
 * basePackages, basePackageClasses 미지정시 해당 @ComponentScan 클래스의 패키지를 위치로 지정
 * Spring Boot는 CoreApplication의 @SpringBootApplication 안에 @ComponentScan이 있어 자동으로 스캔위치가 지정된다
 */
@Configuration
@ComponentScan(
        basePackages = {"hello.core.discount", "hello.core.member", "hello.core.order"},
        basePackageClasses = AutoAppConfig.class,
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
