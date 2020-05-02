package com.example.footballscorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalOfTeamA = 0,foulOfTeamA = 0, goalOfTeamB = 0,foulOfTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addOnegoalA(View v){
        goalOfTeamA = goalOfTeamA + 1;
        displayScoreA(goalOfTeamA);
    }
    public void addOnefoulA(View v){
        foulOfTeamA = foulOfTeamA + 1;
        displayFoulA(foulOfTeamA);
    }
    private void displayScoreA(int number){
        TextView score = (TextView) findViewById(R.id.team_a_score);
        score.setText("" + number);
    }
    private void displayFoulA(int number){
        TextView score = (TextView) findViewById(R.id.team_a_fouls);
        score.setText("" + number);
    }
    public void addOnegoalB(View v){
        goalOfTeamB = goalOfTeamB + 1;
        displayScoreB(goalOfTeamB);
    }
    public void addOnefoulB(View v){
        foulOfTeamB = foulOfTeamB + 1;
        displayFoulB(foulOfTeamB);
    }
    private void displayScoreB(int number){
        TextView score = (TextView) findViewById(R.id.team_b_score);
        score.setText("" + number);
    }
    private void displayFoulB(int number){
        TextView score = (TextView) findViewById(R.id.team_b_fouls);
        score.setText("" + number);
    }
    public void resetScore(View v){
        goalOfTeamA = 0;foulOfTeamA = 0;goalOfTeamB = 0;foulOfTeamB = 0;
        displayScoreA(goalOfTeamA);
        displayFoulA(foulOfTeamA);
        displayScoreB(goalOfTeamB);
        displayFoulB(foulOfTeamB);
    }
}
