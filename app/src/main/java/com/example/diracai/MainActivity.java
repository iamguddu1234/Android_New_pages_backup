package com.example.diracai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.wifi.aware.DiscoverySession;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button newButton = findViewById(R.id.tabnew);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, demo_tab_layout.class);
                startActivity(intent);
            }
        });

        Button buttonaa = findViewById(R.id.cal_detail);
        buttonaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Calander_Detail_view.class);
                startActivity(intent);
            }
        });


        Button buttona = findViewById(R.id.add_group_chat);
        buttona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Add_group_chat.class);
                startActivity(intent);
            }
        });

        Button button = findViewById(R.id.syllabus);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Syllabus.class);
                startActivity(intent);
            }
        });


        Button button1 = findViewById(R.id.assignment);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Assignment_card.class);
                startActivity(intent);
            }
        });


        Button assignementForm = findViewById(R.id.assignment_form);
        assignementForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Create_assignment_form create_assignment_form = new Create_assignment_form();
                create_assignment_form.show(getSupportFragmentManager(), create_assignment_form.getTag());
            }
        });

        Button moreDialogButton = findViewById(R.id.moreDialog_fragment);
        moreDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showBottomSheetDialog();
            }
        });


        Button buttonSummary = findViewById(R.id.summary_fragment);
        buttonSummary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Summary_fragment summaryFragment = new Summary_fragment();
                summaryFragment.show(getSupportFragmentManager(), summaryFragment.getTag());
            }
        });

        Button publicProfile = findViewById(R.id.publicProfile);
        publicProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Public_profile_fragment public_profile_fragment = new Public_profile_fragment();
                public_profile_fragment.show(getSupportFragmentManager(), public_profile_fragment.getTag());
            }
        });

        Button privateProfile = findViewById(R.id.privateProfile);
        privateProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                private_profile_fragment private_profile_fragment = new private_profile_fragment();
                private_profile_fragment.show(getSupportFragmentManager(), private_profile_fragment.getTag());
            }
        });


        Button f = findViewById(R.id.fraggment_disscusion);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Discussion_fragment fragment = new Discussion_fragment();

            }
        });


        Button fragment = findViewById(R.id.fraggment);
        fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BlankFragment blankFragment = new BlankFragment();
                blankFragment.show(getSupportFragmentManager(), blankFragment.getTag());

            }
        });


//        Button button = findViewById(R.id.class_card);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent intent = new Intent(MainActivity.this, Class_card.class);
//                startActivity(intent);
//            }
//        });
//
//        Button button1 = findViewById(R.id.notice_card);
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, Notice_card.class);
//                startActivity(intent);
//            }
//        });
//
//        Button button2 = findViewById(R.id.course_card);
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, Course_card.class);
//                startActivity(intent);
//            }
//        });
//
//        Button s1 = findViewById(R.id.summary);
//        s1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, Summary.class);
//                startActivity(intent);
//            }
//        });
//
//
//        Button r1 = findViewById(R.id.enroll_req);
//        r1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, Enrollment_request.class);
//                startActivity(intent);
//            }
//        });
//
//        Button m1 = findViewById(R.id.meeting);
//        m1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, Meeting_Card.class);
//                startActivity(intent);
//            }
//        });
//
        Button st1 = findViewById(R.id.student);
        st1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, student_section.class);
                startActivity(intent);
            }
        });
//
//        Button button3 = findViewById(R.id.chat);
//        button3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, Chat1.class);
//                startActivity(intent);
//            }
//        });
//
//        Button button4 = findViewById(R.id.chat2);
//        button4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, Chat2.class);
//                startActivity(intent);
//            }
//        });
//
//        Button btn5 = findViewById(R.id.chat3);
//        btn5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, Chat3.class);
//                startActivity(intent);
//            }
//        });
//
//        Button btn6 = findViewById(R.id.chat4);
//        btn6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, chat4.class);
//                startActivity(intent);
//            }
//        });
//
//
//        Button button5 = findViewById(R.id.notificationid);
//        button5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, Notification_Page.class);
//                startActivity(intent);
//            }
//        });
//
//
//        Button button6 = findViewById(R.id.notification);
//        button6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, Alert_design.class);
//                startActivity(intent);
//            }
//        });
//
//
//        Button button7 = findViewById(R.id.disscussid);
//        button7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Discussion_fragment discussion_fragment = new Discussion_fragment();
//                discussion_fragment.show(getSupportFragmentManager(), discussion_fragment.getTag());
////                Intent intent = new Intent(MainActivity.this, Discussion_design.class);
////                startActivity(intent);
//            }
//        });
//
//        Button button8 = findViewById(R.id.std2);
//        button8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, student_section_design_2.class);
//                startActivity(intent);
//            }
//        });
//
//
//        Button button9 = findViewById(R.id.cd1);
//        button9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                CreateDiscussionFragment createDiscussionFragment = new CreateDiscussionFragment();
//                createDiscussionFragment.show(getSupportFragmentManager(), createDiscussionFragment.getTag());
//            }
//        });
//
//        Button button10 = findViewById(R.id.cd2);
//        button10.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                CreateDiscussionFragmen_2 createDiscussionFragmen_2 = new CreateDiscussionFragmen_2();
//                createDiscussionFragmen_2.show(getSupportFragmentManager(), createDiscussionFragmen_2.getTag());
//
//            }
//        });
//        Button button11 = findViewById(R.id.editNoticel);
//        button11.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                edit_notice_fragment_2 editNotice2 = new edit_notice_fragment_2();
//                editNotice2.show(getSupportFragmentManager(), editNotice2.getTag());
//            }
//        });


    }

    public void showBottomSheetDialog() {

        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(MainActivity.this);
        bottomSheetDialog.setContentView(R.layout.more_bottomsheet_dialog_box);
        bottomSheetDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        bottomSheetDialog.show();

//        bottomSheetDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);

        RecyclerView recyclerView = bottomSheetDialog.findViewById(R.id.more_rec);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 4));
        List<model> models = new ArrayList<>();
        models.add(new model("Quick Meeting", R.drawable.quick_meeting));
        models.add(new model("Contacts", R.drawable.contact_icon));
        models.add(new model("Mail", R.drawable.baseline_email_24_dark));
        models.add(new model("Theme", R.drawable.baseline_dark_mode_24_theme));
        models.add(new model("Time Table", R.drawable.baseline_table_chart_24_dark));
        models.add(new model("Useful Link", R.drawable.useful_link));
        models.add(new model("Social Network", R.drawable.social_media));
        models.add(new model("Diary", R.drawable.baseline_book_24));
        models.add(new model("Archived Course", R.drawable.baseline_courses));
        models.add(new model("Setting", R.drawable.baseline_settings_24));
        models.add(new model("Help", R.drawable.baseline_live_help_24_dark));
        models.add(new model("Contact Us", R.drawable.baseline_contact_phone_24));

        More_page_Adapter more_page_adapter = new More_page_Adapter(models, MainActivity.this);

        recyclerView.setAdapter(more_page_adapter);

    }


}