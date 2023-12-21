package ch.phatec.publibike.entities;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * {@link Vehicle}
 * 
 * @author thomas pauli | powlee.ch
 */
public class Vehicle extends AbstractEntity {

    private static final Logger LOG = LoggerFactory.getLogger(Vehicle.class);

    @SerializedName("ebike_battery_level")
    private BigDecimal ebikeBatteryLevel;

    private VehicleType type;

    public BigDecimal getEbikeBatteryLevel() {
        if(!this.isEBike()) {
            LOG.warn("Trying to get the battery level of a non electric vehicle (#" + this.getId() + ")");
        }

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

    // ---- utils ----

    public Boolean isEBike() {
        return this.getType().getName().equals("E-Bike");
    }
}
