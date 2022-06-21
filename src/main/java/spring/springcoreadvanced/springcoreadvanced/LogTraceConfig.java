package spring.springcoreadvanced.springcoreadvanced;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.springcoreadvanced.springcoreadvanced.trace.logtrace.FieldLogTrace;
import spring.springcoreadvanced.springcoreadvanced.trace.logtrace.LogTrace;

@Configuration
public class LogTraceConfig {

    @Bean
    public LogTrace logTrace() {
        return new FieldLogTrace();
    }
}
