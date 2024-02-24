package com.example.bucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.os.Bundle;
import android.view.View;

public class ThingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things);

        RecyclerView thingsList = findViewById(R.id.recycler_view_things);

        RecyclerItem[] items = {
                new RecyclerItem("Drift", "To slide sideways in a JDM car in Japan", R.drawable.drift),
                new RecyclerItem("Surf", "To ride wildest waves at Banzai Pipeline", R.drawable.surfer),
                new RecyclerItem("Code", "To become a Senior Software Developer", R.drawable.code)
        };

        ItemAdapter thingsAdapter = new ItemAdapter(items);
        thingsList.setAdapter(thingsAdapter);

    }
}