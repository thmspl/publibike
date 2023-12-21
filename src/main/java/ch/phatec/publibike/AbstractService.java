package ch.phatec.publibike;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.slf4j.Logger;

/**
 * {@link AbstractService}
 *
 * @author thomas pauli | powlee.ch
 */
abstract class AbstractService {

    /**
     * Returns the given {@link Logger} instance.
     *
     * @return The given {@link Logger} instance.
     */
    abstract Logger getLogger();

    /**
     * Adds the given service call to the log as trace level.
     *
     * @param methodName The name of the method.
     * @param params The parameters of the method.
     */
    void logServiceCall(String methodName, Object... params) {
        getLogger().trace(
                String.format("Service call: %s / with params: %s",
                        methodName,
                        Arrays.stream(params).map(Object::toString).collect(Collectors.joining(","))));
   }
}
