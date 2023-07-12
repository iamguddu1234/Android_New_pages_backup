package com.example.diracai;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Add_group_chat_adapter extends RecyclerView.Adapter<Add_group_chat_adapter.Viewholder> {

    private List<model> models;

    public Add_group_chat_adapter(List<model> models) {
        this.models = models;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_add_2,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        holder.textView.setText(models.get(position).getName());
        holder.imageView.setImageResource(models.get(position).getImgIocn());

    }

    @Override
    public int getItemCount() {
        return models.size();
    }


    public class Viewholder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;


        public Viewholder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.profile_pic);
            textView = itemView.findViewById(R.id.name);

        }
    }
}
