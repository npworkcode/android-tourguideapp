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
public class DiningFragment extends Fragment
{

    // Required empty public constructor for Dining Fragment
    public DiningFragment()
    {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.list_view, container, false);
        initializeDiningArray(rootView);
        return rootView;
    }

    // Initialize the Dining Fragment UI
    private void initializeDiningArray(View rootView)
    {
        List<TourItem> tourItems = new ArrayList<>();
        tourItems.add(new TourItem(R.drawable.dining_chaud, getString(R.string.dining_one)));
        tourItems.add(new TourItem(R.drawable.dining_jaffa_at_the_oval, getString(R.string.dining_two)));
        tourItems.add(new TourItem(R.drawable.dining_kariwak_village_restaurant, getString(R.string.dining_three)));
        tourItems.add(new TourItem(R.drawable.dining_seahorse_inn, getString(R.string.dining_four)));
        TourItemAdapter tourItemAdapter = new TourItemAdapter( getActivity(),tourItems);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(tourItemAdapter);
    }
}
