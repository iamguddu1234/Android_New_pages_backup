package com.example.diracai;

import android.content.res.Resources;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.diracai.databinding.FragmentBlankBinding;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.ArrayList;
import java.util.List;


public class BlankFragment extends BottomSheetDialogFragment {

    FragmentBlankBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentBlankBinding.inflate(getLayoutInflater(), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setBottonSheet(view);

        setCollapsingtoolbar();

        setRecyclerView();

        setUi();


    }

    private void setCollapsingtoolbar() {
        final int[] totalScrollRange = new int[1];

        binding.discussionAppBarLayout.addOnOffsetChangedListener((appBarLayout, verticalOffset) -> {

            totalScrollRange[0] = binding.discussionAppBarLayout.getTotalScrollRange();
            if (verticalOffset == (-1) * totalScrollRange[0]) {
                binding.discussionCollapsingToolbar.setTitle("Discussion-6");
                binding.discussionToolbar.setNavigationIcon(R.drawable.ic_arrow_back);
                binding.discussionToolbar.setNavigationOnClickListener(view1 -> onBackPressed());
            } else if (verticalOffset == 0) {
                binding.discussionToolbar.setTitle(" ");
                binding.discussionToolbar.setNavigationIcon(R.drawable.ic_arrow_back);
                binding.discussionToolbar.setNavigationOnClickListener(view1 -> onBackPressed());
            } else {
                binding.discussionToolbar.setNavigationIcon(null);
                binding.discussionCollapsingToolbar.setTitle("");
            }

        });
    }


    private void setBottonSheet(View view) {

        BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.from((View) view.getParent());
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
        bottomSheetBehavior.addBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {

            }
        });

        CoordinatorLayout layout = binding.discussionDetailsCodntlayout;
        if (layout != null) {
            layout.setMinimumHeight(Resources.getSystem().getDisplayMetrics().heightPixels);
        }

    }

    private void onBackPressed() {
        dismiss();
    }

    private void setRecyclerView() {

        binding.recV.setHasFixedSize(true);
        binding.recV.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        List<Chat_Model> chat_models = new ArrayList<>();
        chat_models.add(new Chat_Model("Akshay Bhasme", "Android is a mobile operating system based on a modified version of the Linux kernel and other open-", "Dec 21 2023"));
        chat_models.add(new Chat_Model("Amar sinha", "Android is a mobile operating system based on a modified version of the Linux kernel and other open-", "Yesterday"));
        chat_models.add(new Chat_Model("Amit Meshram", "Awesome", "10.22am"));
        Comment_Adapter comment_adapter = new Comment_Adapter(chat_models);
        binding.recV.setAdapter(comment_adapter);

    }

    private void setUi() {
        binding.addComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.commentContainer.setVisibility(View.VISIBLE);
                binding.cancelBtn.setVisibility(View.VISIBLE);

                binding.cancelBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        binding.commentContainer.setVisibility(View.GONE);
                        binding.cancelBtn.setVisibility(View.GONE);
                    }
                });
            }
        });
    }
}