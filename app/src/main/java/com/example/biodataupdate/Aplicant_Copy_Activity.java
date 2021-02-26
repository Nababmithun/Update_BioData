package com.example.biodataupdate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.biodataupdate.AppliedCopyModel.AppliedCopyResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Aplicant_Copy_Activity extends AppCompatActivity {


    private ImageView photo_TV,signature_TV,Cv_TV,Other_File_TV;

    private TextView Father_TV,Mather_TV,BithDate_TV,Gendar_TV,NID_TV,Relagion_TV,Status_TV,
    Passport_TV,PostOffice_TV,PostCode_TV,Quota_TV,PresentAddress_TV,ParmannentsAdress_TV,
    SSCExam_TV,SSCBoard_TV,SSCROll_TV,SSCGourp_TV,SSCResult_TV,SSCPassing_TV,
            HSCExam_TV,HSCBoard_TV,HSCROll_TV,HSCGourp_TV,HSCResult_TV,HSCPassing_TV,
    HonoursExam_TV,HonoursSubject_TV,HonoursVarsity_TV,HonoursResult_TV,HonoursPassing_TV,HonoursCourseDuration_TV,
    MasterExam_TV,MasterSubject_TV,MasterVarsity_TV,MasterResult_TV,MasterPassing_TV,MasterCourseDuration_Tv,
    ShortCourse_TV,Experiance_TV;


    private ApiInterface apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aplicant__copy_);


        getAllApplyData();



    }

    private void getAllApplyData() {



        apiService = RetrofitClient.getRetrofit().create(ApiInterface.class);
        apiService.getApplicantCopyResponse().enqueue(new Callback<AppliedCopyResponse>() {
            @Override
            public void onResponse(Call<AppliedCopyResponse> call, Response<AppliedCopyResponse> response) {


                if (response.code() == 200) {

                    /*  //FindViewId~~~~~~~~~~~~~~~~~~~~~~~~~~//*/

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



                    AppliedCopyResponse res = response.body();
                    res.getAdditional();




                    Glide.with(getApplicationContext())
                            .load("https://ezze.dev/applycafe/media/photos/job_application/" + res.getData().getPhoto())
                            .centerCrop()
                            .into(photo_TV);


                    Glide.with(getApplicationContext())
                            .load("https://ezze.dev/applycafe/media/photos/job_application/" + res.getData().getSignature())
                            .centerCrop()
                            .into(signature_TV);

                    Glide.with(getApplicationContext())
                            .load("https://ezze.dev/applycafe/media/photos/job_application/" + res.getData().getCv())
                            .centerCrop()
                            .into(Cv_TV);

                    Glide.with(getApplicationContext())
                            .load("https://ezze.dev/applycafe/media/photos/job_application/" + res.getData().getOtherFile())
                            .centerCrop()
                            .into(Other_File_TV);



                    //Bio_Data
                    Father_TV.setText(res.getData().getFatherName().toString().trim());
                    Mather_TV.setText(res.getData().getMotherName().toString().trim());
                    Gendar_TV.setText(res.getData().getGender().toString().trim());
                    NID_TV.setText(res.getData().getNid().toString().trim());
                    Passport_TV.setText(res.getData().getPassport().toString().trim());
                    PostOffice_TV.setText(res.getData().getPostOffice().toString().trim());
                    PostCode_TV.setText(res.getData().getPostCode().toString().trim());
                    Quota_TV.setText(res.getData().getQuota().toString().trim());
                    PresentAddress_TV.setText(res.getData().getPresentAddress().toString().trim());
                    ParmannentsAdress_TV.setText(res.getData().getPermanentAddress().toString().trim());
                    Status_TV.setText(res.getData().getMaritalStatus().toString().trim());
                    Relagion_TV.setText(res.getData().getReligion().toString().trim());




                    //Academic Qualifications
                    //SSC_Exam
                    SSCExam_TV.setText(res.getData().getSscExam().toString().trim());
                    SSCBoard_TV.setText(res.getData().getSscBoard().toString().trim());
                    SSCROll_TV.setText(res.getData().getSscRoll().toString().trim());
                    SSCGourp_TV.setText(res.getData().getSscGroup().toString().trim());
                    SSCResult_TV.setText(res.getData().getSscResult().toString().trim());

                    try {
                        SSCPassing_TV.setText(res.getData().getSscPassingYear().toString().trim());
                        BithDate_TV.setText(res.getData().getBirthdate().toString().trim());
                    }catch (Exception e)
                    {

                    }


                    //HSC_Exam
                    HSCExam_TV.setText(res.getData().getHscExam().toString());
                    HSCBoard_TV.setText(res.getData().getHscBoard().toString());
                    HSCROll_TV.setText(res.getData().getHscRoll().toString());
                    HSCGourp_TV.setText(res.getData().getHscGroup().toString());
                    HSCResult_TV.setText(res.getData().getHscResult().toString());
                    HSCPassing_TV.setText(res.getData().getHscPassingYear().toString());


                    //Honours_exam
                    HonoursExam_TV.setText(res.getData().getHonoursExam().toString());
                    HonoursSubject_TV.setText(res.getData().getHonoursSubject().toString());
                    HonoursVarsity_TV.setText(res.getData().getHonoursVarsity().toString());
                    HonoursResult_TV.setText(res.getData().getHonoursResult().toString());
                    HonoursPassing_TV.setText(res.getData().getHonoursPassingYear().toString());
                    HonoursCourseDuration_TV.setText(res.getData().getHonoursDuration().toString());


                    //Master_Exam
                    MasterExam_TV.setText(res.getData().getMasterExam().toString());
                    MasterSubject_TV.setText(res.getData().getMasterSubject().toString());
                    MasterVarsity_TV.setText(res.getData().getMasterVarsity().toString());
                    MasterResult_TV.setText(res.getData().getMasterResult().toString());
                    MasterPassing_TV.setText(res.getData().getMasterPassingYear().toString());
                    MasterCourseDuration_Tv.setText(res.getData().getMasterDuration().toString());


                    //EXperiance
                    ShortCourse_TV.setText(res.getData().getShortCourse().toString());
                    Experiance_TV.setText(res.getData().getExperience().toString().trim());



                }
            }

            @Override
            public void onFailure(Call<AppliedCopyResponse> call, Throwable t) {
                Log.d("Response Error", t.getMessage());
            }
        });

    }




    public void backBtn(View view) {
        onBackPressed();
    }
}