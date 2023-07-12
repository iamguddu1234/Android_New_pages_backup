package com.example.diracai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Chat1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat1);
        //getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FFFFFF")));
        getSupportActionBar().hide();

        RecyclerView view = findViewById(R.id.chat_rv);
        view.setHasFixedSize(true);
        view.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        List<Chat_Model> chat_models = new ArrayList<>();
        chat_models.add(new Chat_Model("https://dvyvvujm9h0uq.cloudfront.net/com/articles/1597825455-male-model-poses.jpg", "Amit", "Happy Birthday", "10:01 AM", "333"));
        chat_models.add(new Chat_Model("https://castyou-website.sgp1.digitaloceanspaces.com/2021/12/BAG8228-1.jpg", "Aashish Gupta", "I Call You Later", "12:01 AM", "4444"));
        chat_models.add(new Chat_Model("https://media.istockphoto.com/id/453489637/photo/i-make-this-shirt-look-good.jpg?s=612x612&w=0&k=20&c=eJKm70nD5zhDDJcilZZDLw6YG9ZzGFUJi3viwpHh2M8=", "Roshan Jagtap Sir", "I dont Know", "11:01 AM", "55555"));
        chat_models.add(new Chat_Model("https://castyou-website.sgp1.digitaloceanspaces.com/2019/03/Akash-Jagga.jpg", "Akshay Bhasme", "How Are You", "12:01 AM", "1"));
        chat_models.add(new Chat_Model("https://i.pinimg.com/originals/e5/6b/79/e56b799b365e63c41041feb38fb7e965.jpg", "Rahul", "Thank You Very Much", "1:01 AM", "22"));
        chat_models.add(new Chat_Model("https://dvyvvujm9h0uq.cloudfront.net/com/articles/1597825455-male-model-poses.jpg", "Amit", "Happy Birthday", "10:01 AM", "333"));
        chat_models.add(new Chat_Model("https://media.istockphoto.com/id/453489637/photo/i-make-this-shirt-look-good.jpg?s=612x612&w=0&k=20&c=eJKm70nD5zhDDJcilZZDLw6YG9ZzGFUJi3viwpHh2M8=", "Roshan Jagtap Sir", "I dont Know", "11:01 AM", "55555"));
        chat_models.add(new Chat_Model("https://castyou-website.sgp1.digitaloceanspaces.com/2019/03/Akash-Jagga.jpg", "Akshay Bhasme", "How Are You", "12:01 AM", "1"));
        Chat_Adapter chat_adapter = new Chat_Adapter(chat_models);

        view.setAdapter(chat_adapter);
    }
}