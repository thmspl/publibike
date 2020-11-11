package ch.thomaspauli.publibike.network.requests.stations;

import ch.thomaspauli.publibike.PublibikeService;
import ch.thomaspauli.publibike.entities.Station;
import org.junit.Test;
import org.mockito.Mockito;

public class StationRequestTest {


    @Test
    public void testStationRequest() {
        PublibikeService service = new PublibikeService();
        Station station = service.getStation(100L);
        station.getVehicles().forEach(vehicle -> System.out.println("#" + vehicle.getId() + "\t\t" + vehicle.getType().getName() + (vehicle.isEBike() ? " (" + vehicle.getEbikeBatteryLevel().intValue() + "%)" : "")));
    }

}
