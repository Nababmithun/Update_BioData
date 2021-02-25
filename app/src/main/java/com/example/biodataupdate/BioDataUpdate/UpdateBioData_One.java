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

import java.io.File;

public class UpdateBioData_One extends AppCompatActivity {


    private LinearLayout selectedPhotoIV,selectedSignatureIV,selectedOtherIV,selectedCVIV;
    private TextView photoTextTV,signatureTextTV,otherTextTV,CVTV;
    private ImageView getImagePhotoIV,getImageSignatureIV,getImageOtherIV,getImageCVIV;

    private File uploadFileOne,uploadFileTwo,uploadFileThree,UploadFileFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_bio_data__one);




        selectedPhotoIV = findViewById(R.id.selectedPhotoIV);
        selectedSignatureIV = findViewById(R.id.selectedSignatureIV);
        selectedOtherIV = findViewById(R.id.selectedOtherIV);
        selectedCVIV = findViewById(R.id.selectedCVIV);



        photoTextTV = findViewById(R.id.photoTextTV);
        signatureTextTV = findViewById(R.id.signatureTextTV);
        otherTextTV = findViewById(R.id.otherTextTV);
        CVTV = findViewById(R.id.CVTextTV);


        getImagePhotoIV = findViewById(R.id.getImagePhotoIV);
        getImageSignatureIV = findViewById(R.id.getImageSignatureIV);
        getImageOtherIV = findViewById(R.id.getImageOtherIV);
        getImageCVIV = findViewById(R.id.getImageCvIV);


    }

    public void backkkBtn(View view) {
        onBackPressed();
    }

    public void nextbtnOne(View view) {
        startActivity(new Intent(UpdateBioData_One.this, UpdateBioData_Two.class));

    }
}