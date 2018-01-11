package com.nickwelna.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SportsFragment extends Fragment {

    public SportsFragment() {

        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final List<Location> locations = new ArrayList<>();

        locations.add(new Location(R.string.xcel_energy_center, R.string.xcel_energy_center_description, R.drawable.xcel_energy_center_logo, R.string.xcel_energy_center_search_query));
        locations.add(new Location(R.string.chs_field, R.string.chs_field_description, R.drawable.chs_feild_logo, R.string.chs_field_search_query));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Location currentLocaton = locations.get(i);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(view.getResources().getString(R.string.maps_url) + view.getResources().getString(currentLocaton.getSearchQuery())));
                startActivity(intent);

            }

        });

        return rootView;
    }

}
