package ch.phatec.publibike.network.requests.stations;

import ch.phatec.publibike.entities.Station;

import ch.phatec.publibike.network.requests.Request;
import ch.phatec.publibike.network.utils.RequestType;
import ch.phatec.publibike.network.utils.UrlBuilder;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;

/**
 * {@link StationsRequest}
 *
 * @author thomas pauli | phatec.ch
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
