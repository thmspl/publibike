package ch.phatec.publibike;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ch.phatec.publibike.entities.Station;

import java.util.List;

import org.junit.Test;

public class PublibikeServiceTest {

    private PublibikeService getPublibikeService() {
        return new PublibikeService();
    }

    @Test
    public void testGetStation() {
        final Long STATION_ID = 100L;
        PublibikeService service = getPublibikeService();

        Station station = service.getStation(STATION_ID);

        assertEquals(STATION_ID, station.getId());
    }

    @Test
    public void testGetStations() {
        PublibikeService service = getPublibikeService();
        List<Station> stations = service.getStations();

        assertTrue(stations.size() > 0);
    }
}
