package com.example.lenovo_25.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemListAdapter extends RecyclerView.Adapter<ItemListAdapter.ItemListHolder> {

    Context context;
    ArrayList<ImageResource> resources;

    public ItemListAdapter(Context context, ArrayList<ImageResource> resources) {
        this.context = context;
        this.resources = resources;
    }

    @NonNull
    @Override
    public ItemListAdapter.ItemListHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item,parent, false);
        return new ItemListHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemListAdapter.ItemListHolder holder, int i) {

        holder.imageView.setImageResource(resources.get(i).getImageResource());
        holder.textView.setText(resources.get(i).getImageName());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent var=new Intent(context , CapitalAlphabetActivity.class);
                context.startActivity(var);
            }
        });

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public  class ItemListHolder extends  RecyclerView.ViewHolder
    {  ImageView imageView;
        TextView textView;
        LinearLayout linearLayout;

        /// for efficient calling of control of student layout
        public ItemListHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.item_image);
            textView =(TextView) itemView.findViewById(R.id.item_text);
            linearLayout=itemView.findViewById(R.id.item_linearLayout);

        }

    }

}
