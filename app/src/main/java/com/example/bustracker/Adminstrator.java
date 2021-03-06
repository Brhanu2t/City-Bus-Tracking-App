package com.example.bustracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Adminstrator extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminstrator);
        button4 = (Button) findViewById(R.id.BUbutton);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openBusInfoUpdation();
            }
        });

        button3 = (Button) findViewById(R.id.BLbutton);
        button3.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                openBusLocation();
            }

        });

        button2 = (Button) findViewById(R.id.BIbutton);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbusinformation();

            }
        });

        button = (Button) findViewById(R.id.BRbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbusregistration();
            }
        });
    }
    public void openBusInfoUpdation(){
        Intent intent3 = new Intent(this, BusInfoUpdation.class);
        startActivity(intent3);}
    public void openBusLocation(){
        Intent intent2 = new Intent(this, BusLocation.class);
        startActivity(intent2);}
    public void openbusinformation(){
        Intent intent1 = new Intent(this, BusInformation.class);
        startActivity(intent1);}
    public void openbusregistration(){
        Intent intent = new Intent(this, BusRegistration.class);
        startActivity(intent);


    }

}


