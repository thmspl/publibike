package ch.phatec.publibike;

import ch.phatec.publibike.entities.Station;
import ch.phatec.publibike.network.requests.stations.StationRequest;
import ch.phatec.publibike.network.requests.stations.StationsRequest;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * {@link PublibikeService}
 *
 * @author thomas pauli | powlee.ch
 */
public class PublibikeService extends AbstractService {

    // logger
    private static final Logger LOG = LoggerFactory.getLogger(PublibikeService.class);

    protected StationRequest getStationRequest(Long id) {
        return new StationRequest(id);
    }

    protected StationsRequest getStationsRequest() {
        return new StationsRequest();
    }

    /**
     * Returns the {@link Station} by the given id.
     *
     * @param id The id of the {@link Station} which should be returned.
     * @return The {@link Station} by the given id.
     */
    public Station getStation(Long id) {
        logServiceCall("getStation(Long)", id);

        return getStationRequest(id).executeRequest();
    }

    /**
     * Returns all existing {@link Station}s.
     *
     * @return All existing {@link Station}s.
     */
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
