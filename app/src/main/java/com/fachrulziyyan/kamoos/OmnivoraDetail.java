package com.fachrulziyyan.kamoos;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OmnivoraDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.omnivora_detail);

        // Ambil data dari Intent
        String title = getIntent().getStringExtra("title");
        String description = getIntent().getStringExtra("description");
        int imageResId = getIntent().getIntExtra("imageResId", -1);

        // Hubungkan dengan elemen layout
        TextView titleTextView = findViewById(R.id.animal_name);
        TextView descriptionTextView = findViewById(R.id.animal_description);
        ImageView imageView = findViewById(R.id.animal_image);

        // Set data ke elemen layout
        titleTextView.setText(title);
        descriptionTextView.setText(description);
        imageView.setImageResource(imageResId);
    }
}
