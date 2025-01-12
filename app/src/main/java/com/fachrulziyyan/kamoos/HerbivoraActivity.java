package com.fachrulziyyan.kamoos;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class HerbivoraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herbivora);

        // Initialize RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerViewHerbivora);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        HerbivoraAdapter adapter = new HerbivoraAdapter(this, getHerbivoraList()); // Context diberikan di sini
        recyclerView.setAdapter(adapter);

        // Initialize btnBack and set click listener
        ImageView btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(view -> {
            Intent intent = new Intent(HerbivoraActivity.this, TabActivity.class);
            startActivity(intent);
            finish();
        });
    }

    private List<HerbivoraItem> getHerbivoraList() {
        List<HerbivoraItem> list = new ArrayList<>();
        list.add(new HerbivoraItem("Sapi",null, R.drawable.sapi,R.raw.sapi));
        list.add(new HerbivoraItem("Kelinci",null, R.drawable.kelinci,R.raw.kelinci));
        list.add(new HerbivoraItem("Jerapah",null, R.drawable.jerapah,R.raw.jerapah));
        list.add(new HerbivoraItem("Kuda",null, R.drawable.kuda,R.raw.kuda));
        list.add(new HerbivoraItem("Kambing",null,R.drawable.kambing,R.raw.kambing));
        return list;
    }
}

