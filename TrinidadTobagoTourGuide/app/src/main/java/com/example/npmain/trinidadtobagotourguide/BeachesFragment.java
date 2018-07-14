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
public class BeachesFragment extends Fragment
{

    // Required empty public constructor for Beaches Fragment
    public BeachesFragment()
    {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.list_view, container, false);
        initializeBeachesArray(rootView);
        return rootView;
    }

    // Initialize the UI of the Beaches Fragment
    private void initializeBeachesArray(View rootView)
    {
        List<TourItem> tourItems = new ArrayList<>();
        tourItems.add(new TourItem(R.drawable.beaches_las_cuevas_beach, getString(R.string.beaches_one)));
        tourItems.add(new TourItem(R.drawable.beaches_maracas_bay_beach, getString(R.string.beaches_two)));
        tourItems.add(new TourItem(R.drawable.beaches_pigeon_point_beach, getString(R.string.beaches_three)));
        tourItems.add(new TourItem(R.drawable.beaches_store_bay_beach, getString(R.string.beaches_four)));
        TourItemAdapter tourItemAdapter = new TourItemAdapter( getActivity(),tourItems);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(tourItemAdapter);
    }

}
