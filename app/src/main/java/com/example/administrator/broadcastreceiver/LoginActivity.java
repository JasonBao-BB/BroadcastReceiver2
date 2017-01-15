package com.example.administrator.broadcastreceiver;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends BaseACtivity implements View.OnClickListener {

    private Button login;
    private EditText account;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (Button) findViewById(R.id.button);
        account = (EditText) findViewById(R.id.account);
        password = (EditText) findViewById(R.id.password);

        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String accountText = account.getText().toString();
        String passwordText = password.getText().toString();
        switch (v.getId()) {
            case R.id.button:
                if (accountText.equals("admin") && passwordText.equals("admin")) {
                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(this,"Account or Password not invalid",Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
