package com.s.liza.tourguideappgrandrapids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setCustomOnClickListener(R.id.hotel, HotelActivity.class);
        setCustomOnClickListener(R.id.cafes, CafesActivity.class);
        setCustomOnClickListener(R.id.top_attract, TopAttractionsActivity.class);
        setCustomOnClickListener(R.id.festivals, BreweriesActivity.class);
        setCustomOnClickListener(R.id.breweries, FestivalsActivity.class);
    }

    public void setCustomOnClickListener(int resourceID, final Class className) {
        View view = findViewById(resourceID);
        view.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), className);
                        startActivity(intent);
                }
                }
        );
    }
}
