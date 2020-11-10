package ch.thomaspauli.publibike.entities;

import java.math.BigDecimal;
import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * {@link Station}
 * 
 * @author thomas pauli | pauli.solutions
 */
public class Station extends AbstractEntity {

    @SerializedName("latitude")
    private BigDecimal latitude;

    @SerializedName("longitude")
    private BigDecimal longitude;

    @SerializedName("address")
    private String address;

    @SerializedName("city")
    private String city;

    @SerializedName("zip")
    private String zip;

    @SerializedName("vehicles")
    private List<Vehicle> vehicles;

    @SerializedName("state")
    private StationState state;

    @SerializedName("network")
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
