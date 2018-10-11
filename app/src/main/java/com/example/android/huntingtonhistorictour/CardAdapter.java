package com.example.android.huntingtonhistorictour;

import android.view.View;
import android.widget.Adapter;

public class CardAdapter {

    //This class is for creating CardView arrays.

    private String name;
    private String placeType;
    private String shortAddress;
    private int imageResourceID;
    private String description;
    private String longAddress;
    private String workingHoursOrPrice;
    private double longitude;
    private double latitude;
    private String phone;
    private String webPage;


    public String getName() {
        return name;
    }

    String getPlaceType() {
        return placeType;
    }

    public String getDescription() {
        return description;
    }

    public double getLongAddress() {
        return longitude;
    }

    String getWorkingHoursOrPrice() {
        return workingHoursOrPrice;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public String getPhone() {
        return webPage;
    }

    public String getWebPage() {
        return webPage;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    @Override
    public Adapter getAdapter() {
        return null;
    }

    @Override
    public void setAdapter(Adapter adapter) {

    }

    @Override
    public View getSelectedView() {
        return null;
    }

    @Override
    public void setSelection(int i) {

    }
}
