package spring.springcoreadvanced.springcoreadvanced.trace.logtrace;

import spring.springcoreadvanced.springcoreadvanced.trace.TraceStatus;

public interface LogTrace {

    TraceStatus begin(String message);

    void end(TraceStatus status);

    void exception(TraceStatus status, Exception e);

}
