package com.example.android.huntingtonhistorictour;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;

public class CardAdapter extends AdapterView {

    //This class is for creating CardView arrays.

    private String placeName;
    private String placeType;
    private int imageResourceID;
    private String placeDescription;
    private String shortAddress;
    private String longAddress;
    private String workingHoursOrPrice;
    private double longitude;
    private double latitude;
    private String phoneNumber;
    private String webPage;


    public Card(String name, String hookSentence, int imageResourceID, String description,
                String longAddress, String workingHoursOrPrice, double longitude, double latitude, String phone, String webpage){

        placeType = placeType;
        imageResourceID = imageResourceID;
        placeDescription = placeDescription;
        shortAddress = shortAddress;
        longAddress = longAddress;
        workingHoursOrPrice = workingHoursOrPrice;
        longitude = longitude;
        latitude = latitude;
        phoneNumber = phoneNumber;
        webPage = webpage;
    }

    public String getName() {
        return placeName;
    }

    public String getPlaceType() {
        return placeType;
    }

    public String getDescription() {
        return placeDescription;
    }

    public String getLongAddress() {
        return longitude;
    }

    public String getWorkingHoursOrPrice() {
        return workingHoursOrPrice;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public String getPhone() {
        return phoneNumber;
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
