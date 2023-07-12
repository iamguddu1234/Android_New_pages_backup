package com.example.diracai;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.diracai.databinding.FragmentContactsPageFragBinding;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.ArrayList;
import java.util.List;


public class Contacts_Page_frag extends Fragment {

    FragmentContactsPageFragBinding binding;
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentContactsPageFragBinding.inflate(inflater, container, false);


        binding.addContactCardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Contact_add_contact_page contact_add_contact_page = new Contact_add_contact_page();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.contact_page_fragment, contact_add_contact_page);
                fragmentTransaction.addToBackStack(null);
                binding.contactPageFragment.removeAllViews();
                fragmentTransaction.commit();

            }
        });


        return binding.getRoot();
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_contacts__page_frag, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setUi();
    }

    private void setUi() {


        binding.contactRec.setHasFixedSize(true);
        binding.contactRec.setLayoutManager(new GridLayoutManager(getContext(), 2));
        List<model> models = new ArrayList<>();
        models.add(new model("Bibhudutta  Mahakud", R.drawable.student));
        models.add(new model("Akshay Bhasme", R.drawable.student));
        models.add(new model("Akshay Bhasme", R.drawable.student));
        models.add(new model("Akshay Bhasme", R.drawable.student));
        models.add(new model("Akshay Bhasme", R.drawable.student));
        models.add(new model("Akshay Bhasme", R.drawable.student));
        models.add(new model("Akshay Bhasme", R.drawable.student));
        models.add(new model("Akshay Bhasme", R.drawable.student));
        models.add(new model("Akshay Bhasme", R.drawable.student));
        models.add(new model("Akshay Bhasme", R.drawable.student));
        Contact_Adapter contact_adapter = new Contact_Adapter(models, getContext());
        binding.contactRec.setAdapter(contact_adapter);
    }


}