package com.example.bucketlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    private RecyclerItem[] items;  // Clone data from outside

    public ItemAdapter(RecyclerItem[] items) {
        this.items = items;
    }  // Get data from outside (where ItemAdapter is initiated)

    @Override
    public int getItemCount() {
        return items.length;
    }  // Get the number of items to place in the activity?

    @NonNull
    @Override
    public ItemAdapter.ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_layout, parent, false);
        return new ItemViewHolder(view);
    }  // Operation needed to know where to place an Item on the view of the activity

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ItemViewHolder holder, int position) {
        holder.bind(items[position]);
    }  // Bind data programmatically from Java code to XML layout

    static class ItemViewHolder extends RecyclerView.ViewHolder {
        // A single item layout view (clone from xml layout)
        private TextView nameTextView;
        private TextView descriptionTextView;
        private ImageView image;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            this.nameTextView = itemView.findViewById(R.id.thing_name);
            this.descriptionTextView = itemView.findViewById(R.id.thing_description);
            this.image = itemView.findViewById(R.id.thing_image);
        }  // Locate items of the view and assign to the clone

        public void bind(RecyclerItem item) {
            nameTextView.setText(item.name);
            descriptionTextView.setText(item.description);
            image.setImageResource(item.image);
        }  // Assign fields of the 'items[]' array to properties of the layout of the clone
    }

}
