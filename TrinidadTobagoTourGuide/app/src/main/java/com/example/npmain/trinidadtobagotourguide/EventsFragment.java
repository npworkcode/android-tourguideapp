package com.example.npmain.trinidadtobagotourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventsFragment extends Fragment
{

    // Required empty public constructor for Events Fragment
    public EventsFragment()
    {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.list_view, container, false);
        initializeEventsArray(rootView);
        return rootView;
    }

    // Initialize UI for Events Fragment
    private void initializeEventsArray(View rootView)
    {
        List<TourItem> tourItems = new ArrayList<>();
        tourItems.add(new TourItem(R.drawable.events_santa_rosa_carib_festival, getString(R.string.events_one)));
        tourItems.add(new TourItem(R.drawable.events_tobago_heritage_festival, getString(R.string.events_two)));
        tourItems.add(new TourItem(R.drawable.events_trindad_carnival, getString(R.string.events_three)));
        tourItems.add(new TourItem(R.drawable.events_trinidad_panorama, getString(R.string.events_four)));
        TourItemAdapter tourItemAdapter = new TourItemAdapter( getActivity(),tourItems);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(tourItemAdapter);
    }

}
