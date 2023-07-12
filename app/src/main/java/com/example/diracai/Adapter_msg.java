package com.example.diracai;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter_msg extends RecyclerView.Adapter<Adapter_msg.Viewholder> {

    private List<model> models;

    public Adapter_msg(List<model> models) {
        this.models = models;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_design_2,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        holder.textView1.setText(models.get(position).getName());
        holder.textView2.setText(models.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{

        TextView textView1;
        TextView textView2;


        public Viewholder(@NonNull View itemView) {
            super(itemView);

            textView1 = itemView.findViewById(R.id.txt_1);
            textView2 = itemView.findViewById(R.id.txt_2);
        }
    }
}
