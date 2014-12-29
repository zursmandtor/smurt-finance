package com.rudenko.android.wallet21.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rudenko.android.wallet21.R;


public class TopLineFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.top_line, container, false);
    }


    @Override
    public void onStart() {
        super.onStart();
    }

}
