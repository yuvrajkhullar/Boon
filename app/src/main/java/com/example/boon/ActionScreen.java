package com.example.boon;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.boon.ui.main.SectionsPagerAdapter;

public class ActionScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //will create an instance state of onCreate
        setContentView(R.layout.activity_action_screen); //will set the screen to the corresponding xml file
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager()); //will create a SectionsPagerAdapter instance with the given arguments
        ViewPager viewPager = findViewById(R.id.view_pager); //will create a ViewPager instance with the following parameters
        viewPager.setAdapter(sectionsPagerAdapter); //calls the setAdapter method on sectionsPagerAdapter
        TabLayout tabs = findViewById(R.id.tabs); //creates an instance of TabLayout class with the given parameters
        tabs.setupWithViewPager(viewPager); //calls the setupWithViewPager method with the viewPager parameter
    }
}