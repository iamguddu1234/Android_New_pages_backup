package com.example.diracai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class Chat2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat2);
        getSupportActionBar().hide();

        RecyclerView v1 = findViewById(R.id.chat_rv_2);
        v1.setHasFixedSize(true);
        v1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        List<model> models = new ArrayList<>();
        models.add(new model("Mom, it was fun. i made new Friend", "Rahul How was School Today?"));
        models.add(new model("Her name Is Cindy", "That's Nice"));
        models.add(new model("Yeh She's a New Student, She moved here from Mumbai", "Is she new to your school?"));
        models.add(new model("Amit Got A Job In Indian Railway", "Great"));
        models.add(new model("i Know. I like Mumbai. it's Beautiful there, But it rains too much.", "You Have An aunt who lives in Mumbai."));
        models.add(new model("Cindy ANd I Have a Lot in Common. we both like Eating Pizza", "That's Why We're Staying in Sunny Pune"));
        models.add(new model("Can We Mom?", "You Should Invite her over for Dinner One Night"));
        models.add(new model("Maybe I'll ask her if she can come over on Sunday", "Sure We can Order Pizza"));
        models.add(new model("Yes", "That's a Good idea"));

        Adapter_msg adapter_msg = new Adapter_msg(models);
        v1.setAdapter(adapter_msg);


        CardView view = findViewById(R.id.voice_note);
        CardView view1 = findViewById(R.id.send_btn);

        EditText editText = findViewById(R.id.text_area);
        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setVisibility(View.GONE);
                view1.setVisibility(View.VISIBLE);

            }
        });

    }
}