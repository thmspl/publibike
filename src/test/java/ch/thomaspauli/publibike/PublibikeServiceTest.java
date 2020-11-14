package ch.thomaspauli.publibike;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import ch.thomaspauli.publibike.entities.Station;
import ch.thomaspauli.publibike.network.requests.stations.StationsRequest;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Ignore;
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

    @Test
    @Ignore
    public void testGetStations_withMockedData() {
        Station TEST_STATION_1 = new Station();
        TEST_STATION_1.setId(1L);
        TEST_STATION_1.setLatitude(BigDecimal.ONE);
        TEST_STATION_1.setLongitude(BigDecimal.TEN);

        Station TEST_STATION_2 = new Station();
        TEST_STATION_2.setId(2L);
        TEST_STATION_2.setLatitude(BigDecimal.TEN);
        TEST_STATION_2.setLongitude(BigDecimal.ONE);

        PublibikeService mockedService = mock(PublibikeService.class);
        StationsRequest stationsRequest = mock(StationsRequest.class);
        when(stationsRequest.executeRequest()).thenReturn(new Station[]{ TEST_STATION_1, TEST_STATION_2 });
        when(mockedService.getStationsRequest()).thenReturn(stationsRequest);

        List<Station> stations = mockedService.getStations();

        assertEquals(2, stations.size());

        Station station1 = stations.get(0);
        assertEquals(station1.getId(),          TEST_STATION_1.getId());
        assertEquals(station1.getLatitude(),    TEST_STATION_1.getLatitude());
        assertEquals(station1.getLongitude(),   TEST_STATION_1.getLongitude());

        Station station2 = stations.get(0);
        assertEquals(station2.getId(),          TEST_STATION_2.getId());
        assertEquals(station2.getLatitude(),    TEST_STATION_2.getLatitude());
        assertEquals(station2.getLongitude(),   TEST_STATION_2.getLongitude());
    }
}
