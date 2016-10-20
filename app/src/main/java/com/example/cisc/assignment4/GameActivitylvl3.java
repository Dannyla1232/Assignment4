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

public class GameActivitylvl3 extends AppCompatActivity implements View.OnClickListener {

    Animation wobble;
    TextView textScore;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;

    Random rand = new Random();
    int r = rand.nextInt(10) + 1;
    int correctAnswer = r;
    int totalGuesses = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_activitylvl3);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 =(Button) findViewById(R.id.button10);

        textScore = (TextView) findViewById(R.id.textScore);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);

        textScore.setText("Score: "+ GameActivity.currentScore);

        wobble = AnimationUtils.loadAnimation(this, R.anim.wobble);
    }

    @Override
    public void onClick(View v) {
        int answerGiven;
        switch (v.getId()) {

            case R.id.button1:
                answerGiven = Integer.parseInt("" +
                        button1.getText());

                if (answerGiven == correctAnswer) {
                    Toast.makeText(getApplicationContext(), "Good!", Toast.LENGTH_SHORT).show();
                    updateScore(totalGuesses);
                    Intent i;
                    i = new Intent(this, MainActivity.class);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "Nope!", Toast.LENGTH_SHORT).show();
                    totalGuesses++;
                    button1.startAnimation(wobble);
                    button1.setVisibility(View.INVISIBLE);
                }

                break;
            case R.id.button2:
                answerGiven = Integer.parseInt("" +
                        button2.getText());
                if (answerGiven == correctAnswer) {
                    Toast.makeText(getApplicationContext(), "Good!", Toast.LENGTH_SHORT).show();
                    updateScore(totalGuesses);
                    Intent i;
                    i = new Intent(this, MainActivity.class);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "Nope!", Toast.LENGTH_SHORT).show();
                    totalGuesses++;
                    button2.startAnimation(wobble);
                    button2.setVisibility(View.INVISIBLE);
                }

                break;
            case R.id.button3:
                answerGiven = Integer.parseInt("" +
                        button3.getText());

                if (answerGiven == correctAnswer) {
                    Toast.makeText(getApplicationContext(), "Good!", Toast.LENGTH_SHORT).show();
                    updateScore(totalGuesses);
                    Intent i;
                    i = new Intent(this, MainActivity.class);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "Nope!", Toast.LENGTH_SHORT).show();
                    totalGuesses++;
                    button3.startAnimation(wobble);
                    button3.setVisibility(View.INVISIBLE);
                }

                break;

            case R.id.button4:
                answerGiven = Integer.parseInt("" +
                        button4.getText());

                if (answerGiven == correctAnswer) {
                    Toast.makeText(getApplicationContext(), "Good!", Toast.LENGTH_SHORT).show();
                    updateScore(totalGuesses);
                    Intent i;
                    i = new Intent(this, MainActivity.class);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "Nope!", Toast.LENGTH_SHORT).show();
                    totalGuesses++;
                    button4.startAnimation(wobble);
                    button4.setVisibility(View.INVISIBLE);
                }

                break;

            case R.id.button5:
                answerGiven = Integer.parseInt("" +
                        button5.getText());

                if (answerGiven == correctAnswer) {
                    Toast.makeText(getApplicationContext(), "Good!", Toast.LENGTH_SHORT).show();
                    updateScore(totalGuesses);
                    Intent i;
                    i = new Intent(this, MainActivity.class);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "Nope!", Toast.LENGTH_SHORT).show();
                    totalGuesses++;
                    button5.startAnimation(wobble);
                    button5.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.button6:
                answerGiven = Integer.parseInt("" +
                        button6.getText());

                if (answerGiven == correctAnswer) {
                    Toast.makeText(getApplicationContext(), "Good!", Toast.LENGTH_SHORT).show();
                    updateScore(totalGuesses);
                    Intent i;
                    i = new Intent(this, MainActivity.class);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "Nope!", Toast.LENGTH_SHORT).show();
                    totalGuesses++;
                    button6.startAnimation(wobble);
                    button6.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.button7:
                answerGiven = Integer.parseInt("" +
                        button7.getText());

                if (answerGiven == correctAnswer) {
                    Toast.makeText(getApplicationContext(), "Good!", Toast.LENGTH_SHORT).show();
                    updateScore(totalGuesses);
                    Intent i;
                    i = new Intent(this, MainActivity.class);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "Nope!", Toast.LENGTH_SHORT).show();
                    totalGuesses++;
                    button7.startAnimation(wobble);
                    button7.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.button8:
                answerGiven = Integer.parseInt("" +
                        button8.getText());

                if (answerGiven == correctAnswer) {
                    Toast.makeText(getApplicationContext(), "Good!", Toast.LENGTH_SHORT).show();
                    updateScore(totalGuesses);
                    Intent i;
                    i = new Intent(this, MainActivity.class);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "Nope!", Toast.LENGTH_SHORT).show();
                    totalGuesses++;
                    button8.startAnimation(wobble);
                    button8.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.button9:
                answerGiven = Integer.parseInt("" +
                        button9.getText());

                if (answerGiven == correctAnswer) {
                    Toast.makeText(getApplicationContext(), "Good!", Toast.LENGTH_SHORT).show();
                    updateScore(totalGuesses);
                    Intent i;
                    i = new Intent(this, MainActivity.class);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "Nope!", Toast.LENGTH_SHORT).show();
                    totalGuesses++;
                    button9.startAnimation(wobble);
                    button9.setVisibility(View.INVISIBLE);
                }
                break;


            case R.id.button10:
                answerGiven = Integer.parseInt("" +
                        button10.getText());

                if (answerGiven == correctAnswer) {
                    Toast.makeText(getApplicationContext(), "Good!", Toast.LENGTH_SHORT).show();
                    updateScore(totalGuesses);
                    Intent i;
                    i = new Intent(this, MainActivity.class);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "Nope!", Toast.LENGTH_SHORT).show();
                    totalGuesses++;
                    button10.startAnimation(wobble);
                    button10.setVisibility(View.INVISIBLE);
                }
                break;

        }
    }
    void updateScore(int totalGuesses) {
        if (totalGuesses == 1) {
            GameActivity.currentScore += 10;
            GameActivity.textScore.setText("Score: " + GameActivity.currentScore);
        } else if (totalGuesses == 2) {
            GameActivity.currentScore += 9;
            GameActivity.textScore.setText("Score: " + GameActivity.currentScore);
        } else if (totalGuesses == 3) {
            GameActivity.currentScore += 8;
            GameActivity.textScore.setText("Score: " + GameActivity.currentScore);
        } else if (totalGuesses == 4) {
            GameActivity.currentScore += 7;
            GameActivity.textScore.setText("Score: " + GameActivity.currentScore);
        } else if (totalGuesses == 5) {
            GameActivity.currentScore += 6;
            GameActivity.textScore.setText("Score: " + GameActivity.currentScore);
        } else if (totalGuesses == 6) {
            GameActivity.currentScore += 5;
            GameActivity.textScore.setText("Score: " + GameActivity.currentScore);
        } else if (totalGuesses == 7) {
            GameActivity.currentScore += 4;
            GameActivity.textScore.setText("Score: " + GameActivity.currentScore);
        } else if (totalGuesses == 8) {
            GameActivity.currentScore += 3;
            GameActivity.textScore.setText("Score: " + GameActivity.currentScore);
        } else if (totalGuesses == 9) {
            GameActivity.currentScore += 2;
            GameActivity.textScore.setText("Score: " + GameActivity.currentScore);
        } else if (totalGuesses == 10) {
            GameActivity.currentScore += 1;
            GameActivity.textScore.setText("Score: " + GameActivity.currentScore);
        } else {
            GameActivity.currentScore += 0;
            GameActivity.textScore.setText("Score: " + GameActivity.currentScore);
        }
    }


}
