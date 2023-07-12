package com.example.diracai;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class Chat_Adapter extends RecyclerView.Adapter<Chat_Adapter.ViewHolder> {

    private List<Chat_Model> chat_models;

    public Chat_Adapter(List<Chat_Model> chat_models) {
        this.chat_models = chat_models;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view1 = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_design_1, parent, false);
        return new ViewHolder(view1);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Context context = holder.itemView.getContext();
        Glide.with(context).load(chat_models.get(position).getImage()).into(holder.imageView);
        holder.title.setText(chat_models.get(position).getTitle());
        holder.subtitle.setText(chat_models.get(position).getSubTitle());
        holder.nuOfMsg.setText(chat_models.get(position).getNu_of_msg());
        holder.time.setText(chat_models.get(position).getTime());


    }

    @Override
    public int getItemCount() {
        return chat_models.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView title;
        TextView subtitle;
        TextView time;
        TextView nuOfMsg;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.img);
            time = itemView.findViewById(R.id.time);
            title = itemView.findViewById(R.id.title);
            subtitle = itemView.findViewById(R.id.subtitle);
            nuOfMsg = itemView.findViewById(R.id.nuOfMsg);
        }
    }
}
