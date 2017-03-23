package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeam(int score, String team) {
        TextView scoreView;
        if (team.equals("A")) {
            scoreView = (TextView) findViewById(R.id.team_a_score);
        } else {
            scoreView = (TextView) findViewById(R.id.team_b_score);
        }

        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeam(View view) {
        if (view.getId() == R.id.team_a_3) {
            scoreTeamA = scoreTeamA + 3;
            displayForTeam(scoreTeamA, "A");
        } else {
            scoreTeamB = scoreTeamB + 3;
            displayForTeam(scoreTeamB, "B");

        }
    }

    public void addTwoForTeam(View view) {
        if (view.getId() == R.id.team_a_2) {
            scoreTeamA = scoreTeamA + 2;
            displayForTeam(scoreTeamA, "A");
        } else {
            scoreTeamB = scoreTeamB + 2;
            displayForTeam(scoreTeamB, "B");

        }
    }

    public void addFreeThrowForTeam(View view) {
        if (view.getId() == R.id.team_a_1) {
            scoreTeamA = scoreTeamA + 1;
            displayForTeam(scoreTeamA, "A");
        } else {
            scoreTeamB = scoreTeamB + 1;
            displayForTeam(scoreTeamB, "B");

        }
    }
}
