package ch.thomaspauli.publibike;

import ch.thomaspauli.publibike.network.requests.StationsRequest;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

    private static final Logger LOG = LogManager.getLogger(App.class);

    public static void main(String[] args) {

        StationsRequest request = new StationsRequest();
        Arrays.stream(request.executeRequest()).forEach(station -> System.out.println(station.getName()));
    }
}
