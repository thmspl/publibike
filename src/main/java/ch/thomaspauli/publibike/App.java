package ch.thomaspauli.publibike;

import ch.thomaspauli.publibike.entities.Station;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

    private static final Logger LOG = LogManager.getLogger(App.class);

    public static void main(String[] args) {

        try (CloseableHttpClient client = HttpClients.createDefault()) {

            HttpGet request = new HttpGet("https://api.publibike.ch/v1/public/stations/332");

            CloseableHttpResponse response = client.execute(request);

            // Get the response
            BufferedReader rd = new BufferedReader
                (new InputStreamReader(
                    response.getEntity().getContent()));

            String line = null;
            StringBuilder sb = new StringBuilder();

            while ((line = rd.readLine()) != null) {
                sb.append(line);
            }

            Gson gson = new Gson();

            Station station = gson.fromJson(sb.toString(), Station.class);

            System.out.println(station.getId());

            /*Map<VehicleType, List<Vehicle>> vehicles = station.getVehicles().stream().collect(Collectors.groupingBy(
                Vehicle::getType));*/

        } catch (IOException e) {
            LOG.error(e);
        }
    }
}
