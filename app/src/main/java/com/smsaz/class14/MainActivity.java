package com.smsaz.class14;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewWordList;
    String[] myWords = new String[]{"apple", "mango", "banana", "orange", "grapes","apple", "mango", "banana", "orange", "grapes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewWordList = findViewById(R.id.recyclerViewWordList);
        recyclerViewWordList.setAdapter(new WordListAdapter(this, myWords));
        recyclerViewWordList.setLayoutManager(new LinearLayoutManager(this));
    }
}