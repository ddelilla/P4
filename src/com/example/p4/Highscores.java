package com.example.p4;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
//daniel comment
public class Highscores extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highscores);
        
        Button mainMenuButton = (Button) findViewById(R.id.main_menu_button);
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

