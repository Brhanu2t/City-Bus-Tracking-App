package com.example.bustracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private Button UserLogin;
    private int counter = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = (EditText) findViewById(R.id.etName);
        Password = (EditText) findViewById(R.id.etPassword);
        Info = (TextView) findViewById(R.id.tvInfo);
        Login = (Button) findViewById(R.id.btLogin);
        UserLogin = (Button) findViewById(R.id.btLogin1);
        Info.setText("No of attempt remaning: 5 ");


            Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
            UserLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openUserIF();
                }
            });
            }
        private void openUserIF(){
              Intent intent = new Intent(this, UserIF.class);
               startActivity(intent);
            }
        private void validate(String userName, String userpassword){
            if((userName.equals("Admin")) && (userpassword.equals("Admin"))){
               Intent intent = new Intent(MainActivity.this, Adminstrator.class);
               startActivity (intent);
        }
        else {
            counter --;
            Info.setText("Invalid user name or Password" + " " + String.valueOf(counter));
            if (counter == 0){
                Login.setEnabled(false);
            }
        }
    }
    }