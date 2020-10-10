package ch.thomaspauli.publibike.network.requests;

import ch.thomaspauli.publibike.entities.Station;
import ch.thomaspauli.publibike.network.Request;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;

public class StationRequest extends Request<Station> {

    @Override
    protected Class<Station> getTargetClass() {
        return Station.class;
    }

    @Override
    protected HttpRequestBase getHttpRequest() {
        return new HttpGet("https://api.publibike.ch/v1/public/stations");
    }
}