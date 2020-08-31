package com.example.location.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.location.R;
import com.example.location.interfaces.OnItemClickListener;
import com.example.location.model.MuseumType;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    ArrayList<MuseumType> arr;
    private OnItemClickListener onItemClickListener;
    Context context;

    public CustomAdapter(ArrayList<MuseumType> arr, OnItemClickListener onItemClickListener) {
        this.arr = arr;
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.getDataBind(arr.get(position), holder.itemView.getContext());
    }

    @Override
    public int getItemCount() {
        return arr.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout bg;
        TextView title;
        TextView description;
        MuseumType museumType;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            bg = itemView.findViewById(R.id.background);
            description=itemView.findViewById(R.id.description);
            title=itemView.findViewById(R.id.title);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onItemClickListener.onItemClick(museumType);
                }
            });
        }

        public void getDataBind(MuseumType museumType, Context context) {
            this.museumType = museumType;
            title.setText(museumType.getName());
            description.setText(museumType.getDescription());
            bg.setBackground(context.getResources().getDrawable(museumType.getImage()));

        }
    }
}
