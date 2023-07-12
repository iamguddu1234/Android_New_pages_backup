package com.example.diracai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Add_group_chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_group_chat);
        getSupportActionBar().hide();
        RecyclerView recyclerView = findViewById(R.id.rec_add_group);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        List<model> models = new ArrayList<>();
        models.add(new model("Akshay Bhasme", R.drawable.student));
        models.add(new model("Akshay Bhasme", R.drawable.student));
        models.add(new model("Akshay Bhasme", R.drawable.student));
        models.add(new model("Akshay Bhasme", R.drawable.student));
        models.add(new model("Akshay Bhasme", R.drawable.student));
        models.add(new model("Akshay Bhasme", R.drawable.student));
        models.add(new model("Akshay Bhasme", R.drawable.student));
        models.add(new model("Akshay Bhasme", R.drawable.student));
        models.add(new model("Akshay Bhasme", R.drawable.student));
        models.add(new model("Akshay Bhasme", R.drawable.student));
        models.add(new model("Akshay Bhasme", R.drawable.student));
        models.add(new model("Akshay Bhasme", R.drawable.student));
        models.add(new model("Akshay Bhasme", R.drawable.student));
        models.add(new model("Akshay Bhasme", R.drawable.student));
        Add_group_chat_adapter add_group_chat_adapter = new Add_group_chat_adapter(models);
        recyclerView.setAdapter(add_group_chat_adapter);

    }
}