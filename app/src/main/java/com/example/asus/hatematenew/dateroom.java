package com.example.asus.hatematenew;

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

import android.widget.TextView;

public class dateroom extends AppCompatActivity {
    private static final String TAG = "dateroom";
    private SectionPageAdapter mSectionPageAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dateroom);

//        ViewPager viewPager = (ViewPager)
//        Log.d(TAG, "onCreate: Starting.");
//
//        mSectionPageAdapter = new SectionPageAdapter(getSupportFragmentManager());
//
//        mViewPager = (ViewPager)findViewById(R.id.container);
//
//
//        setupViewPager(mViewPager);
//        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
//        tabLayout.setupWithViewPager(mViewPager);
    }

    private void setupViewPager(ViewPager viewPager){
        SectionPageAdapter adapter = new SectionPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new places_fragment(), "PLACES");
        adapter.addFragment(new chat_fragment(), "CHAT");
        viewPager.setAdapter(adapter);
    }

}
