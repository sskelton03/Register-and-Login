package com.example.register_stevenskelton;

import android.content.Intent;
import android.os.Bundle;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;

import android.os.Handler;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

//Initialize button, textviews, and edittext that are used in activity_login
    Button ButtonLogin;
    TextView DisplayLink;
    EditText inputName, inputfamilyName, inputDOB, inputemail, inputPassword, inputUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//storing input data into it’s corresponding values.
        inputName = (EditText) findViewById(R.id.inputName);
        inputfamilyName = (EditText) findViewById(R.id.inputfamilyName);
        inputDOB = (EditText) findViewById(R.id.inputDOB);
        inputemail = (EditText) findViewById(R.id.inputemail);
        inputPassword = (EditText) findViewById(R.id.inputPassword);
        ButtonLogin = (Button) findViewById(R.id.ButtonLogin);
        DisplayLink = (TextView) findViewById(R.id.DisplayLink);
        inputUsername = (EditText) findViewById(R.id.inputUsername);
        DisplayLink.setOnClickListener(this);
        ButtonLogin.setOnClickListener(this);

    }
    //switch statements used to display login choices or register choices
    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.ButtonLogin:
                startActivity(new Intent(this, Login.class));
                if (inputUsername.length() == 0) {
                    inputUsername.setError("ENTER A VALUE");
                }
                if (inputPassword.length() == 0) {
                    inputPassword.setError("ENTER A VALUE");
                }
                break;

            case R.id.DisplayLink:

                startActivity(new Intent(this, Register.class));
                break;
            }
        }
    }