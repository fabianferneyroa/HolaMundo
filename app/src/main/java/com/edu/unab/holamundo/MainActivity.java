package com.edu.unab.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    private Button btnSaludar;
    private EditText edtxFecha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSaludar = findViewById(R.id.btnSaludar);

        edtxFecha = findViewById(R.id.edtxFecha);

        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Bienvenidos a Android", Toast.LENGTH_LONG).show();
                int edad=0;
                LocalDate hoy=null;
                LocalDate fn=null;
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                    hoy = LocalDate.now();
                    fn = LocalDate.parse(edtxFecha.getText().toString());
                    edad= Period.between(fn,hoy).getYears();

                }

                Log.i("la fn es: ",fn+"");
                Log.i("hoy es: ",hoy+"");
                Log.i("la edad es: ",edad+"");
                Log.i("mensaje","probado");
            }
        });

    }


}