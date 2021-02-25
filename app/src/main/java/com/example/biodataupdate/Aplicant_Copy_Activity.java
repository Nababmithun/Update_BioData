package com.example.biodataupdate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Aplicant_Copy_Activity extends AppCompatActivity {


    private ImageView photo_TV,signature_TV,Cv_TV,Other_File_TV;

    private TextView Father_TV,Mather_TV,BithDate_TV,Gendar_TV,NID_TV,Relagion_TV,Status_TV,
    Passport_TV,PostOffice_TV,PostCode_TV,Quota_TV,PresentAddress_TV,ParmannentsAdress_TV,
    SSCExam_TV,SSCBoard_TV,SSCROll_TV,SSCGourp_TV,SSCResult_TV,SSCPassing_TV,
            HSCExam_TV,HSCBoard_TV,HSCROll_TV,HSCGourp_TV,HSCResult_TV,HSCPassing_TV,
    HonoursExam_TV,HonoursSubject_TV,HonoursVarsity_TV,HonoursResult_TV,HonoursPassing_TV,HonoursCourseDuration_TV,
    MasterExam_TV,MasterSubject_TV,MasterVarsity_TV,MasterResult_TV,MasterPassing_TV,MasterCourseDuration_Tv,
    ShortCourse_TV,Experiance_TV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aplicant__copy_);

        photo_TV=findViewById(R.id.photo_IV);
        signature_TV=findViewById(R.id.signature_IV);
        Cv_TV=findViewById(R.id.Cv_IV);
        Other_File_TV=findViewById(R.id.Other_File_IV);



        Father_TV=findViewById(R.id.father_1);
        Mather_TV=findViewById(R.id.mother_2);
        BithDate_TV=findViewById(R.id.brithdate_3);
        Gendar_TV=findViewById(R.id.gender_4);
        NID_TV=findViewById(R.id.nid_tv);
        Relagion_TV=findViewById(R.id.Religion_id);
        Status_TV=findViewById(R.id.MaritalStatus_id);
        Passport_TV=findViewById(R.id.passport_6);
        PostOffice_TV=findViewById(R.id.postOffice_7);
        PostCode_TV=findViewById(R.id.postCode_8);
        Quota_TV=findViewById(R.id.quota_9);
        PresentAddress_TV=findViewById(R.id.presentAdress_10);
        ParmannentsAdress_TV=findViewById(R.id.parmanentAdress_11);


        SSCExam_TV=findViewById(R.id.ssc_1);
        SSCBoard_TV=findViewById(R.id.SSCboard_2);
        SSCROll_TV=findViewById(R.id.SSCRoll_3);
        SSCGourp_TV=findViewById(R.id.SSCGroup_4);
        SSCResult_TV=findViewById(R.id.SSCResult_5);
        SSCPassing_TV=findViewById(R.id.SSCPassing_6);


        HSCExam_TV=findViewById(R.id.HSC_1);
        HSCBoard_TV=findViewById(R.id.HSCBoard_2);
        HSCROll_TV=findViewById(R.id.HSCRoll_3);
        HSCGourp_TV=findViewById(R.id.HSCGroup_4);
        HSCResult_TV=findViewById(R.id.HSCResult_5);
        HSCPassing_TV=findViewById(R.id.HSCPassing_6);



        HonoursExam_TV=findViewById(R.id.Honours_1);
        HonoursSubject_TV=findViewById(R.id.HonoursSubject_2);
        HonoursVarsity_TV=findViewById(R.id.HonoursVarsity_3);
        HonoursResult_TV=findViewById(R.id.HonoursResult_4);
        HonoursPassing_TV=findViewById(R.id.HonoursPassing_5);
        HonoursCourseDuration_TV=findViewById(R.id.HonoursCourseDuration_6);


        MasterExam_TV=findViewById(R.id.master_1);
        MasterSubject_TV=findViewById(R.id.MasterSubject_2);
        MasterVarsity_TV=findViewById(R.id.MasterVarsity_3);
        MasterResult_TV=findViewById(R.id.MasterResult_4);
        MasterPassing_TV=findViewById(R.id.MasterPassing_5);
        MasterCourseDuration_Tv=findViewById(R.id.MasterCouseDuration_6);

        ShortCourse_TV=findViewById(R.id.ShortCouse_1);
        Experiance_TV=findViewById(R.id.experience);




    }

    public void backBtn(View view) {
        onBackPressed();
    }
}