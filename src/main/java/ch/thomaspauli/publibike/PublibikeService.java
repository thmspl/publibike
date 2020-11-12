package ch.thomaspauli.publibike;

import ch.thomaspauli.publibike.entities.Station;

import ch.thomaspauli.publibike.network.requests.stations.StationRequest;
import ch.thomaspauli.publibike.network.requests.stations.StationsRequest;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PublibikeService extends AbstractService {

    // logger
    private static final Logger LOG = LoggerFactory.getLogger(PublibikeService.class);

    protected StationRequest getStationRequest(Long id) {
        return new StationRequest(id);
    }

    protected StationsRequest getStationsRequest() {
        return new StationsRequest();
    }

    public Station getStation(Long id) {
        logServiceCall("getStation(Long)", id);

        return getStationRequest(id).executeRequest();
    }

    public List<Station> getStations() {
        logServiceCall("getStations()");

        return Arrays.asList(getStationsRequest().executeRequest());
    }

    /**
     * @see AbstractService#getLogger()
     */
    @Override
    Logger getLogger() {
        return LOG;
    }
}
