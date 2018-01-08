package com.nickwelna.tourguideapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Nick on 1/8/2018.
 */

class CategoryAdapter extends FragmentPagerAdapter {

    Context context;

    public CategoryAdapter(Context context, FragmentManager fm) {

        super(fm);
        this.context = context;

    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {

            case 0:
                return new MuseumsFragment();
            case 1:
                return new RestaurantsFragment();
            case 2:
                return new SportsFragment();
            default:
                return new ParksFragment();
        }

    }


    @Override
    public int getCount() {

        return 4;

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {


        switch (position) {

            case 0:
                return context.getString(R.string.category_museums);
            case 1:
                return context.getString(R.string.category_restaurants);
            case 2:
                return context.getString(R.string.category_sports);
            default:
                return context.getString(R.string.category_parks);
        }

    }
}
