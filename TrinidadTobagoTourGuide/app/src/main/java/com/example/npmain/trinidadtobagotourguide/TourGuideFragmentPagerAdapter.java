package com.example.npmain.trinidadtobagotourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;




public class TourGuideFragmentPagerAdapter extends FragmentPagerAdapter
{
    private final String tabTitles[];
    private final static int PAGE_COUNT = 4;
    private final Context context;


    public TourGuideFragmentPagerAdapter(FragmentManager fm, Context context)
    {
        super(fm);
        this.context = context;
        tabTitles = new String[]{context.getString(R.string.category_beaches),
                                 context.getString(R.string.category_dining),
                                 context.getString(R.string.category_events),
                                 context.getString(R.string.category_resorts)};
    }

    @Override
    public int getCount()
    {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                return new BeachesFragment();
            case 1:
                return new DiningFragment();
            case 2:
                return new EventsFragment();
            case 3:
                return new ResortsFragment();
            default:
                return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position)
    {
        // Generate title based on the position of the tab
        if (position == 0)
        {
            return context.getString(R.string.category_beaches);
        }
        else if (position == 1)
        {
            return context.getString(R.string.category_dining);
        }
        else if (position == 2)
        {
            return context.getString(R.string.category_events);
        }
        else
        {
            return context.getString(R.string.category_resorts);
        }
    }
}
