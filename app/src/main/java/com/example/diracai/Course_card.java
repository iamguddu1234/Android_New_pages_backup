package com.example.diracai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;

import com.example.diracai.databinding.ActivityCourseCardBinding;

public class Course_card extends AppCompatActivity {


    ActivityCourseCardBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityCourseCardBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //getSupportActionBar().hide();


//        ImageView course_menu = findViewById(R.id.course_menu);
//        course_menu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                setPopUp(v);
//
//            }
//        });

    }

    private void setPopUp(View view) {

        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.getMenu().add("edit");
        popupMenu.show();
        popupMenu.setOnMenuItemClickListener(item -> {
            if (item.toString().equals("edit")) {
                //write the code
                edit_course editCourse = new edit_course();
                editCourse.show(getSupportFragmentManager(), editCourse.getTag());
            }

            return false;
        });


    }
}