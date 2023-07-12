package com.example.diracai;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AddContactAdapter extends RecyclerView.Adapter<AddContactAdapter.ViewHolder> {

    private List<Chat_Model> chat_models;

    public AddContactAdapter(List<Chat_Model> chat_models) {
        this.chat_models = chat_models;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_add_2, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return chat_models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView profile_img;
        TextView name;
        TextView msg;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            profile_img = itemView.findViewById(R.id.profile_pic);
            name = itemView.findViewById(R.id.name);
            msg = itemView.findViewById(R.id.msg);
        }
    }
}
