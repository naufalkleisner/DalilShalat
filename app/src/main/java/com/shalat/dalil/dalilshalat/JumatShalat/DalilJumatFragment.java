package com.shalat.dalil.dalilshalat.JumatShalat;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shalat.dalil.dalilshalat.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class DalilJumatFragment extends Fragment {


    public DalilJumatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dalil_jumat, container, false);
    }

}
