package com.example.diracai;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.diracai.databinding.FragmentDiscussionFragmentBinding;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.ArrayList;
import java.util.List;

public class Discussion_fragment extends BottomSheetDialogFragment {

    FragmentDiscussionFragmentBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDiscussionFragmentBinding.inflate(getLayoutInflater(), container, false);

        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setUi();
    }


    private void setUi() {

        binding.recV.setHasFixedSize(true);
        binding.recV.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));

        List<Chat_Model> chat_models = new ArrayList<>();
        chat_models.add(new Chat_Model("Discussion - 12", "Speed of light in vaccume and in side water? Speed of light in vaccume and in side water?", "Open"));
        chat_models.add(new Chat_Model("Discussion - 13", "What Is Atom ?", "Open"));
        chat_models.add(new Chat_Model("Discussion - 14", "What Is Compound ?", "Open"));
        chat_models.add(new Chat_Model("Discussion - 15", "What Is Elasticity ?", "Open"));
        chat_models.add(new Chat_Model("Discussion - 16", "Speed of light in vaccume and in side water? Speed of light in vaccume and in side water?", "Open"));
        chat_models.add(new Chat_Model("Discussion - 17", "Speed of light in vaccume and in side water? Speed of light in vaccume and in side water?", "Open"));
        Discussion_Adapter comment_adapter = new Discussion_Adapter(chat_models);

        binding.recV.setAdapter(comment_adapter);
    }

}