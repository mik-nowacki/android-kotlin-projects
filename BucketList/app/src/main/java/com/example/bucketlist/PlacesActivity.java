package com.example.bucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);
        RecyclerView placesList = findViewById(R.id.recycler_view_places);
        RecyclerItem[] items = {
                new RecyclerItem("Tokyo", "To see JDM cars meetings and night drives", R.drawable.jdm),
                new RecyclerItem("Madeira", "To see beautiful Hawaii of Europe", R.drawable.madeira),
                new RecyclerItem("Trolltunga", "To see Fjords and rivers", R.drawable.fjords),
                new RecyclerItem("Uppsala", "He he", R.drawable.uppsala)
        };

        ItemAdapter placesAdapter = new ItemAdapter(items);
        placesList.setAdapter(placesAdapter);
    }
}