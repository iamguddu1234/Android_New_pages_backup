package com.example.diracai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Discussion_design extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discussion_design);

        RecyclerView view = findViewById(R.id.rec_v);
        view.setHasFixedSize(true);
        view.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        List<Chat_Model> chat_models = new ArrayList<>();
        chat_models.add(new Chat_Model("Discussion - 12","Speed of light in vaccume and in side water? Speed of light in vaccume and in side water?","Open"));
        chat_models.add(new Chat_Model("Discussion - 13","What Is Atom ?","Open"));
        chat_models.add(new Chat_Model("Discussion - 14","What Is Compound ?","Open"));
        chat_models.add(new Chat_Model("Discussion - 15","What Is Elasticity ?","Open"));
        chat_models.add(new Chat_Model("Discussion - 16","Speed of light in vaccume and in side water? Speed of light in vaccume and in side water?","Open"));
        chat_models.add(new Chat_Model("Discussion - 17","Speed of light in vaccume and in side water? Speed of light in vaccume and in side water?","Open"));
        Discussion_Adapter comment_adapter = new Discussion_Adapter(chat_models);
        view.setAdapter(comment_adapter);
    }
}