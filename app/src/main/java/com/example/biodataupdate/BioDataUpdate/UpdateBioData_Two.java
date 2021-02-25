package com.example.biodataupdate.BioDataUpdate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.biodataupdate.Aplicant_Copy_Activity;
import com.example.biodataupdate.MainActivity;
import com.example.biodataupdate.R;

public class UpdateBioData_Two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_bio_data__two);
    }

    public void next_btnTwo(View view) {
        startActivity(new Intent(UpdateBioData_Two.this, UpdateBioData_Three.class));

    }
}