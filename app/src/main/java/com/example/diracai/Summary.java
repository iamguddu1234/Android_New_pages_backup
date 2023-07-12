package com.example.diracai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        TextView view = findViewById(R.id.edit_summary);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Edit_summary_Fragment fragment = new Edit_summary_Fragment();
                fragment.show(getSupportFragmentManager(),"");
            }
        });
    }
}