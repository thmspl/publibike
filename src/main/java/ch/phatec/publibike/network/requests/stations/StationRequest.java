package ch.phatec.publibike.network.requests.stations;

import ch.phatec.publibike.entities.Station;

import ch.phatec.publibike.network.requests.Request;
import ch.phatec.publibike.network.utils.RequestType;
import ch.phatec.publibike.network.utils.UrlBuilder;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;

/**
 * {@link StationRequest}
 *
 * @author thomas pauli | powlee.ch
 */
public class StationRequest extends Request<Station> {

    // Station Id
    private final Long id;

    public StationRequest(Long id) {
        this.id = id;
    }

    /**
     * @see Request#getTargetClass()
     */
    @Override
    protected Class<Station> getTargetClass() {
        return Station.class;
    }

    /**
     * @see Request#getHttpRequest()
     */
    @Override
    protected HttpRequestBase getHttpRequest() {
        return new HttpGet(UrlBuilder.build(RequestType.STATION, this.id));
    }
}
