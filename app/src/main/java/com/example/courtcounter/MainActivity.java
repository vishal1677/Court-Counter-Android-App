package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int TotalscoreA=0;
    int TotalscoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void  increaseby3(View view){
       TotalscoreA+=3;
       displayforA(TotalscoreA);
    }
    public void increaseby3B(View view){
        TotalscoreB+=3;
        displayforB(TotalscoreB);
    }
    public void increaseby2(View view){
        TotalscoreA+=2;
        displayforA(TotalscoreA);
    }
    public void increaseby2B( View view){
        TotalscoreB+=3;
        displayforB(TotalscoreB);
    }
    public void free(View view){
        TotalscoreA+=1;
        displayforA(TotalscoreA);
    }
    public void freeB( View view){
        TotalscoreB+=3;

        displayforB(TotalscoreB);
    }
    public void displayforA(int s){
        TextView scoreview = (TextView)findViewById(R.id.score);
        scoreview.setText(String.valueOf(s));
    }
    public void displayforB(int s){
        TextView scoreview= (TextView)findViewById(R.id.scoreB);
        scoreview.setText(String.valueOf(s));
    }
    public void ResetScore( View view)
    {
        TotalscoreA=0;
        TotalscoreB=0;
        displayforA(0);
        displayforB(0);
    }
}