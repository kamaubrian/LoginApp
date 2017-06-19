package com.example.brian_kamau.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);

    }
    public void Login(View view){
        String user = username.getText().toString();
        String pass = password.getText().toString();

    }
}
