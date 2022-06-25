package spring.springcoreadvanced.springcoreadvanced.trace.hellotrace.logtrace;

import org.junit.jupiter.api.Test;
import spring.springcoreadvanced.springcoreadvanced.trace.TraceStatus;
import spring.springcoreadvanced.springcoreadvanced.trace.logtrace.FieldLogTrace;
import spring.springcoreadvanced.springcoreadvanced.trace.logtrace.ThreadLocalLogTrace;

public class ThreadLocalLogTraceTest {

    ThreadLocalLogTrace trace = new ThreadLocalLogTrace();

    @Test
    void begin_end_level2() {
        TraceStatus status1 = trace.begin("hello1");
        TraceStatus status2 = trace.begin("hello2");
        trace.end(status2);
        trace.end(status1);
    }

    @Test
    void begin_exception_level2() {
        TraceStatus status1 = trace.begin("hello1");
        TraceStatus status2 = trace.begin("hello2");
        trace.exception(status2, new IllegalStateException());
        trace.exception(status1, new IllegalStateException());
    }

}
