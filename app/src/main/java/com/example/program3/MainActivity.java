package com.example.program3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private int teamOnePoints = 0, teamTwoPoints = 0;


    public void onSaveInstanceState(Bundle saved) {
        super.onSaveInstanceState(saved);
        saved.putInt("teamOnePoints", teamOnePoints);
        saved.putInt("teamTwoPoints", teamTwoPoints);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            teamOnePoints = savedInstanceState.getInt("teamOnePoints", -1);
            teamTwoPoints = savedInstanceState.getInt("teamTwoPoints", -1);
        }

        TextView teamOne = findViewById(R.id.firstTeamScore);
        TextView teamTwo = findViewById(R.id.secondTeamScore);

        teamOne.setText("Team 1 Score: " + teamOnePoints);
        teamTwo.setText("Team 2 Score: " + teamTwoPoints);

        Button teamOnePointOne = findViewById(R.id.BTNT1P1);
        teamOnePointOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamOnePoints++;
                TextView teamOne = findViewById(R.id.firstTeamScore);
                teamOne.setText("Team 1 Score: " + teamOnePoints);
            }
        });
        Button teamOnePointTwo = findViewById(R.id.BTNT1P2);
        teamOnePointTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamOnePoints += 2;
                TextView teamOne = findViewById(R.id.firstTeamScore);
                teamOne.setText("Team 1 Score: " + teamOnePoints);
            }
        });
        Button teamOnePointThree = findViewById(R.id.BTNT1P3);
        teamOnePointThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamOnePoints += 3;
                TextView teamOne = findViewById(R.id.firstTeamScore);
                teamOne.setText("Team 1 Score: " + teamOnePoints);
            }
        });
        Button teamTwoPointOne = findViewById(R.id.BTNT2P1);
        teamTwoPointOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamTwoPoints++;
                TextView teamTwo = findViewById(R.id.secondTeamScore);
                teamTwo.setText("Team 2 Score: " + teamTwoPoints);
            }
        });
        Button teamTwoPointTwo = findViewById(R.id.BTNT2P2);
        teamTwoPointTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamTwoPoints += 2;
                TextView teamTwo = findViewById(R.id.secondTeamScore);
                teamTwo.setText("Team 2 Score: " + teamTwoPoints);
            }
        });
        Button teamTwoPointThree = findViewById(R.id.BTNT2P3);
        teamTwoPointThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamTwoPoints += 3;
                TextView teamTwo = findViewById(R.id.secondTeamScore);
                teamTwo.setText("Team 2 Score: " + teamTwoPoints);
            }
        });
        Button resetButton = findViewById(R.id.resetButton);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamOnePoints = 0;
                teamTwoPoints = 0;
                TextView teamOne = findViewById(R.id.firstTeamScore);
                TextView teamTwo = findViewById(R.id.secondTeamScore);
                teamOne.setText("Team 1 Score: " + teamOnePoints);
                teamTwo.setText("Team 2 Score: " + teamTwoPoints);
            }
        });
    }
}

