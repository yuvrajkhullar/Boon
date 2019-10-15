package com.example.boon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Register2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //will create an instance state of the onCreate method
        setContentView(R.layout.activity_register2); //will set the screen to the corresponding xml file
    }

    public void onClick4(View view)
    {
        Intent k = new Intent(this, Registration.class); //creates an Intent for the button that will lead to the second Registration class
        startActivity(k); //will start the activity above
    }
}
