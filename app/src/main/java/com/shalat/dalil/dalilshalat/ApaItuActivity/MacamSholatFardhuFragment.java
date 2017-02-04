package com.shalat.dalil.dalilshalat.ApaItuActivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shalat.dalil.dalilshalat.R;


/**
 * Created by Ratan on 7/29/2015.
 */
public class MacamSholatFardhuFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.macamsholatfardhu_layout,null);
    }


}
