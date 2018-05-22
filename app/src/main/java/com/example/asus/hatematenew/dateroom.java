package com.example.asus.hatematenew;

import android.content.Intent;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.TextView;

public class dateroom extends AppCompatActivity {
    private static final String TAG = "dateroom";
    private SectionPageAdapter mSectionPageAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dateroom);
//
//        ViewPager viewPager = (ViewPager)findViewById(R.id.container);
//        viewPager.setAdapter(new mSectionPageAdapter(this));
//        Log.d(TAG, "onCreate: Starting.");
//
//        mSectionPageAdapter = new SectionPageAdapter(getSupportFragmentManager());
//
//        mViewPager = (ViewPager)findViewById(R.id.container);
//
//
//        setupViewPager(mViewPager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
//        tabLayout.setupWithViewPager(mViewPager);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        TabItem tabPlaces = findViewById(R.id.tabPlaces);
        TabItem tabChat = findViewById(R.id.tabChat);
        ViewPager viewPager = findViewById(R.id.container);
        SectionPageAdapter pageAdapter = new SectionPageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));


        /*DHIRA INI GIMANA GW MAU BIKIN TABNYA BISA DIKLIK*/
        /*
        tabPlaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), places_fragment.class);
                startActivity(intent);
            }
        });

        tabChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), chat_fragment.class);
                startActivity(intent);
            }
        });
        */
    }

//    private void setupViewPager(ViewPager viewPager){
//        SectionPageAdapter adapter = new SectionPageAdapter(getSupportFragmentManager());
//        adapter.addFragment(new places_fragment(), "PLACES");
//        adapter.addFragment(new chat_fragment(), "CHAT");
//        viewPager.setAdapter(adapter);
//    }

}
