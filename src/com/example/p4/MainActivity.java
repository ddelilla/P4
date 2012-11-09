package com.example.p4;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button playButton = (Button) findViewById(R.id.play_button);
        Button highScoreButton = (Button) findViewById(R.id.high_score_button);
        highScoreButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                launchHighscores();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    protected void launchHighscores() {
        Intent i = new Intent(this, Highscores.class);
        startActivity(i);
    }
    
}

