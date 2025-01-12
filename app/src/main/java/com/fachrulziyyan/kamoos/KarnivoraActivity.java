package com.fachrulziyyan.kamoos;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class KarnivoraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karnivora);

        // Initialize RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerViewKarnivora);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        KarnivoraAdapter adapter = new KarnivoraAdapter(this, getKarnivoraList()); // Context diberikan di sini
        recyclerView.setAdapter(adapter);

        // Initialize btnBack and set click listener
        ImageView btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(view -> {
            Intent intent = new Intent(KarnivoraActivity.this, TabActivity.class);
            startActivity(intent);
            finish();
        });
    }

    private List<KarnivoraItem> getKarnivoraList() {
        List<KarnivoraItem> list = new ArrayList<>();
        list.add(new KarnivoraItem("Singa",null, R.drawable.singa,R.raw.singa));
        list.add(new KarnivoraItem("Beruang",null, R.drawable.beruang,R.raw.beruang));
        list.add(new KarnivoraItem("Orca",null, R.drawable.orca,R.raw.orca));
        list.add(new KarnivoraItem("Cheetah",null, R.drawable.cheetah,R.raw.cheetah));
        list.add(new KarnivoraItem("Harimau",null,R.drawable.harimau,R.raw.harimau));
        return list;
    }
}

