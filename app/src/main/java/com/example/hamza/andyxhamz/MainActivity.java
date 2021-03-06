package com.example.hamza.andyxhamz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android .widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button javaGButton = (Button) findViewById(R.id.javaGrund);
        javaGButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), JavaActivity.class));
            }
        });

        Button javaFButton = (Button) findViewById(R.id.javaForts);
        javaFButton.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v){
                startActivity(new Intent(getApplicationContext(),JavaFortsActivity.class));
            }
        });

        Button cPPButton = (Button) findViewById(R.id.cpp);
        cPPButton.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v){
                startActivity(new Intent(getApplicationContext(),CPPActivity.class));
            }
        });


        Button dbButton = (Button) findViewById(R.id.databas);
        dbButton.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v){
                startActivity(new Intent(getApplicationContext(),DatabasActivity.class));
            }
        });




    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
