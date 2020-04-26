package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1 :
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new redfragmennt()).commit();
                break;
            case R.id.item2 :
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new bluefragmennt()).commit();
                break;
            case R.id.item3 :
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new greenfragmennt()).commit();
                break;
            case R.id.item4 :
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new yellowfragmennt()).commit();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
