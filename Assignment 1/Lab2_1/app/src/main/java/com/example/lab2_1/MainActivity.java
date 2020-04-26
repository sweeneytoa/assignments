package com.example.lab2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] COUNTRIES = new String[] {
                "Slovakia", "Germany", "United States", "United Kindom", "Russia", "Italy", "Greece"
        };

        ListView myList = (ListView) findViewById(R.id.list_view);

        final ArrayAdapter<String> test;
        test = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, COUNTRIES);
        myList.setAdapter(test);
    }
}
