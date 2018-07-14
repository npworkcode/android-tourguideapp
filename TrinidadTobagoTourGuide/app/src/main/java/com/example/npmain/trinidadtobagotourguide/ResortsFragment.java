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
public class ResortsFragment extends Fragment
{

    // Required empty public constructor for Resorts Fragment
    public ResortsFragment()
    {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.list_view, container, false);
        initializeResortsArray(rootView);
        return rootView;
    }

    // Initialize the Resorts Fragment UI
    private void initializeResortsArray(View rootView)
    {
        List<TourItem> tourItems = new ArrayList<>();
        tourItems.add(new TourItem(R.drawable.resorts_coco_reef_resort, getString(R.string.resorts_one)));
        tourItems.add(new TourItem(R.drawable.resorts_grafton_beach_resort, getString(R.string.resorts_two)));
        tourItems.add(new TourItem(R.drawable.resorts_hilton_resort, getString(R.string.resorts_three)));
        tourItems.add(new TourItem(R.drawable.resorts_hyatt_hotel_resort, getString(R.string.resorts_four)));
        TourItemAdapter tourItemAdapter = new TourItemAdapter(getActivity(), tourItems);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(tourItemAdapter);
    }
}
