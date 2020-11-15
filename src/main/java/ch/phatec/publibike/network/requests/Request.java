package ch.phatec.publibike.network.requests;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpRequestBase;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * {@link Request}
 *
 * @author thomas pauli | phatec.ch
 */
public abstract class Request<E> {

    // logger
    private static final Logger LOG = LoggerFactory.getLogger(Request.class);

    /**
     * Returns the target return class for the {@link Request}.
     *
     * @return The target return class for the {@link Request}.
     */
    protected abstract Class<E> getTargetClass();

    /**
     * Returns the specific {@link HttpRequestBase} for the {@link Request}.
     *
     * @return The specific {@link HttpRequestBase} for the {@link Request}.
     */
    protected abstract HttpRequestBase getHttpRequest();

    /**
     * Executes the {@link Request} and returns the response as the given target class.
     *
     * @return The {@link Request} response as the given target class.
     */
    public E executeRequest() {

        try (final CloseableHttpClient client = HttpClients.createDefault()) {

            CloseableHttpResponse response = client.execute(getHttpRequest());

            BufferedReader rd = new BufferedReader
                (new InputStreamReader(
                    response.getEntity().getContent()));

            String line = null;
            StringBuilder sb = new StringBuilder();

            while ((line = rd.readLine()) != null) {
                sb.append(line);
            }

            return new Gson().fromJson(sb.toString(), getTargetClass());

        } catch (IOException e) {
            LOG.error("Request failed", e);
        }

        return null;
    }
}
