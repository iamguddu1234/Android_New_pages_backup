package com.example.diracai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Chat3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat3);
        setTitle("Select contacts for new chat");
        getSupportActionBar().hide();

        RecyclerView r1 = findViewById(R.id.add_user);
        r1.setHasFixedSize(true);
        r1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        List<Chat_Model> chat_models = new ArrayList<>();
        chat_models.add(new Chat_Model("https://castyou-website.sgp1.digitaloceanspaces.com/2019/03/Akash-Jagga.jpg", "Akshay Bhasme", "How Are You"));
        chat_models.add(new Chat_Model("https://castyou-website.sgp1.digitaloceanspaces.com/2019/03/Akash-Jagga.jpg", "Akshay Bhasme", "How Are You"));
        chat_models.add(new Chat_Model("https://castyou-website.sgp1.digitaloceanspaces.com/2019/03/Akash-Jagga.jpg", "Akshay Bhasme", "How Are You"));
        chat_models.add(new Chat_Model("https://castyou-website.sgp1.digitaloceanspaces.com/2019/03/Akash-Jagga.jpg", "Akshay Bhasme", "How Are You"));
        chat_models.add(new Chat_Model("https://castyou-website.sgp1.digitaloceanspaces.com/2019/03/Akash-Jagga.jpg", "Akshay Bhasme", "How Are You"));
        chat_models.add(new Chat_Model("https://castyou-website.sgp1.digitaloceanspaces.com/2019/03/Akash-Jagga.jpg", "Akshay Bhasme", "How Are You"));
        chat_models.add(new Chat_Model("https://castyou-website.sgp1.digitaloceanspaces.com/2019/03/Akash-Jagga.jpg", "Akshay Bhasme", "How Are You"));
        chat_models.add(new Chat_Model("https://castyou-website.sgp1.digitaloceanspaces.com/2019/03/Akash-Jagga.jpg", "Akshay Bhasme", "How Are You"));
        chat_models.add(new Chat_Model("https://castyou-website.sgp1.digitaloceanspaces.com/2019/03/Akash-Jagga.jpg", "Akshay Bhasme", "How Are You"));
        chat_models.add(new Chat_Model("https://castyou-website.sgp1.digitaloceanspaces.com/2019/03/Akash-Jagga.jpg", "Akshay Bhasme", "How Are You"));
        chat_models.add(new Chat_Model("https://castyou-website.sgp1.digitaloceanspaces.com/2019/03/Akash-Jagga.jpg", "Akshay Bhasme", "How Are You"));
        chat_models.add(new Chat_Model("https://castyou-website.sgp1.digitaloceanspaces.com/2019/03/Akash-Jagga.jpg", "Akshay Bhasme", "How Are You"));
        chat_models.add(new Chat_Model("https://castyou-website.sgp1.digitaloceanspaces.com/2019/03/Akash-Jagga.jpg", "Akshay Bhasme", "How Are You"));
        chat_models.add(new Chat_Model("https://castyou-website.sgp1.digitaloceanspaces.com/2019/03/Akash-Jagga.jpg", "Akshay Bhasme", "How Are You"));
        chat_models.add(new Chat_Model("https://castyou-website.sgp1.digitaloceanspaces.com/2019/03/Akash-Jagga.jpg", "Akshay Bhasme", "How Are You"));
        chat_models.add(new Chat_Model("https://castyou-website.sgp1.digitaloceanspaces.com/2019/03/Akash-Jagga.jpg", "Akshay Bhasme", "How Are You"));
        AddContactAdapter addContactAdapter = new AddContactAdapter(chat_models);
        r1.setAdapter(addContactAdapter);
    }
}