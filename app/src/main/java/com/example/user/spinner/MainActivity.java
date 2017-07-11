package com.example.user.spinner;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    String[] fruit = new String[]{"香蕉","蘋果","鳳梨"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner)findViewById(R.id.spinner);

        ArrayAdapter<String> adapterFruit = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,fruit);

        adapterFruit.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapterFruit);
    }
}
