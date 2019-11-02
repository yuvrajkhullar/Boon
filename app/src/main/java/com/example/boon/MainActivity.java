package com.example.boon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.boon.ui.main.ServicesFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view)
    {
        EditText mUser = (EditText)findViewById(R.id.email);
        EditText mPass = (EditText)findViewById(R.id.password);
        String userText = mUser.getText().toString();
        String passText = mPass.getText().toString();

        Intent i = new Intent(this, ActionScreen.class);

        if (userText.equals("test") && passText.equals("test123"))
        {
            startActivity(i);
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Incorrect Password",
                    Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void onClick2(View view)
    {
        Intent j = new Intent(this, Register2.class);
        startActivity(j);
    }
}
