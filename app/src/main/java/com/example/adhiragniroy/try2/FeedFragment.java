package com.example.adhiragniroy.try2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.adhiragniroy.try2.aboutfragment;



public class FeedFragment extends Fragment {
View myView;

@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView=inflater.inflate(R.layout.feed_back,container,false);

        return myView;
        }
}