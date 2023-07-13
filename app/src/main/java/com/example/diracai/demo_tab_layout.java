package com.example.diracai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class demo_tab_layout extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    private TextView selectedTextView;  // To keep track of the currently selected TextView


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_tab_layout);


        // Find and initialize the ViewPager and TabLayout
        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);

        // Create the adapter
        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager());

        // Set the adapter to the ViewPager
        viewPager.setAdapter(adapter);

        // Set up the TabLayout with the ViewPager
        tabLayout.setupWithViewPager(viewPager);

        TextView textView1 = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);
        TextView textView4 = findViewById(R.id.textView4);
        TextView textView5 = findViewById(R.id.textView5);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(0);
                handleTextClick(textView1);

            }
        });


        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(1);
                handleTextClick(textView2);

            }
        });

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(2);
                handleTextClick(textView3);

            }
        });

        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(3);
                handleTextClick(textView4);

            }
        });

        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(4);
                handleTextClick(textView5);

            }
        });
        handleTextClick(textView1);


    }

    // Adapter class
    private class MyPagerAdapter extends FragmentPagerAdapter {

        private String[] fragmentTitles = {
                "Fragment 1",
                "Fragment 2",
                "Fragment 3",
                "Fragment 4",
                "Fragment 5"
        };

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // Return the appropriate fragment based on the position
            switch (position) {
                case 0:
                    return new Fragment1();
                case 1:
                    return new Fragment2();
                case 2:
                    return new Fragment3();
                case 3:
                    return new Fragment4();
                case 4:
                    return new Fragment5();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            // Return the number of fragments
            return fragmentTitles.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            // Return the title of the fragment at the specified position
            return fragmentTitles[position];
        }
    }


    private void handleTextClick(TextView textView) {
        if (selectedTextView != null) {
            // Restore the background color and text color of the previously selected TextView
            selectedTextView.setBackgroundColor(Color.TRANSPARENT);
            selectedTextView.setTextColor(Color.BLACK);
        }

        // Check if the clicked TextView is the same as the previously selected TextView
        if (selectedTextView != textView) {
            // Set the background color and text color of the clicked TextView
//            textView.setBackgroundColor(Color.YELLOW);
            textView.setBackgroundColor(ContextCompat.getColor(this, R.color.theme_color));

            textView.setTextColor(ContextCompat.getColor(this,R.color.WHITE));
            selectedTextView = textView;  // Update the selectedTextView variable
        } else {
            // The same TextView is clicked again, restore its default color
            textView.setBackgroundColor(Color.TRANSPARENT);
            textView.setTextColor(Color.BLACK);
            selectedTextView = null;  // Clear the selectedTextView variable
        }
    }

}
