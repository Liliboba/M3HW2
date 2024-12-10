package com.example.m3hw2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ResultFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_result, container, false);

        TextView resultTextView = view.findViewById(R.id.textView_result);

        if (getArguments() != null) {
            int counterValue = getArguments().getInt("counterValue", 0);
            resultTextView.setText("Counter Value: " + counterValue);
        }

        return view;
    }
}
