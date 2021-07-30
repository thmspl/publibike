package ch.phatec.publibike.entities;

import com.google.gson.annotations.SerializedName;

/**
 * {@link StationNetwork}
 * 
 * @author thomas pauli | phatec.ch
 */
public class StationNetwork extends AbstractEntity {

    @SerializedName("background_img")
    private String backgroundImg;

    @SerializedName("logo_img")
    private String logoImg;

    public String getBackgroundImg() {
        return backgroundImg;
    }

    public void setBackgroundImg(String backgroundImg) {
        this.backgroundImg = backgroundImg;
    }

    public String getLogoImg() {
        return logoImg;
    }

    public void setLogoImg(String logoImg) {
        this.logoImg = logoImg;
    }
}
