package com.fachrulziyyan.kamoos;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HerbivoraDetail extends AppCompatActivity {

    private MediaPlayer mediaPlayer; // MediaPlayer untuk memutar suara
    private boolean isPlaying = false; // Status apakah suara sedang dimainkan

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herbivora_detail);

        // Ambil data dari Intent
        String title = getIntent().getStringExtra("title");
        String description = getIntent().getStringExtra("description");
        int imageResId = getIntent().getIntExtra("imageResId", -1);
        int soundResId = getIntent().getIntExtra("soundResId", -1);

        // Hubungkan elemen layout
        TextView titleTextView = findViewById(R.id.animal_name);
        TextView descriptionTextView = findViewById(R.id.animal_description);
        ImageView imageView = findViewById(R.id.animal_image);
        Button playSoundButton = findViewById(R.id.play_sound_button);
        ImageView backButton = findViewById(R.id.ic_back); // Tombol Back

        // Set data ke elemen layout
        titleTextView.setText(title);
        descriptionTextView.setText(description);
        imageView.setImageResource(imageResId);

        // Event listener untuk tombol Play
        playSoundButton.setOnClickListener(v -> {
            if (soundResId != -1) {
                if (isPlaying) {
                    // Jika sedang bermain, hentikan suara
                    if (mediaPlayer != null) {
                        mediaPlayer.pause();
                        mediaPlayer.seekTo(0); // Reset ke awal suara
                    }
                    playSoundButton.setText("Play");
                } else {
                    // Jika tidak bermain, mulai memutar suara
                    if (mediaPlayer == null) {
                        mediaPlayer = MediaPlayer.create(this, soundResId);
                    }
                    mediaPlayer.start();
                    playSoundButton.setText("Stop");
                }
                isPlaying = !isPlaying; // Toggle status
            }
        });

        // Event listener untuk tombol Back
        backButton.setOnClickListener(v -> {
            finish(); // Kembali ke aktivitas sebelumnya
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}

