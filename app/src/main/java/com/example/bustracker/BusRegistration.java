package com.example.bustracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.database.FirebaseDatabase;

public class BusRegistration extends AppCompatActivity {
    EditText BusId, BusPlate, Driver, GPSCode, SAddress, DAddress, Path, Price;
    public Button Registor;
    TextView RegistrationInfo;
    FirebaseDatabase Realtime;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_registration);
        BusId = findViewById(R.id.IDNumber);
        BusPlate = findViewById(R.id.PlateNumber);
        Driver = findViewById(R.id.DriverName);
        GPSCode = findViewById(R.id.GPSNumber);
        SAddress = findViewById(R.id.SourceName);
        DAddress = findViewById(R.id.DestinationName);
        Path = findViewById(R.id.PathLine);
        Price = findViewById(R.id.PriceNumber);
        Registor = findViewById(R.id.Regbutton);
        RegistrationInfo = findViewById(R.id.RegInfo);
        progressBar = findViewById(R.id.progressBar);
        Realtime = FirebaseDatabase.getInstance();

        Registor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String IDNumber = BusId.getText().toString().trim();
                String PlateNumber = BusPlate.getText().toString().trim();
                String GPSNumber = GPSCode.getText().toString().trim();
                String SourceName = SAddress.getText().toString().trim();
                String DestinationName = DAddress.getText().toString().trim();
                String PathLine = Path.getText().toString().trim();
                String PriceNumber = Price.getText().toString().trim();
                String DriverName = Driver.getText().toString().trim();
                if (TextUtils.isEmpty(IDNumber)){
                    BusId.setError("Bus Id is Required.");
                    return;
                }
                if (TextUtils.isEmpty(PlateNumber)){
                    BusPlate.setError("BusPlate Number is Required.");
                    return;
                }
                if (TextUtils.isEmpty(GPSNumber)){
                    GPSCode.setError("GPS Code is Required.");
                    return;
                }if (TextUtils.isEmpty(SourceName)){
                    SAddress.setError("Source Address is Required.");
                    return;
                }if (TextUtils.isEmpty(DestinationName)){
                    DAddress.setError("Destination Address is Required.");
                    return;
                }if (TextUtils.isEmpty(PathLine)){
                    Path.setError("Path is Required.");
                    return;
                }
                progressBar.setVisibility(View.VISIBLE);

                            }
        });
    }
}