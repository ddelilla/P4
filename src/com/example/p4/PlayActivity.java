package com.example.p4;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class PlayActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playscreen);
        
        Button mainMenuButton = (Button) findViewById(R.id.playscreen_main_menu_button);
        mainMenuButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToMainMenu();
            }
        });
    } 
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    protected void goToMainMenu() {
        finish();
    }
    
}

