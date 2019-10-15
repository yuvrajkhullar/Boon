package com.example.boon;

import android.os.Bundle;

import com.example.boon.ui.main.ServicesFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.boon.ui.main.SectionsPagerAdapter;

public class TabbedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //will create an instance state of the onCreate class
        setContentView(R.layout.activity_tabbed); //will set the screen to the corresponding xml file
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager()); //will create a sectionsPagerAdapter instance
        ViewPager viewPager = findViewById(R.id.view_pager); //will create a viewPager object
        viewPager.setAdapter(sectionsPagerAdapter); //calls the setAdapter method
        TabLayout tabs = findViewById(R.id.tabs); //creates an instance of TabLayout class
        tabs.setupWithViewPager(viewPager); //calls the setupWithViewPager method
        FloatingActionButton fab = findViewById(R.id.fab); //creates an instance of the FloatingActionButton class

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG) //calls the .make method with given parameters
                        .setAction("Action", null).show(); //will call the .setAction method without an object.
            }
        });
    }

}