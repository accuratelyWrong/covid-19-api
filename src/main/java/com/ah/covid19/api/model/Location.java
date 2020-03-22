package com.ah.covid19.api.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Location {
    private final String country;
    private final String province;
    private final Geography geography;

    public Location(String country, String province, Geography geography) {
        this.country = country;
        this.province = province;
        this.geography = geography;
    }

    public String getCountry() {
        return country;
    }

    public String getProvince() {
        return province;
    }

    public Geography getGeography() {
        return geography;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Location location = (Location) o;

        return new EqualsBuilder()
                .append(country, location.country)
                .append(province, location.province)
                .append(geography, location.geography)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(country)
                .append(province)
                .append(geography)
                .toHashCode();
    }
}
