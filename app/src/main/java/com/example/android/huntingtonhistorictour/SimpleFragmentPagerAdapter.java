package com.example.android.huntingtonhistorictour;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.huntingtonhistorictour.fragments.MapNavigationFragment;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] { "INFORMATION", "MAP"};

    public SimpleFragmentPagerAdapter (FragmentManager fm){

        super(fm);
    }

    @Override

    public Fragment getItem(int position) {

        if (position == 0) {

            return new com.example.android.huntingtonhistorictour.InformationFragment();

        } else {

            return new MapNavigationFragment();

        }

    }

    @Override

    public int getCount() {

        return 2;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
