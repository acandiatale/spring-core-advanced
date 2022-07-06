package spring.springcoreadvanced.springcoreadvanced.trace.template;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import spring.springcoreadvanced.springcoreadvanced.trace.template.core.AbstractTemplate;
import spring.springcoreadvanced.springcoreadvanced.trace.template.core.SubClassLogic1;
import spring.springcoreadvanced.springcoreadvanced.trace.template.core.SubClassLogic2;

@Slf4j
public class TemplateMethodTest {

    @Test
    void tempalteMethodV0() {
        logic1();
        logic2();
    }

    private void logic1() {
        long startTime = System.currentTimeMillis();
        // 비지니스 로직 실행
        log.info("비지니스 로직1 실행");
        // 비즈니스 로직 종료
        long entTime = System.currentTimeMillis();
        long result = entTime - startTime;
        log.info("resultTime={}", result);
    }

    private void logic2() {
        long startTime = System.currentTimeMillis();
        // 비지니스 로직 실행
        log.info("비지니스 로직2 실행");
        // 비즈니스 로직 종료
        long entTime = System.currentTimeMillis();
        long result = entTime - startTime;
        log.info("resultTime={}", result);
    }

    /**
     * 템플릿 메서드 패턴 적용
     */
    @Test
    void templateMethodV1() {
        AbstractTemplate template1 = new SubClassLogic1();
        template1.execute();

        AbstractTemplate template2 = new SubClassLogic2();
        template2.execute();
    }

    @Test
    void templateMethodV2() {
        AbstractTemplate template1 = new AbstractTemplate() {
            @Override
            protected void call() {
                log.info("비즈니스 로직1 실행");
            }
        };
        log.info("클래스 이름1 = {}", template1.getClass());
        template1.execute();

        AbstractTemplate template2 = new AbstractTemplate() {
            @Override
            protected void call() {
                log.info("비즈니스 로직2 실행");
            }
        };
        template2.execute();
        log.info("클래스 이름2 = {}", template1.getClass());
    }

}
