package com.example.uiprog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        final Button gamesButton = new Button(this);
        gamesButton.setText("Hello, You've cliked " + score + " times on this button");
        gamesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = score +1;
                gamesButton.setText("Hello, You've cliked " + score + " times on this button");

            }
        });
        setContentView(gamesButton);

    }
}
