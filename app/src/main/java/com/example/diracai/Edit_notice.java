package com.example.diracai;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.diracai.databinding.FragmentEditNoticeBinding;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class Edit_notice extends BottomSheetDialogFragment {

    FragmentEditNoticeBinding binding;

    String[] subject = {"","Hindi","Biology", "Physics", "Mathematics"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentEditNoticeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        setUi();
//        startEditTextBtnSheet();
    }

//
//    private void setUi() {
//        ArrayAdapter adapter = new ArrayAdapter(getContext(), R.layout.spinner_custom, subject);
//        binding.spinner.setAdapter(adapter);
//
//    }
//
//    private void startEditTextBtnSheet() {
//        Intent intent = new Intent(getContext(), About_edit_text.class);
//        intent.putExtra("about", binding.editNotice.getText().toString());
//        startActivity(intent);
//
//        //activityResultLauncher.launch(intent);
//    }

}