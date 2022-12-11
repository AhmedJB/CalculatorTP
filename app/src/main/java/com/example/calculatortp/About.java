package com.example.calculatortp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main2, menu);
        return true;
    }

    public void handleBack(View v){
        Intent i = new Intent(this,Main2Activity.class);
        startActivity(i);
        finish();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        Intent i;
                switch (id){
                    case R.id.action_about:
                        i = new Intent(this,About.class);
                        break;
                    default:
                        i = new Intent(this,Main2Activity.class);
                        break;
                };
        startActivity(i);
        finish();
        return false;
    }
}