package com.example.diracai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class student_section_design_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_section_design2);

        RecyclerView std = findViewById(R.id.std_rec_view);
        std.setHasFixedSize(true);
        std.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        List<model> models = new ArrayList<>();
        models.add(new model("https://www.mykhel.com/thumb/247x100x233/cricket/players/8/3788.jpg", "Virat Kohli"));
        models.add(new model("https://opt.toiimg.com/recuperator/img/toi/m-69257289/69257289.jpg", "Rohit Sharma"));
        models.add(new model("https://akm-img-a-in.tosshub.com/indiatoday/images/story/202301/shubmangillindvnz-sixteen_nine.jpg?VersionId=w.MsdLuMju716lVJu.nL9HH3DjG2KSSq&size=690:388", "Shubman Gill"));
        models.add(new model("https://images.indianexpress.com/2022/11/Suryakumar-Yadav-2-1.jpg", "Suryakumar Yadav"));
        models.add(new model("https://images.news18.com/ibnlive/uploads/2022/05/kl-rahul-1-16529026753x2.jpg?im=Resize,width=360,aspect=fit,type=normal?im=Resize,width=320,aspect=fit,type=normal", "KL Rahul"));


        Std_adapter std_adapter = new Std_adapter(models);
        std.setAdapter(std_adapter);

    }
}