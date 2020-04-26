package com.example.animals;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView image1 = findViewById(R.id.image1);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer != null) mediaPlayer.release();
                ImageView image = findViewById(R.id.image1);
                Drawable imageName = image.getDrawable();
                if (imageName.getConstantState() == (ResourcesCompat.getDrawable(getResources(),R.drawable.bear, null).getConstantState())) {
                    playBear();
                }
                else{
                    playOwl();
                }
            }
        });

        ImageView image4 = findViewById(R.id.image4);
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer != null) mediaPlayer.release();
                ImageView image = findViewById(R.id.image4);
                Drawable imageName = image.getDrawable();
                if (imageName.getConstantState() == (ResourcesCompat.getDrawable(getResources(),R.drawable.lamb, null).getConstantState())) {
                    playLamb();
                }
                else{
                    playRougeGorge();
                }
            }
        });

        ImageView image2 = findViewById(R.id.image2);
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer != null) mediaPlayer.release();
                ImageView image = findViewById(R.id.image2);
                Drawable imageName = image.getDrawable();
                if (imageName.getConstantState() == (ResourcesCompat.getDrawable(getResources(),R.drawable.wolf, null).getConstantState())) {
                    playWolf();
                }
                else{
                    playPinson();
                }
            }
        });

        ImageView image3 = findViewById(R.id.image3);
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer != null) mediaPlayer.release();
                ImageView image = findViewById(R.id.image3);
                Drawable imageName = image.getDrawable();
                if (imageName.getConstantState() == (ResourcesCompat.getDrawable(getResources(),R.drawable.elephant, null).getConstantState())) {
                    playElephant();
                }
                else{
                    playWren();
                }
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.birds:
                ((ImageView)findViewById(R.id.image1)).setImageResource(R.drawable.huuhkaja);
                ((ImageView)findViewById(R.id.image2)).setImageResource(R.drawable.peippo);
                ((ImageView)findViewById(R.id.image3)).setImageResource(R.drawable.peukaloinen);
                ((ImageView)findViewById(R.id.image4)).setImageResource(R.drawable.punatulkku);
                return true;
            case R.id.mamals:
                ((ImageView)findViewById(R.id.image1)).setImageResource(R.drawable.bear);
                ((ImageView)findViewById(R.id.image2)).setImageResource(R.drawable.wolf);
                ((ImageView)findViewById(R.id.image3)).setImageResource(R.drawable.elephant);
                ((ImageView)findViewById(R.id.image4)).setImageResource(R.drawable.lamb);
                return true;
            default : return super.onOptionsItemSelected(item);

        }
    }


    MediaPlayer mediaPlayer;
    protected void playBear(){
        mediaPlayer = MediaPlayer.create(this,R.raw.bear);
        mediaPlayer.start();
    }

    protected void playOwl(){
        mediaPlayer = MediaPlayer.create(this,R.raw.huuhkaja_norther_eagle_owl);
        mediaPlayer.start();
    }

    protected void playWolf(){
        mediaPlayer = MediaPlayer.create(this,R.raw.wolf);
        mediaPlayer.start();
    }

    protected void playElephant(){
        mediaPlayer = MediaPlayer.create(this,R.raw.elephant);
        mediaPlayer.start();
    }

    protected void playLamb(){
        mediaPlayer = MediaPlayer.create(this,R.raw.lamb);
        mediaPlayer.start();
    }

    protected void playPinson(){
        mediaPlayer = MediaPlayer.create(this,R.raw.peippo_chaffinch);
        mediaPlayer.start();
    }

    protected void playWren(){
        mediaPlayer = MediaPlayer.create(this,R.raw.peukaloinen_wren);
        mediaPlayer.start();
    }

    protected void playRougeGorge(){
        mediaPlayer = MediaPlayer.create(this,R.raw.punatulkku_northern_bullfinch);
        mediaPlayer.start();
    }

}
