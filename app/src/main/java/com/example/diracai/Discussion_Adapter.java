package com.example.diracai;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.List;

public class Discussion_Adapter extends RecyclerView.Adapter<Discussion_Adapter.Viewholder> {

    private List<Chat_Model> models;

    public Discussion_Adapter(List<Chat_Model> models) {
        this.models = models;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.df_discussion_details, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        Context context = holder.itemView.getContext();

        holder.status.setText(models.get(position).getTime());
        holder.title.setText(models.get(position).getTitle());
        holder.details.setText(models.get(position).getSubTitle());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MainActivity activity = (MainActivity) v.getContext();
               BlankFragment blankFragment = new BlankFragment();
               blankFragment.show(activity.getSupportFragmentManager(), blankFragment.getTag());
//                FragmentTransaction transaction = activity.getSupportFragmentManager().beginTransaction();
//                transaction.replace(R.id.main, blankFragment);
//                transaction.addToBackStack(null);
//                transaction.commit();


            }
        });
    }

    @Override
    public int getItemCount() {
        return models.size();
    }


    public class Viewholder extends RecyclerView.ViewHolder {
        TextView status;
        TextView title;
        TextView details;
        CardView view;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            view = itemView.findViewById(R.id.df_discussion_card);
            status = itemView.findViewById(R.id.status_tv);
            title = itemView.findViewById(R.id.tv_discussion);
            details = itemView.findViewById(R.id.tv_message);

        }
    }


}
