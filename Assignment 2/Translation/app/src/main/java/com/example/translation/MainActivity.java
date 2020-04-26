package com.example.translation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        final TextView greetings = new TextView(this);
        greetings.setPadding(50,300,50,50);
        greetings.setTextSize(30);
        greetings.setGravity(1);

        LinearLayout generalLayout = new LinearLayout(this);
        generalLayout.setOrientation(LinearLayout.VERTICAL);

        // EditText to enter your first name
        final EditText editText = new EditText(this);
        editText.setHint("Enter your first name");


        // Grid to put the button for selecting the language
        LinearLayout firstRow = new LinearLayout(this);
        firstRow.setOrientation(LinearLayout.HORIZONTAL);
        firstRow.setGravity(1);
        LinearLayout secondRow = new LinearLayout(this);
        secondRow.setOrientation(LinearLayout.HORIZONTAL);
        secondRow.setGravity(1);

        //Creating the button for the grid
        final Button englishButton = new Button(this);
        englishButton.setText("English");
        englishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                greetings.setText("Hi " + editText.getText());
            }
        });
        final Button sverigeButton = new Button(this);
        sverigeButton.setText("Sverige");
        sverigeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                greetings.setText("Hejjsan " + editText.getText());
            }
        });
        final Button suomeksiButton = new Button(this);
        suomeksiButton.setText("Suomeksi");
        suomeksiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                greetings.setText("Terve " + editText.getText());
            }
        });
        final Button surpriseButton = new Button(this);
        surpriseButton.setText("Surprise");
        surpriseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                greetings.setText("Hola " + editText.getText());
            }
        });







        // putting each part of the app alltogether
        firstRow.addView(englishButton);
        firstRow.addView(sverigeButton);
        secondRow.addView(suomeksiButton);
        secondRow.addView(surpriseButton);

        generalLayout.addView(editText);
        generalLayout.addView(firstRow);
        generalLayout.addView(secondRow);
        generalLayout.addView(greetings);

        setContentView(generalLayout);
    }
}
