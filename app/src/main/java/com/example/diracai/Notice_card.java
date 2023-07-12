package com.example.diracai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.example.diracai.databinding.ActivityNoticeCardBinding;

public class Notice_card extends AppCompatActivity {

    ActivityNoticeCardBinding  binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice_card);

        binding = ActivityNoticeCardBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        getSupportActionBar().hide();


        binding.noticeMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setPopUp(v);
            }
        });
    }

    private void setPopUp(View view) {
        PopupMenu popupMenu = new PopupMenu(this,view);
        popupMenu.getMenu().add("Edit");
        popupMenu.getMenu().add("Delete");
        popupMenu.show();

        popupMenu.setOnMenuItemClickListener(item -> {

            if (item.toString().equals("Edit")){
                Edit_notice editNotice = new Edit_notice();
                editNotice.show(getSupportFragmentManager(),editNotice.getTag());
            }
            if (item.toString().equals("Delete")){
                Toast.makeText(Notice_card.this, "Delete Menu Button Clicked", Toast.LENGTH_SHORT).show();
            }
            return false;
        });
    }
}