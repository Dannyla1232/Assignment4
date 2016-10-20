package com.example.cisc.assignment4;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
//FIX THE HIGH SCORE THING!!
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textScore;
    TextView textHighScore;
    private SoundPool soundpool;
    int sample1 = -1;
    SharedPreferences prefs;
    SharedPreferences.Editor editor;
    String dataName = "MyData";
    String intName = "MyInt";
    int defaultInt = 0;
    public static int hiScore=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonPlay = (Button) findViewById(R.id.buttonPlay);
        buttonPlay.setOnClickListener(this);
        textHighScore = (TextView) findViewById(R.id.textHighScore);
        textScore = (TextView) findViewById(R.id.textScore);

        textScore.setText("Latest Score: "+ GameActivity.currentScore);



        prefs = getSharedPreferences(dataName,MODE_PRIVATE);
        editor = prefs.edit();
        hiScore = prefs.getInt(intName, defaultInt);
        textHighScore.setText("High Score: "+ hiScore);

        if(GameActivity.currentScore > hiScore) {
            hiScore = GameActivity.currentScore;
            editor.putInt(intName, hiScore);
            editor.commit();
            Toast.makeText(getApplicationContext(),"new high score!",Toast.LENGTH_SHORT).show();
        }





        soundpool = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
        try {


            AssetManager assetsManager = getAssets();
            AssetFileDescriptor descriptor;

            descriptor = assetsManager.openFd("Start.wav");
            sample1 = soundpool.load(descriptor, 0);
        } catch (IOException e) {
            Context context = getApplicationContext();
            CharSequence text = "not found";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();


        }


    }

    @Override
    public void onClick(View v) {
        soundpool.play(sample1, 1, 1, 0, 0, 1);
        Intent i;
        i = new Intent(this, GameActivity.class);
        startActivity(i);


    }
}
