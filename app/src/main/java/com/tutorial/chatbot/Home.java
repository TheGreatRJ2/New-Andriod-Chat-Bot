package com.tutorial.chatbot;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final MediaPlayer musicMP = MediaPlayer.create(this, R.raw.back_music);

        Button sound = (Button) this.findViewById(R.id.soundBtn);

        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicMP.start();
            }
        });

    }
}
