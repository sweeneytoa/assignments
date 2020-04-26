package com.example.countdown;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TimerCountdownActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timer_countdown);

        Intent startIntent = getIntent();
        String timeString = startIntent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        final TextView textView = findViewById(R.id.timerTime);
        textView.setText(timeString);

        Integer timeInt = Integer.parseInt(timeString)*1000;
        int time = timeInt;

        new CountDownTimer(time, 1000) {

            public void onTick(long millisUntilFinished) {
                textView.setText("" + millisUntilFinished / 1000);
            }

            public void onFinish() {
                textView.setText("ALARM, WAKE UPPP AND SHINE!");
                playBip();
            }


        }.start();


    }

    protected void playBip(){
        mediaPlayer = MediaPlayer.create(this, R.raw.bip1);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);

    }

    protected void stopBip(){
        if(mediaPlayer.isLooping()){
            mediaPlayer.setLooping(false);
            mediaPlayer.stop();
            mediaPlayer.release();
        }
    }

    @Override
    public void onBackPressed() {
        stopBip();
        finish();
    }
}