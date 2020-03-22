package com.ah.covid19.api.model;

public class Geography {
    private final float longitude;
    private final float lagitude;

    public Geography(float longitude, float lagitude) {
        this.longitude = longitude;
        this.lagitude = lagitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public float getLagitude() {
        return lagitude;
    }
}
