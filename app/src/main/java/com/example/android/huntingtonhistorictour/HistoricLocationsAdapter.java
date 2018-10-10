package com.example.android.huntingtonhistorictour;

import android.widget.ArrayAdapter;

package com.example.android.tourguideapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import static android.support.v4.content.ContextCompat.startActivity;

/**
 * Created by Cansu on 10.04.2018.
 */

public class HistoricLocationsAdapter extends ArrayAdapter<HistoricLocations> {

    private Context context = getContext();

    public HistoricLocationsAdapter(Activity context, ArrayList<HistoricLocations> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        HistoricLocations currentHI = getItem(position);

        String name = currentHI.getNameOfPlace();
        String shortAddress = currentHI.getShortAddress();
        String longAddress = currentHI.getLongAddress();
        String description = currentHI.getDescription();
        String workingHoursOrPrice = currentHI.getWorkingHoursOrPrice();
        String phone = currentHI.getPhone();
        String webPage = currentHI.getWebPage();
        double longitude = currentHI.getLongitude();
        double latitude = currentHI.getLatitude();
        int imageID = currentHI.getImageResourceId();

        //Set texts and image to the list item:

        TextView placeName = listItemView.findViewById(R.id.place_name);
        placeName.setText(name);

        TextView placeAddress = listItemView.findViewById(R.id.place_address);
        placeAddress.setText(shortAddress);

        ImageView image = listItemView.findViewById(R.id.image);
        image.setImageResource(imageID);

        //Create an implicit intent to Details Activity which contains INFORMATION and MAP fragments:

        final Intent detailsIntent = new Intent(context, HistoricDetailsActivity.class);

        Bundle bun = new Bundle();

        bun.putString("NAME", name);
        bun.putString("LONG_ADDRESS", longAddress);
        bun.putString("SHORT_ADDRESS", shortAddress);
        bun.putString("DESCRIPTION", description);
        bun.putInt("IMAGE_ID", imageID);
        bun.putString("WORK_HOURS_OR_PRICE", workingHoursOrPrice);
        bun.putString("PHONE", phone);
        bun.putString("WEBPAGE", webPage);
        bun.putDouble("LONGITUDE", longitude);
        bun.putDouble("LATITUDE", latitude);

        detailsIntent.putExtras(bun);

        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                context.startActivity(detailsIntent);
            }
        });

        return listItemView;


    }


}
