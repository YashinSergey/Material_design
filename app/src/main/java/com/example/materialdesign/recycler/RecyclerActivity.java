package com.example.materialdesign.recycler;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.materialdesign.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {

   private RvAdapter adapter;
   private RecyclerView recyclerView;
   private List<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        list = new ArrayList<>();
        fillTheList(list);
        adapter = new RvAdapter(this, list);
        initRecyclerView(adapter);
    }

    private void initRecyclerView(RvAdapter adapter) {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private void fillTheList(ArrayList<String> list) {
        list.add("Mountain lake");
        list.add("Hills");
        list.add("New York city");
        list.add("Sea shore");
    }
}
