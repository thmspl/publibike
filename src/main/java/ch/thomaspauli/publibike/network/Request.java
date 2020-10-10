package ch.thomaspauli.publibike.network;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Request<E> {

    private static final Logger LOG = LogManager.getLogger(Request.class);

    /**
     *
     * @return
     */
    protected abstract Class<E> getTargetClass();

    /**
     *
     * @return
     */
    public abstract HttpRequestBase getHttpRequest();

    /**
     *
     * @return
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
            LOG.error(e);
        }

        return null;
    }
}
