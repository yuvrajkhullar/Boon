package com.example.boon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //will create an instance state of the onCreate method
        setContentView(R.layout.activity_registration); //will set the screen to the corresponding xml file
    }

    public void onClick3(View view)
    {
        Intent k = new Intent(this, MainActivity.class); //creates an Intent for the button that will lead to the MainActivity
        startActivity(k); //will start the activity above
    }

    public void onClick5(View view)
    {
        Intent k = new Intent(this, Register2.class); //creates an Intent for the button that will lead to the first Registration page
        startActivity(k); //will start the activity above
    }
}
