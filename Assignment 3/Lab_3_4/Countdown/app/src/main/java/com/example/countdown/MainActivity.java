package com.example.countdown;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    final static String EXTRA_MESSAGE = "time";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void startCountdown(View view){
        Intent start = new Intent(this, TimerCountdownActivity.class);
        EditText editText = (EditText)(findViewById(R.id.editTime));
        String time =  editText.getText().toString();
        start.putExtra(EXTRA_MESSAGE, time);
        startActivity(start);
    };


}