package com.example.adhiragniroy.try2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by adhiragniroy on 20/04/16.
 */
public interface MainewActivity {
    View onCreateView(LayoutInflater inflater, ViewGroup container,
                      Bundle savedInstanceState);

    void onCreate(Bundle savedInstanceState);
}
