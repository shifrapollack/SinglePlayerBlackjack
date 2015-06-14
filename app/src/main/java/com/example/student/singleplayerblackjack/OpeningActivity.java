package com.example.student.singleplayerblackjack;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class OpeningActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening);
    }

    public void startGame(View view) {
        EditText etNumOfPlayers = (EditText) findViewById(R.id.etNumOfPlayers);
        String numPlayers = etNumOfPlayers.getText().toString();

        Intent intent = new Intent(this, SetupGameActivity.class);
        intent.putExtra("NUM_OF_PLAYERS", numPlayers);
        startActivity(intent);
    }

}