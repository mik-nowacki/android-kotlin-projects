package com.example.bucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private CardView cardViewThings;
    private CardView cardViewPlaces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardViewThings = findViewById(R.id.card_view_things);
        cardViewPlaces = findViewById(R.id.card_view_places);

        cardViewThings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thingsActivityIntent = new Intent(MainActivity.this, ThingsActivity.class);
                startActivity(thingsActivityIntent);
            }
        });
        cardViewPlaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent placesActivityIntent = new Intent(MainActivity.this, PlacesActivity.class);
                startActivity(placesActivityIntent);
            }
        });
    }
}