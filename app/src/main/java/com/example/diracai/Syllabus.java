package com.example.diracai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;
import androidx.cardview.widget.CardView;

import android.media.Image;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Syllabus extends AppCompatActivity {

    ImageView imageView;
    CardView editCard;
    CardView delCard, addSection, editSec, delSec;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);
        getSupportActionBar().hide();


        imageView = findViewById(R.id.menuButton);
        editCard = findViewById(R.id.edit_btn);
        delCard = findViewById(R.id.delete_btn);
        addSection = findViewById(R.id.add_section_button);
        editSec = findViewById(R.id.edit_btn_sec);
        delSec = findViewById(R.id.delete_btn_sec);


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showPopUp();
            }
        });


    }

    private void showPopUp() {

        PopupMenu popupMenu = new PopupMenu(this, imageView);
        popupMenu.inflate(R.menu.course_menu);


        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.Edit:
                        // Handle Option 1 click

                        if (delCard.getVisibility() == View.VISIBLE) {
                            delCard.setVisibility(View.GONE);
                            editCard.setVisibility(View.VISIBLE);
//                            addSection.setVisibility(View.GONE);
                            editSec.setVisibility(View.VISIBLE);
                        } else {
                            delCard.setVisibility(View.GONE);
                            editCard.setVisibility(View.VISIBLE);
//                            addSection.setVisibility(View.GONE);
                            editSec.setVisibility(View.VISIBLE);
                        }


                        return true;


                    case R.id.restToDefult:

                        addSection.setVisibility(View.VISIBLE);
                        editSec.setVisibility(View.GONE);
                        delSec.setVisibility(View.GONE);
                        delCard.setVisibility(View.GONE);
                        editCard.setVisibility(View.GONE);

                        return true;

                    case R.id.Delete:


                        if (editCard.getVisibility() == View.VISIBLE) {
                            editCard.setVisibility(View.GONE);
                            delCard.setVisibility(View.VISIBLE);
//                            addSection.setVisibility(View.GONE);
                            editSec.setVisibility(View.GONE);
                            delSec.setVisibility(View.VISIBLE);
                        } else {
                            delCard.setVisibility(View.VISIBLE);
//                            addSection.setVisibility(View.GONE);
                            delSec.setVisibility(View.VISIBLE);
                        }
                        return true;
                    default:
                        return false;
                }
            }
        });

        popupMenu.show();
    }
}
