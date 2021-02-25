package com.example.biodataupdate.BioDataUpdate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.biodataupdate.R;
import com.google.android.material.textfield.TextInputEditText;

public class UpdateBioData_Three extends AppCompatActivity {

    //Education
    private TextInputEditText  SSCExam_ET,SSCBoard_ET,SSCROll_ET,SSCGourp_ET,SSCResult_ET,SSCPassing_ET,
            HSCExam_ET,HSCBoard_ET,HSCROll_ET,HSCGourp_ET,HSCResult_ET,HSCPassing_ET,
            HonoursExam_ET,HonoursSubject_ET,HonoursVarsity_ET,HonoursResult_ET,HonoursPassing_ET,HonoursCourseDuration_ET,
            MasterExam_ET,MasterSubject_ET,MasterVarsity_ET,MasterResult_ET,MasterPassing_ET,MasterCourseDuration_ET,
            ShortCourse_ET,Experiance_ET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_bio_data__three);

        //Education
        SSCExam_ET=findViewById(R.id.sscExam_id);
        SSCBoard_ET=findViewById(R.id.ssc_board_id);
        SSCROll_ET=findViewById(R.id.ssc_roll_id);
        SSCGourp_ET=findViewById(R.id.ssc_group_id);
        SSCResult_ET=findViewById(R.id.ssc_result_id);
        SSCPassing_ET=findViewById(R.id.ssc_passing_year_id);


        HSCExam_ET=findViewById(R.id.hsc_exam_id);
        HSCBoard_ET=findViewById(R.id.hsc_board_id);
        HSCROll_ET=findViewById(R.id.hsc_roll_id);
        HSCGourp_ET=findViewById(R.id.hsc_group_id);
        HSCResult_ET=findViewById(R.id.hsc_result_id);
        HSCPassing_ET=findViewById(R.id.hsc_passing_year_id);




        HonoursExam_ET=findViewById(R.id.honours_exam_id);
        HonoursSubject_ET=findViewById(R.id.honours_subject_id);
        HonoursVarsity_ET=findViewById(R.id.honours_varsity_id);
        HonoursResult_ET=findViewById(R.id.honours_result_id);
        HonoursPassing_ET=findViewById(R.id.honours_passing_year_id);
        HonoursCourseDuration_ET=findViewById(R.id.honours_duration_id);



        MasterExam_ET=findViewById(R.id.master_exam_id);
        MasterSubject_ET=findViewById(R.id.master_subject_id);
        MasterVarsity_ET=findViewById(R.id.master_varsity_id);
        MasterResult_ET=findViewById(R.id.master_result_id);
        MasterPassing_ET=findViewById(R.id.master_passing_year_id);
        MasterCourseDuration_ET=findViewById(R.id.master_duration_id);


        ShortCourse_ET=findViewById(R.id.short_course_id);
        Experiance_ET=findViewById(R.id.experience_id);



    }
}