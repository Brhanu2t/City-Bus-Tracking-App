package com.example.bustracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserIF extends AppCompatActivity {
    private Button button;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_i_f);

        button1 = (Button) findViewById(R.id.UBIbutton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbusinformation();

            }
        });

        button = (Button) findViewById(R.id.UBLbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBusLocation();
            }
        });

    }
    public void openbusinformation(){
        Intent intent1 = new Intent(this, BusInformation.class);
        startActivity(intent1);}
    public void openBusLocation(){
        Intent intent = new Intent(this, BusLocation.class);
        startActivity(intent);
}
}