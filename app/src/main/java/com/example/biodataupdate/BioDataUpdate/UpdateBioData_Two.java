package com.example.biodataupdate.BioDataUpdate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.biodataupdate.Aplicant_Copy_Activity;
import com.example.biodataupdate.MainActivity;
import com.example.biodataupdate.R;
import com.google.android.material.textfield.TextInputEditText;

public class UpdateBioData_Two extends AppCompatActivity {


    //Basic Information
    private TextInputEditText FatheName_ET,MatherName_ET,Gendar_ET,Status_ET,Relagion_ET,PostOffice_ET,
    PostCode_ET,NID_ET,Passport_ET,Quota_ET,PresentAddress_ET,ParmannentsAdress_ET;

    //Date
    private TextView DateTV;
    private LinearLayout LinLayoutTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_bio_data__two);


        //Date
        DateTV=findViewById(R.id.dateTV);
        LinLayoutTV=findViewById(R.id.dateLL);


        //Basic Information
        FatheName_ET=findViewById(R.id.father_tv);
        MatherName_ET=findViewById(R.id.mather_tv);
        Gendar_ET=findViewById(R.id.gender_tv);
        Status_ET=findViewById(R.id.status_tv);
        Relagion_ET=findViewById(R.id.relagion_tv);
        PostOffice_ET=findViewById(R.id.postOffice_tv);
        PostCode_ET=findViewById(R.id.postCode_tv);
        NID_ET=findViewById(R.id.nid_tv);
        Passport_ET=findViewById(R.id.passport_tv);
        Quota_ET=findViewById(R.id.quota_tv);
        PresentAddress_ET=findViewById(R.id.pessentAddress_tv);
        ParmannentsAdress_ET=findViewById(R.id.parmannentsAddress_tv);


    }

    public void next_btnTwo(View view) {
        startActivity(new Intent(UpdateBioData_Two.this, UpdateBioData_Three.class));

    }
}