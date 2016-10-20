package com.example.cisc.assignment4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {

    Animation wobble;
   public static TextView textScore;
    Button button1;
    Button button2;
    Button button3;
    Random rand = new Random();
    int r = rand.nextInt(3)+1;
    int correctAnswer = r;
   public static int currentScore=0;
    int totalGuesses = 1;
    int reset = 0;
//global variable for score

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);


        button1 =(Button) findViewById(R.id.button1);
        button2 =(Button) findViewById(R.id.button2);
        button3 =(Button) findViewById(R.id.button3);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

        resetScore();

        textScore = (TextView) findViewById(R.id.textScore);

        wobble = AnimationUtils.loadAnimation(this, R.anim.wobble);





    }

    @Override
    public void onClick(View v) {

        int answerGiven;
        switch(v.getId())
        {

            case R.id.button1 :
                 answerGiven = Integer.parseInt(""+
                 button1.getText());

                if (answerGiven == correctAnswer)
                {
                 Toast.makeText(getApplicationContext(),"Good!",Toast.LENGTH_SHORT).show();
                    updateScore(totalGuesses);
                    Intent i;
                    i = new Intent(this, GameActivitylvl2.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Nope!",Toast.LENGTH_SHORT).show();
                    totalGuesses++;
                    button1.startAnimation(wobble);
                    button1.setVisibility(View.INVISIBLE);
                }

                break;
            case R.id.button2:
                answerGiven = Integer.parseInt(""+
                        button2.getText());
                if (answerGiven == correctAnswer)
                {
                    Toast.makeText(getApplicationContext(),"Good!",Toast.LENGTH_SHORT).show();
                    updateScore(totalGuesses);
                    Intent i;
                    i = new Intent(this, GameActivitylvl2.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Nope!",Toast.LENGTH_SHORT).show();
                    totalGuesses++;
                    button2.startAnimation(wobble);
                    button2.setVisibility(View.INVISIBLE);
                }

                break;
            case R.id.button3:
                answerGiven = Integer.parseInt(""+
                        button3.getText());

                if (answerGiven == correctAnswer)
                {
                    Toast.makeText(getApplicationContext(),"Good!",Toast.LENGTH_SHORT).show();
                    updateScore(totalGuesses);
                    Intent i;
                    i = new Intent(this, GameActivitylvl2.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Nope!",Toast.LENGTH_SHORT).show();
                    totalGuesses++;
                    button3.startAnimation(wobble);
                    button3.setVisibility(View.INVISIBLE);
                }

                break;
        }
    }

    static void updateScore(int totalGuesses) {
        if (totalGuesses == 1)
        {
            currentScore+=3;
            textScore.setText("Score: " + currentScore);
        }
        else if (totalGuesses == 2)
        {
            currentScore+=2;
            textScore.setText("Score: " + currentScore);
        }
        else
        {
            currentScore++;
            textScore.setText("Score: " + currentScore);
        }


    }


    int resetScore()
    {
        currentScore = reset;
        return currentScore;
    }
}
