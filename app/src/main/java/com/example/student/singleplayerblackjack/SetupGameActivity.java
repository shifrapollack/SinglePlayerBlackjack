package com.example.student.singleplayerblackjack;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;


public class SetupGameActivity extends Activity {
    LinearLayout layoutUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup_game);

        layoutUser = (LinearLayout) findViewById(R.id.layoutUserName);

        Intent intent = getIntent();
        String strNumPlayers = intent.getStringExtra("NUM_OF_PLAYERS");
        int numPlayers = Integer.parseInt(strNumPlayers);

        for(int i = 0; i < numPlayers; i++){
            LinearLayout layoutPlayersName = (LinearLayout) getLayoutInflater().inflate(R.layout.layout_user_name, null);
            layoutUser.addView(layoutPlayersName);
        }
    }

    public void continueGame(View view){
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }
}
