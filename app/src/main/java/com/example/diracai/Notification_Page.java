package com.example.diracai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Notification_Page extends AppCompatActivity {


    private RecyclerView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_page);

        view = findViewById(R.id.n_rv);
        view.setHasFixedSize(true);
        view.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        List<Chat_Model> chat_models = new ArrayList<>();
        chat_models.add(new Chat_Model("https://media.istockphoto.com/id/1014791354/photo/charming-man.jpg?b=1&s=170667a&w=0&k=20&c=Av2D8VYfMM53SN6xNE_NJO9drAvdUDbInTS_j67vbx0=", "Bibhuprasad Mahakud", "For best Book on physics and mathematics for IIT JEE, Olympiads,KVPY and various Book", "Dec 20, 2022", "1"));
        chat_models.add(new Chat_Model("https://www.shutterstock.com/image-photo/success-concept-stylish-young-bearded-260nw-646467355.jpg", "Akshay", "Awesome", "Dec 20, 2022", "22"));
        chat_models.add(new Chat_Model("https://c8.alamy.com/comp/2C1RD0G/stunning-blonde-woman-with-hairstyle-after-hairdressers-looking-2C1RD0G.jpg", "Sakshi Sethia", "How Are You|", "Dec 20, 2022", "123"));
        chat_models.add(new Chat_Model("https://thumbs.dreamstime.com/b/fashion-models-hairstyle-beauty-portrait-beautiful-woman-red-lips-makeup-long-brown-hair-fashion-models-hairstyle-beauty-143622137.jpg", "Shreya Gupta", "Thank You", "Dec 20, 2022", "4"));
        chat_models.add(new Chat_Model("https://thumbs.dreamstime.com/z/confident-cute-smart-man-spectacles-jeans-sitting-floor-175512335.jpg", "Virendra Jagtap", "It will take some time to complete those thing", "Dec 20, 2022", "56"));
        chat_models.add(new Chat_Model("https://media.gettyimages.com/id/807033664/photo/portrait-of-handsome-man-with-beard.jpg?s=612x612&w=gi&k=20&c=0D02-XU8zz2qwopbgOnOD6JR5GbsXkJ3N5T6XovqfbE=", "Amit Meshram", "How can do this? Can you please tell me Please I dont know anything about this new task", "Dec 20, 2022", "123"));
        chat_models.add(new Chat_Model("https://www.shutterstock.com/image-photo/handsome-young-man-near-car-260nw-274218347.jpg", "Ravi Pawar", "Ok Bye", "Dec 20, 2022", "1234"));
        chat_models.add(new Chat_Model("https://thumbs.dreamstime.com/b/fashion-model-wavy-hairstyle-attractive-young-girl-curly-hair-posing-studio-face-beautiful-woman-long-brown-female-196126449.jpg", "Shefali", "Good Job", "Dec 20, 2022", "50"));
        chat_models.add(new Chat_Model("https://media.istockphoto.com/id/1014791354/photo/charming-man.jpg?b=1&s=170667a&w=0&k=20&c=Av2D8VYfMM53SN6xNE_NJO9drAvdUDbInTS_j67vbx0=", "Bibhuprasad Mahakud", "For best Book on physics and mathematics for IIT JEE, Olympiads,KVPY and various Book", "Dec 20, 2022", "1"));
        chat_models.add(new Chat_Model("https://www.shutterstock.com/image-photo/success-concept-stylish-young-bearded-260nw-646467355.jpg", "Akshay", "Awesome", "Dec 20, 2022", "22"));
        chat_models.add(new Chat_Model("https://c8.alamy.com/comp/2C1RD0G/stunning-blonde-woman-with-hairstyle-after-hairdressers-looking-2C1RD0G.jpg", "Sakshi Sethia", "How Are You|", "Dec 20, 2022", "123"));
        chat_models.add(new Chat_Model("https://thumbs.dreamstime.com/b/fashion-models-hairstyle-beauty-portrait-beautiful-woman-red-lips-makeup-long-brown-hair-fashion-models-hairstyle-beauty-143622137.jpg", "Shreya Gupta", "Thank You", "Dec 20, 2022", "4"));
        chat_models.add(new Chat_Model("https://thumbs.dreamstime.com/z/confident-cute-smart-man-spectacles-jeans-sitting-floor-175512335.jpg", "Virendra Jagtap", "It will take some time to complete those thing", "Dec 20, 2022", "56"));
        chat_models.add(new Chat_Model("https://media.gettyimages.com/id/807033664/photo/portrait-of-handsome-man-with-beard.jpg?s=612x612&w=gi&k=20&c=0D02-XU8zz2qwopbgOnOD6JR5GbsXkJ3N5T6XovqfbE=", "Amit Meshram", "How can do this? Can you please tell me Please I dont know anything about this new task", "Dec 20, 2022", "123"));
        chat_models.add(new Chat_Model("https://www.shutterstock.com/image-photo/handsome-young-man-near-car-260nw-274218347.jpg", "Ravi Pawar", "Ok Bye", "Dec 20, 2022", "1234"));
        chat_models.add(new Chat_Model("https://thumbs.dreamstime.com/b/fashion-model-wavy-hairstyle-attractive-young-girl-curly-hair-posing-studio-face-beautiful-woman-long-brown-female-196126449.jpg", "Shefali", "Good Job", "Dec 20, 2022", "50"));
        Notification_Adapter notification_adapter = new Notification_Adapter(chat_models);
        view.setAdapter(notification_adapter);
    }
}