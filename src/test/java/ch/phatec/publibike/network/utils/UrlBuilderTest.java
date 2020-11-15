package ch.phatec.publibike.network.utils;

import org.junit.Test;

import java.net.URI;
import java.util.MissingFormatArgumentException;

import static org.junit.Assert.*;

public class UrlBuilderTest {

    @Test
    public void testStationUrlBuild() {
        final Integer STATION_ID = 100;
        final String EXPECTED_URL = "https://api.publibike.ch/v1/public/stations/100";

        URI url = UrlBuilder.build(RequestType.STATION, STATION_ID);

        assertNotNull(url);
        assertEquals(EXPECTED_URL, url.toString());
    }

    @Test
    public void testStationUrlBuild_withoutParameter() {
        try {
            UrlBuilder.build(RequestType.STATION);
        } catch (MissingFormatArgumentException e) {
            assertTrue(Boolean.TRUE);

            return;
        }

        fail("MissingFormatArgumentException should have been called!");
    }

    @Test
    public void testStationsUrlBuild() {
        final String EXPECTED_URL = "https://api.publibike.ch/v1/public/stations";

        URI url = UrlBuilder.build(RequestType.STATIONS);

        assertNotNull(url);
        assertEquals(EXPECTED_URL, url.toString());
    }
}
