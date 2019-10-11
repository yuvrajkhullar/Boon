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
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view)
    {
        Intent i = new Intent(this, ActionScreen.class);
        startActivity(i);
    }

    public void onClick2(View view)
    {
        Intent j = new Intent(this, Registration.class);
        startActivity(j);
    }
}
