package com.example.biodataupdate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.biodataupdate.BioDataUpdate.UpdateBioData_One;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void applicant_copy(View view) {

        startActivity(new Intent(MainActivity.this, Aplicant_Copy_Activity.class));


    }

    public void biodata(View view) {

        startActivity(new Intent(MainActivity.this, UpdateBioData_One.class));

    }
}