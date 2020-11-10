package ch.thomaspauli.publibike.entities;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

/**
 * {@link Vehicle}
 * 
 * @author thomas pauli | pauli.solutions
 */
public class Vehicle extends AbstractEntity {

    @SerializedName("ebike_battery_level")
    private BigDecimal ebikeBatteryLevel;

    private VehicleType type;

    public BigDecimal getEbikeBatteryLevel() {
        return ebikeBatteryLevel;
    }

    public void setEbikeBatteryLevel(BigDecimal ebikeBatteryLevel) {
        this.ebikeBatteryLevel = ebikeBatteryLevel;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }
}
