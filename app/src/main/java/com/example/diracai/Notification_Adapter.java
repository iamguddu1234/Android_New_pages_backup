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

public class Notification_Adapter extends RecyclerView.Adapter<Notification_Adapter.Viewholder> {

    private List<Chat_Model> models;

    public Notification_Adapter(List<Chat_Model> models) {
        this.models = models;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.notification_design, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        Context context = holder.itemView.getContext();

        Glide.with(context).load(models.get(position).getImage()).into(holder.imageView);
        holder.title.setText(models.get(position).getTitle());
        holder.subtitle.setText(models.get(position).getSubTitle());
        holder.time.setText(models.get(position).getTime());
        holder.nuOfMsg.setText(models.get(position).getNu_of_msg());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }


    public class Viewholder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView title;
        TextView subtitle;
        TextView time;
        TextView nuOfMsg;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.img);
            time = itemView.findViewById(R.id.date);
            title = itemView.findViewById(R.id.title);
            subtitle = itemView.findViewById(R.id.subtitle);
            nuOfMsg = itemView.findViewById(R.id.nuOfMsg);
        }
    }
}
