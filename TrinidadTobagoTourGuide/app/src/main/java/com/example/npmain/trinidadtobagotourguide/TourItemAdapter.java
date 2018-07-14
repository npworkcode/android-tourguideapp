package com.example.npmain.trinidadtobagotourguide;

import android.app.Activity;
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

public class TourItemAdapter extends ArrayAdapter<TourItem>
{
    // Class to handle ListView implementation of Tour Item fragments
    public TourItemAdapter(Activity context, List<TourItem> tourItems)
    {
        super(context, 0, tourItems);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View listItemView = convertView;
        ViewHolder holder;
        final Context context = getContext();
        final LayoutInflater layoutInflater = LayoutInflater.from(context);
        TourItem currentTourItem = getItem(position);
        if (listItemView == null)
        {
            listItemView = layoutInflater.inflate(R.layout.list_item, parent, false);
            holder = new ViewHolder();
            holder.storeTextView =  listItemView.findViewById(R.id.tour_item);
            holder.storeImageView = listItemView.findViewById(R.id.tour_item_image);
            listItemView.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) listItemView.getTag();
        }
        holder.storeTextView.setText(currentTourItem.getTourItemDescription());
        holder.storeImageView.setBackgroundResource(currentTourItem.getImageResourceId());
        return listItemView;
    }

    static class ViewHolder
    {
        private TextView storeTextView;
        private ImageView storeImageView;
    }
}
