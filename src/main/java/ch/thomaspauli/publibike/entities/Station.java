package ch.thomaspauli.publibike.entities;

import java.math.BigDecimal;
import java.util.List;

public class Station extends AbstractEntity {

    private BigDecimal latitude;

    private BigDecimal longitude;

    private String address;

    private String city;

    private String zip;

    private List<Vehicle> vehicles;

    private StationState state;

    private StationNetwork network;

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public StationState getState() {
        return state;
    }

    public void setState(StationState state) {
        this.state = state;
    }

    public StationNetwork getNetwork() {
        return network;
    }

    public void setNetwork(StationNetwork network) {
        this.network = network;
    }
}
