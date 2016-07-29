package com.example.rapsk.jumpstart;

/**
 * Created by junvir on 7/29/2016.
 */
public class Location {

    public double lat;
    public double mLong;
    public String address;

    public Location(double lat, double mLong, String address) {
        this.lat = lat;
        this.mLong = mLong;
        this.address = address;
    }

    public Location() {
    }
}
