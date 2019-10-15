package com.example.boon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;

import com.example.boon.ui.main.ServicesFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //will create an instance state of the onCreate method
        setContentView(R.layout.activity_main); //will set the screen to the layout file that this java file corresponds to it
    }

    public void onClick(View view)
    {
        Intent i = new Intent(this, ActionScreen.class); //creates an Intent for the button that will lead to the ActionScreen
        startActivity(i); //will start the activity above
    }

    public void onClick2(View view)
    {
        Intent j = new Intent(this, Register2.class); //creates an Intent for the button that will lead to the first Register screen
        startActivity(j); //will start the activity above
    }
}
