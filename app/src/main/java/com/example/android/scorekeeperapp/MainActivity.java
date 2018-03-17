package com.example.android.scorekeeperapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeperapp.R;

public class MainActivity extends AppCompatActivity {
    int scoreFclion = 0;
    int scoreGiants = 0;
    int cornerFclion = 0;
    int cornerGiants = 0;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }

    /**
     * Increase the score for FC Lion by 1 point.
     */
    public void addOneScoreForFclion(View v) {
        scoreFclion = scoreFclion + 1;
        displayScoreForFclion(scoreFclion);
    }

    /**
     * Increase the corner for FC Lion by 1 point.
     */
    public void addOneCornerForFclion(View v) {
        cornerFclion = cornerFclion + 1;
        displayCornerForFclion(cornerFclion);
    }
    /**
     * Displays the given score for FC Lion.
     */
    public void displayScoreForFclion(int scoreFclion) {
        TextView scoreView = (TextView) findViewById(R.id.fclion_score);
        scoreView.setText(String.valueOf(scoreFclion));
    }

    /**
     * Displays the given corner for FC Lion.
     */
    public void displayCornerForFclion(int cornerFclion) {
        TextView scoreView = (TextView) findViewById(R.id.fclion_corner);
        scoreView.setText(String.valueOf(cornerFclion));
    }

    /**
     * Increase the score for Giants by 1 point.
     */
    public void addOneScoreForGiants(View v) {
        scoreGiants = scoreGiants + 1;
        displayScoreForGiants(scoreGiants);
    }

    /**
     * Increase the corner for Giants by 1 point.
     */
    public void addOneCornerForGiants(View v) {
        cornerGiants = cornerGiants + 1;
        displayCornerForGiants(cornerGiants);
    }
    /**
     * Displays the given score for Giants.
     */
    public void displayScoreForGiants(int scoreGiants) {
        TextView scoreView = (TextView) findViewById(R.id.giants_score);
        scoreView.setText(String.valueOf(scoreGiants));
    }

    /**
     * Displays the given corner for Giants.
     */
    public void displayCornerForGiants(int cornerGiants) {
        TextView scoreView = (TextView) findViewById(R.id.giants_corner);
        scoreView.setText(String.valueOf(cornerGiants));
    }

    public void resetScore(View v) {
        scoreFclion=0;
        scoreGiants=0;
        cornerFclion=0;
        cornerGiants=0;
        displayScoreForFclion(scoreFclion);
        displayScoreForGiants(scoreGiants);
        displayCornerForFclion(cornerFclion);
        displayCornerForGiants(cornerGiants);
    }

}
