package ch.thomaspauli.publibike;

import ch.thomaspauli.publibike.network.requests.StationsRequest;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        LOG.trace("Hello, World!");
        
        StationsRequest request = new StationsRequest();
        Arrays.stream(request.executeRequest()).forEach(station -> System.out.println(station.getName()));
    }
}
