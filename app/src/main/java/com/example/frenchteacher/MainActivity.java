package com.example.frenchteacher;

import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String Black = "noire";
    String Green = "verte";
    String Purple = "violette";
    String Red = "rouge";
    String Yellow = "Jaune";

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.txt);

        Button blackBtn = findViewById(R.id.black);
        Button greenBtn = findViewById(R.id.green);
        Button purpleBtn = findViewById(R.id.purple);
        Button redBtn = findViewById(R.id.red);
        Button yellowBtn = findViewById(R.id.yellow);

        blackBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
        purpleBtn.setOnClickListener(this);
        redBtn.setOnClickListener(this);
        yellowBtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        int id = view.getId();

        if (id == R.id.black) {
            startSound(R.raw.black);
            txt.setText(Black);
        } else if (id == R.id.green){
            startSound(R.raw.green);
            txt.setText(Green);
        }else if(id == R.id.purple) {
            startSound(R.raw.purple);
            txt.setText(Purple);
        }else if(id == R.id.red) {
            startSound(R.raw.red);
            txt.setText(Red);
        }else if(id == R.id.yellow) {
            startSound(R.raw.yellow);
            txt.setText(Yellow);
        }
    }

    private void startSound(int id){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, id);
        mediaPlayer.start();
    }
}