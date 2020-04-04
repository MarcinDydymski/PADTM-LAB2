package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Lab2", "metoda OnCreate");

        Toast.makeText(this, "Metoda onCreate", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("lab2", "metoda onResume");
        Toast.makeText(this, "Metoda onResume", Toast.LENGTH_SHORT).show();
    }
}
