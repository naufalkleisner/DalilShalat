package com.shalat.dalil.dalilshalat;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shalat.dalil.dalilshalat.WaktuShalat.AsharFragment;
import com.shalat.dalil.dalilshalat.WaktuShalat.DhuhurFragment;
import com.shalat.dalil.dalilshalat.WaktuShalat.IsyaaFragment;
import com.shalat.dalil.dalilshalat.WaktuShalat.MaghribFragment;
import com.shalat.dalil.dalilshalat.WaktuShalat.SubuhFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class WaktuShalatFragment extends Fragment {
    public static  TabLayout tabLayout;
    public  static ViewPager viewPager;
    public  static  int int_items = 5;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View x = inflater.inflate(R.layout.fragment_waktu_shalat,null);
        tabLayout = (TabLayout) x.findViewById(R.id.tabs);
        viewPager = (ViewPager) x.findViewById(R.id. viewpager);
        // Inflate the layout for this fragment


        viewPager.setAdapter(new MyAdapter(getChildFragmentManager()));

        tabLayout.post(new Runnable() {
            @Override
            public void run() {
                tabLayout.setupWithViewPager(viewPager);
            }
        });
        return x;
    }

    class MyAdapter extends FragmentPagerAdapter {
        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0 : return  new SubuhFragment();
                case 1 : return new DhuhurFragment();
                case  2 :return new AsharFragment();
                case 3 : return new MaghribFragment();
                case 4 :return  new IsyaaFragment();
            }
            return null;
        }

        @Override
        public int getCount() {
            return int_items;
        }

        @Override
        public  CharSequence getPageTitle(int position){
            switch (position){

                case 0 :
                    return "Subuh";
                case 1 :
                    return "Dhuhr";
                case 2 :
                    return "Ashar";
                case 3 :
                    return "Maghrib";
                case 4 :
                    return "Isya'";
            }
            return null;
        }
    }
}
