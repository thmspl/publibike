package ch.thomaspauli.publibike.network.requests.stations;

import ch.thomaspauli.publibike.entities.Station;

import ch.thomaspauli.publibike.network.requests.Request;
import ch.thomaspauli.publibike.network.utils.RequestType;
import ch.thomaspauli.publibike.network.utils.UrlBuilder;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;

public class StationRequest extends Request<Station> {

    // Station Id
    private final Long id;

    public StationRequest(Long id) {
        this.id = id;
    }

    @Override
    protected Class<Station> getTargetClass() {
        return Station.class;
    }

    @Override
    protected HttpRequestBase getHttpRequest() {
        return new HttpGet(UrlBuilder.build(RequestType.STATION, this.id));
    }
}
