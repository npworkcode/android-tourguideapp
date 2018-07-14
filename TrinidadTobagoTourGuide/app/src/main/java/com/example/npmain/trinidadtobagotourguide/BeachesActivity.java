package com.example.npmain.trinidadtobagotourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BeachesActivity extends AppCompatActivity
{

    // Activity for the Beaches Fragment
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourcategory);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new BeachesFragment())
                .commit();
    }
}
