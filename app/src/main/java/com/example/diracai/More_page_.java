package com.example.diracai;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.diracai.databinding.FragmentMorePageBinding;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.ArrayList;
import java.util.List;


public class More_page_ extends BottomSheetDialogFragment {


    FragmentMorePageBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentMorePageBinding.inflate(getLayoutInflater(), container, false);
        binding.moreOptionDialogFragment.setBackground(new ColorDrawable(Color.TRANSPARENT));
        return binding.getRoot();





        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_more_page_, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setUI();
    }


    private void setUI() {


        binding.moreRec.setHasFixedSize(true);
        binding.moreRec.setLayoutManager(new GridLayoutManager(getContext(), 4));
        List<model> models = new ArrayList<>();
        models.add(new model("Quick Meeting", R.drawable.quick_meeting));
        models.add(new model("Contact", R.drawable.contact_icon));

        models.add(new model("Mail", R.drawable.baseline_email_24_dark));
        models.add(new model("Contact", R.drawable.contact_icon));
        models.add(new model("Time Table", R.drawable.baseline_table_chart_24_dark));
        models.add(new model("Useful Link", R.drawable.useful_link));
        models.add(new model("Social Network", R.drawable.contact_icon));
        models.add(new model("Diary", R.drawable.baseline_book_24));
        models.add(new model("Archived Course", R.drawable.contact_icon));
        models.add(new model("Setting", R.drawable.baseline_settings_24));
        models.add(new model("Help", R.drawable.baseline_live_help_24_dark));
        models.add(new model("Contact Us", R.drawable.baseline_contact_phone_24));

//        More_page_Adapter more_page_adapter = new More_page_Adapter(models);
//        binding.moreRec.setAdapter(more_page_adapter);
    }
}