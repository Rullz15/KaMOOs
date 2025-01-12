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

public class OmnivoraAdapter extends RecyclerView.Adapter<OmnivoraAdapter.ViewHolder> {

    private Context context;
    private List<OmnivoraItem> omnivoraList;

    public OmnivoraAdapter(Context context, List<OmnivoraItem> omnivoraList) {
        this.context = context;
        this.omnivoraList = omnivoraList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_omnivora, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        OmnivoraItem omnivoraItem = omnivoraList.get(position);
        holder.titleTextView.setText(omnivoraItem.getTitle());
        holder.imageView.setImageResource(omnivoraItem.getImageResId());

        // Event klik untuk membuka OmnivoraDetail
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, OmnivoraDetail.class);
            intent.putExtra("title", omnivoraItem.getTitle());
            intent.putExtra("description", omnivoraItem.getDescription());
            intent.putExtra("imageResId", omnivoraItem.getImageResId());
            intent.putExtra("soundResId", omnivoraItem.getSoundResId()); // Kirim data suara
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return omnivoraList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.tvTitleOmnivora);
            imageView = itemView.findViewById(R.id.imgOmnivora);
        }
    }
}
