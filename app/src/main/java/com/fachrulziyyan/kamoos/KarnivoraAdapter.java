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

public class KarnivoraAdapter extends RecyclerView.Adapter<KarnivoraAdapter.ViewHolder> {

    private Context context;
    private List<KarnivoraItem> karnivoraList;

    public KarnivoraAdapter(Context context, List<KarnivoraItem> karnivoraList) {
        this.context = context;
        this.karnivoraList = karnivoraList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_karnivora, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        KarnivoraItem karnivoraItem = karnivoraList.get(position);
        holder.titleTextView.setText(karnivoraItem.getTitle());
        holder.imageView.setImageResource(karnivoraItem.getImageResId());

        // Event klik untuk membuka KarnivoraDetail
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, KarnivoraDetail.class);
            intent.putExtra("title", karnivoraItem.getTitle());
            intent.putExtra("description", karnivoraItem.getDescription());
            intent.putExtra("imageResId", karnivoraItem.getImageResId());
            intent.putExtra("soundResId", karnivoraItem.getSoundResId()); // Kirim data suara
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return karnivoraList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.tvTitleKarnivora);
            imageView = itemView.findViewById(R.id.imgKarnivora);
        }
    }
}

