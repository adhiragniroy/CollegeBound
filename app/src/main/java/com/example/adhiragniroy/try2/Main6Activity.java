package com.example.adhiragniroy.try2;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Main6Activity extends Fragment {

    public static Main6Activity newInstance(){
        Main6Activity fragment = new Main6Activity();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //connecting the fragment to our layout, new_frag
        View rootView = inflater.inflate(R.layout.activity_main6, container, false);
        return rootView;
    }


}



