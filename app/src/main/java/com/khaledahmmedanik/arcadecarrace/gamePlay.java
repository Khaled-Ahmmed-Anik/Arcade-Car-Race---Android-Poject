package com.khaledahmmedanik.arcadecarrace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import java.util.Objects;

public class gamePlay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_play);
    }

    public  void Back(View view){
        Intent inten = new Intent(getApplicationContext(), StartAction.class);
        startActivity(inten);
    }
}