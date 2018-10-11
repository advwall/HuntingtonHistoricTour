package com.example.android.huntingtonhistorictour;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;



public class HistoricDetailsActivity extends AppCompatActivity {

    private int imageID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_layout);

        Bundle bun = getIntent().getExtras();

        String name = bun.getString("NAME");
        String longAddress = bun.getString("LONG_ADDRESS");
        String shortAddress = bun.getString("SHORT_ADDRESS");
        String description = bun.getString("DESCRIPTION");
        imageID = bun.getInt("IMAGE_ID", imageID);
        String workHoursOrPrice = bun.getString("WORK_HOURS_OR_PRICE");
        String phone = bun.getString("PHONE");
        String webpage = bun.getString("WEBPAGE");
        double longitude = bun.getDouble("LONGITUDE");
        double latitude = bun.getDouble("LATITUDE");

        final Intent infoIntent = new Intent(HistoricDetailsActivity.this, com.example.android.huntingtonhistorictour.InformationFragment.class);
        final Intent mapIntent = new Intent(HistoricDetailsActivity.this, com.example.android.huntingtonhistorictour.MapNavigationFragment.class);

        Bundle bundle = new Bundle();

        bundle.putString("NAME", name);
        bundle.putString("LONG_ADDRESS", longAddress);
        bundle.putString("SHORT_ADDRESS", shortAddress);
        bundle.putString("DESCRIPTION", description);
        bundle.putInt("IMAGE_ID", imageID);
        bundle.putString("WORK_HOURS_OR_PRICE", workHoursOrPrice);
        bundle.putString("PHONE", phone);
        bundle.putString("WEBPAGE", webpage);
        bundle.putDouble("LONGITUDE", longitude);
        bundle.putDouble("LATITUDE", latitude);

        infoIntent.putExtras(bundle);
        mapIntent.putExtras(bundle);

        ViewPager viewPager = findViewById(R.id.viewpager);

        com.example.android.huntingtonhistorictour.SimpleFragmentPagerAdapter adapter = new com.example.android.huntingtonhistorictour.SimpleFragmentPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);


    }


}
