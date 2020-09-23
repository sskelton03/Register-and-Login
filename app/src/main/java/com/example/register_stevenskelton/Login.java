package com.example.register_stevenskelton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity implements View.OnClickListener {
    Button ButtonLogin;
    EditText inputUsername, inputPassword;
    TextView DisplayLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        inputUsername = (EditText) findViewById(R.id.inputUsername);
        inputPassword = (EditText) findViewById(R.id.inputPassword);
        ButtonLogin = (Button) findViewById(R.id.ButtonLogin);
        DisplayLink = (TextView) findViewById(R.id.DisplayLink);
        ButtonLogin.setOnClickListener(this);
        DisplayLink.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.ButtonLogin:
                if (inputUsername.length() == 0) {
                    inputUsername.setError("ENTER A VALUE");
                }
                if (inputPassword.length() == 0) {
                    inputPassword.setError("ENTER A VALUE");
                }

                break;

            case R.id.DisplayLink:

                startActivity(new Intent(this, Register.class));
                if (inputUsername.length() == 0) {
                    inputUsername.setError("ENTER A VALUE");
                }
                if (inputPassword.length() == 0) {
                    inputPassword.setError("ENTER A VALUE");
                }
                break;
        }

    }
}