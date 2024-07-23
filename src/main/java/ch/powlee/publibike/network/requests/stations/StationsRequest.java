package ch.powlee.publibike.network.requests.stations;

import ch.powlee.publibike.entities.Station;

import ch.powlee.publibike.network.requests.Request;
import ch.powlee.publibike.network.utils.RequestType;
import ch.powlee.publibike.network.utils.UrlBuilder;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;

/**
 * {@link StationsRequest}
 *
 * @author thomas pauli | powlee.ch
 */
public class StationsRequest extends Request<Station[]> {

    /**
     * @see Request#getTargetClass()
     */
    @Override
    protected Class<Station[]> getTargetClass() { return Station[].class; }

    /**
     * @see Request#getHttpRequest()
     */
    @Override
    protected HttpRequestBase getHttpRequest() {
        return new HttpGet(UrlBuilder.build(RequestType.STATIONS));
    }
}
