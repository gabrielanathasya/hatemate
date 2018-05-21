package com.example.asus.hatematenew;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionPageAdapter extends FragmentPagerAdapter{
//    private final List<Fragment> mFragmentList = new ArrayList<>();
//    private final List<String> mFragmentTitleList = new ArrayList<>();
//
//    public void addFragment(Fragment fragment, String title){
//        mFragmentList.add(fragment);
//        mFragmentTitleList.add(title);
//    }
//
//    public SectionPageAdapter(FragmentManager fm){
//        super(fm);
//    }
//
//    @Override
//    public CharSequence getPageTitle(int position){
//        return mFragmentTitleList.get(position);
//    }
//
//    @Override
//    public Fragment getItem(int position){
//        return mFragmentList.get(position);
//    }
//
//    @Override
//    public int getCount(){
//        return mFragmentList.size();
//    }

    private int numOfTabs;

    SectionPageAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new places_fragment();
            case 1:
                return new chat_fragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }

}
