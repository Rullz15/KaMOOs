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

public class OmnivoraAdapter extends RecyclerView.Adapter<OmnivoraAdapter.OmnivoraViewHolder> {

    private List<OmnivoraItem> itemList;
    private Context context;

    public OmnivoraAdapter(Context context, List<OmnivoraItem> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public OmnivoraViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_omnivora, parent, false);
        return new OmnivoraViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OmnivoraViewHolder holder, int position) {
        OmnivoraItem item = itemList.get(position);

        // Potong deskripsi menjadi satu paragraf dan tambahkan teks "Lihat Selengkapnya"
        String fullDescription = item.getDescription();
        String shortDescription = fullDescription.split("\\.")[0] + "... Lihat Selengkapnya";

        holder.titleTextView.setText(item.getTitle());
        holder.descriptionTextView.setText(shortDescription);
        holder.imageView.setImageResource(item.getImageResId());

        // Tambahkan OnClickListener ke MaterialCardView
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, OmnivoraDetail.class);
            intent.putExtra("title", item.getTitle());
            intent.putExtra("description", fullDescription); // Kirim deskripsi lengkap
            intent.putExtra("imageResId", item.getImageResId());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public static class OmnivoraViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView, descriptionTextView;
        ImageView imageView;

        public OmnivoraViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.tvTitleOmnivora);
            descriptionTextView = itemView.findViewById(R.id.tvDescOmnivora);
            imageView = itemView.findViewById(R.id.imgOmnivora);
        }
    }
}
