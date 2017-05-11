package com.example.adhiragniroy.try2;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by adhiragniroy on 16/04/16.
 */
public class fourthfragment extends Fragment {
View myView;
    TextView v;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView=inflater.inflate(R.layout.fourth_layout,container,false);

        return myView;
    }


}
