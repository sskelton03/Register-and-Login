package com.example.register_stevenskelton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity implements View.OnClickListener {
    //Initialize button, textviews, and edittext that are used in activity_login
    Button ButtonRegister;
    EditText inputName, inputfamilyName, inputDOB, inputemail, inputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
//storing input data into it’s corresponding values.
        inputName = (EditText) findViewById(R.id.inputName);
        inputfamilyName = (EditText) findViewById(R.id.inputfamilyName);
        inputDOB = (EditText) findViewById(R.id.inputDOB);
        inputemail = (EditText) findViewById(R.id.inputemail);
        inputPassword = (EditText) findViewById(R.id.inputPassword);
        ButtonRegister = (Button) findViewById(R.id.ButtonRegister);

        ButtonRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ButtonRegister:
//validating input values entered by user
                if (inputName.length() == 0) {
                    inputName.setError("ENTER A VALUE");
                }
                if (inputfamilyName.length() == 0) {
                    inputfamilyName.setError("ENTER A VALUE");
                }
                if (inputDOB.length() == 0) {
                    inputDOB.setError("ENTER A VALUE");
                }
                if (inputemail.length() == 0) {
                    inputemail.setError("ENTER A VALUE");
                }
                if (inputPassword.length() == 0) {
                    inputPassword.setError("ENTER A VALUE");
                }
                if ((inputName.length() <= 2) || (inputName.length() >= 31)) {
                    inputName.setError("ENTER VALID NAME");
                }
                if(android.util.Patterns.EMAIL_ADDRESS.matcher(inputemail.getText() .toString()).matches()){
                    Toast.makeText(getApplicationContext(),"ENTERED SUCCESSFULLY!",Toast.LENGTH_LONG) .show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"PLEASE ENTER A VALID EMAIL ADDRESS!",Toast.LENGTH_LONG) .show();
                }
                break;

        }
    }
}

