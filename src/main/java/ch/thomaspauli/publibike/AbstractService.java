package ch.thomaspauli.publibike;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.slf4j.Logger;

abstract class AbstractService {

    abstract Logger getLogger();

    public void logServiceCall(String methodName, Object... params) {
        getLogger().trace("Service call: " + methodName + " / with: " + Arrays.stream(params).map(Object::toString).collect(Collectors.joining(",")));
    }
}
