package com.nickwelna.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

class LocationAdapter extends ArrayAdapter<Location> {


    public LocationAdapter(@NonNull Context context, @NonNull List<Location> objects) {

        super(context, 0, objects);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable final View convertView, @NonNull final ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {

            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        }

        final Location currentLocation = getItem(position);

        TextView name = listItemView.findViewById(R.id.name);
        name.setText(parent.getResources().getString(currentLocation.getName()));

        TextView description = listItemView.findViewById(R.id.description);
        description.setText(parent.getResources().getString(currentLocation.getDescription()));

        ImageView image = listItemView.findViewById(R.id.image);

        if (!currentLocation.hasLargeImage()) {

            image.setImageResource(currentLocation.getImageResourceId());

        } else {

            image.setVisibility(View.GONE);
            ImageView largeImage = listItemView.findViewById(R.id.largeImage);
            largeImage.setImageResource(currentLocation.getImageResourceId());
            largeImage.setVisibility(View.VISIBLE);

        }

        return listItemView;

    }

}
