package spring.springcoreadvanced.springcoreadvanced.trace.template.core;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractTemplate {
    
    public void execute() {
        long startTime = System.currentTimeMillis();
        // 비지니스 로직 실행
        call();
        // 비즈니스 로직 종료
        long entTime = System.currentTimeMillis();
        long result = entTime - startTime;
        log.info("resultTime={}", result);
    }

    protected abstract void call();


}
