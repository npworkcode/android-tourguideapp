package com.example.npmain.trinidadtobagotourguide;

public class TourItem
{
    // Class to hold the Tour Item data
    private String tourItemDescription;     // Description of the tour item
    private int imageResourceId;            // Resource Id of the Image to display for the Tour item

    public TourItem(int imageResourceId, String tourItemDescription)
    {
        this.tourItemDescription = tourItemDescription;
        this.imageResourceId = imageResourceId;
    }

    public String getTourItemDescription()
    {
        return tourItemDescription;
    }

    public int getImageResourceId()
    {
        return imageResourceId;
    }
}
