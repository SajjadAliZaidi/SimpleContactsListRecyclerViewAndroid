package com.smsaz.class14;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewWordList;

    List<Contact> contactList = new LinkedList<Contact>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactList.add(new Contact(R.drawable.babar_azam, "Babar Azam", "03001234567"));
        contactList.add(new Contact(R.drawable.imran_khan, "Imran Khan", "03001234567"));
        contactList.add(new Contact(R.drawable.inzamam_ul_haq, "Inzamam ul Haq", "03001234567"));
        contactList.add(new Contact(R.drawable.sarfaraz_ahmad, "Sarfaraz Ahmad", "03001234567"));
        contactList.add(new Contact(R.drawable.shaheen_afridi, "Shaheen Afridi", "03001234567"));
        contactList.add(new Contact(R.drawable.shahid_afridi, "Shahid Afridi", "03001234567"));
        contactList.add(new Contact(R.drawable.shoaib_akhtar, "Shoaib Akhtar", "03001234567"));

        Log.d("Contacts Size", "" + contactList.size());

        recyclerViewWordList = findViewById(R.id.recyclerViewWordList);
        recyclerViewWordList.setAdapter(new ContactListAdapter(this, contactList));
        recyclerViewWordList.setLayoutManager(new LinearLayoutManager(this));
    }
}