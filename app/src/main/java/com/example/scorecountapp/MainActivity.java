package com.example.scorecountapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreForTeamA = 0;
    int scoreForTeamB = 0;

    private Button three_point_View_A,two_point_View_A,free_point_View_A;
    private Button resetBtn;
    private Button three_point_View_B,two_point_View_B,free_point_View_B;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayForTeamA(scoreForTeamA);
        three_point_View_A = findViewById(R.id.three_point_View_A);
        two_point_View_A = findViewById(R.id.two_point_View_A);
        free_point_View_A = findViewById(R.id.free_point_View_A);

        three_point_View_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreForTeamA = scoreForTeamA+3;
                displayForTeamA(scoreForTeamA);
            }
        });

        two_point_View_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreForTeamA = scoreForTeamA+2;
                displayForTeamA(scoreForTeamA);
            }
        });

        free_point_View_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreForTeamA = scoreForTeamA+1;
                displayForTeamA(scoreForTeamA);
            }
        });

        displayForTeamB(scoreForTeamB);
        three_point_View_B = findViewById(R.id.three_point_View_B);
        two_point_View_B = findViewById(R.id.two_point_View_B);
        free_point_View_B = findViewById(R.id.free_point_View_B);

        three_point_View_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreForTeamB = scoreForTeamB+3;
                displayForTeamB(scoreForTeamB);
            }
        });

        two_point_View_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreForTeamB = scoreForTeamB+2;
                displayForTeamB(scoreForTeamB);
            }
        });

        free_point_View_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreForTeamB = scoreForTeamB+1;
                displayForTeamB(scoreForTeamB);
            }
        });

        resetBtn = findViewById(R.id.resetBtn);
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreForTeamA = 0;
                scoreForTeamB = 0;
                displayForTeamA(scoreForTeamA);
                displayForTeamB(scoreForTeamB);
            }
        });

    }

    /*Display the given score of a teamA*/
    public void displayForTeamA(int score){
        TextView score_view = findViewById(R.id.scoreViewA);
        score_view.setText(String.valueOf(score));
    }

    /*Display the given score of a team_B*/
    public void displayForTeamB(int score){
        TextView score_view = findViewById(R.id.scoreViewB);
        score_view.setText(String.valueOf(score));
    }


}