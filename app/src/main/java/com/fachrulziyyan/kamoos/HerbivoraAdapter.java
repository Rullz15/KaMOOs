package com.fachrulziyyan.kamoos;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HerbivoraAdapter extends RecyclerView.Adapter<HerbivoraAdapter.ViewHolder> {

    private Context context;
    private List<HerbivoraItem> herbivoraList;

    public HerbivoraAdapter(Context context, List<HerbivoraItem> herbivoraList) {
        this.context = context;
        this.herbivoraList = herbivoraList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_herbivora, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        HerbivoraItem herbivoraItem = herbivoraList.get(position);
        holder.titleTextView.setText(herbivoraItem.getTitle());
        holder.imageView.setImageResource(herbivoraItem.getImageResId());

        // Event klik untuk membuka HerbivoraDetail
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, HerbivoraDetail.class);
            intent.putExtra("title", herbivoraItem.getTitle());
            intent.putExtra("description", herbivoraItem.getDescription());
            intent.putExtra("imageResId", herbivoraItem.getImageResId());
            intent.putExtra("soundResId", herbivoraItem.getSoundResId()); // Kirim data suara
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return herbivoraList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.tvTitleHerbivora);
            imageView = itemView.findViewById(R.id.imgHerbivora);
        }
    }
}

