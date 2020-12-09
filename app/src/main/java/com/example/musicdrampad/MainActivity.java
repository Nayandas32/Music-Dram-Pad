package com.example.musicdrampad;

import androidx.appcompat.app.AppCompatActivity;


import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private SoundPool soundPool;


    private int sound1;
    private int sound2;
    private int sound3;
    private int sound4;
    private int sound5;
    private int sound6;
    private int sound7;
    private int sound8;
    private int sound9;
    private int sound00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();

            soundPool = new SoundPool.Builder()
                    .setMaxStreams(9)
                    .setAudioAttributes(audioAttributes)
                    .build();
        } else {
            soundPool = new SoundPool(6, AudioManager.STREAM_MUSIC, 0);
        }
        sound1 = soundPool.load(this, R.raw.sound1, 1);
        sound2 = soundPool.load(this, R.raw.sound2, 1);
        sound3 = soundPool.load(this, R.raw.sound3, 1);
        sound4 = soundPool.load(this, R.raw.sound4, 1);
        sound5 = soundPool.load(this, R.raw.sound5, 1);
        sound6 = soundPool.load(this, R.raw.sound6, 1);
        sound7 = soundPool.load(this, R.raw.sound7, 1);
        sound8 = soundPool.load(this, R.raw.sound8, 1);
        sound9 = soundPool.load(this, R.raw.sound9, 1);
    }





    @Override
    protected void onDestroy() {
        super.onDestroy();
        soundPool.release();
        soundPool = null;
    }

    public void play(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
                soundPool.play(sound6, 1, 1, 1, 0, 1);
                break;
            case R.id.btn2:
                soundPool.play(sound2, 1, 1, 0, 0, 1);
                break;
            case R.id.btn3:
                soundPool.play(sound3, 1, 1, 0, 0, 1);
                break;
            case R.id.btn4:
                soundPool.play(sound4, 1, 1, 0, 0, 1);
                break;
            case R.id.btn5:
                soundPool.play(sound5, 1, 1, 0, 0, 1);
                break;
            case R.id.btn6:
                soundPool.play(sound6, 1, 1, 0, 0, 1);
                break;
            case R.id.btn7:
                soundPool.play(sound7, 1, 1, 0, 0, 1);
                break;
            case R.id.btn8:
                soundPool.play(sound8, 1, 1, 0, 0, 1);
                break;
            case R.id.btn9:
                soundPool.play(sound9, 1, 1, 0, 0, 1);
                break;
        }

    }

}