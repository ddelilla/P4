package com.example.p4;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Highscores extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highscores);
        /*Button playButton = (Button) findViewById(R.id.play_button);
        Button highScoreButton = (Button) findViewById(R.id.high_score_button);
        playButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.exit(1);
                launchHighscores();
            }
        });*/
        //finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    /*
    protected void launchHighscores() {
        Intent i = new Intent(this, Highscores.class);
        startActivity(i);
    }*/
    
}

