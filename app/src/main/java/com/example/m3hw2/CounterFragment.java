package com.example.m3hw2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class CounterFragment extends Fragment {

    private int counterValue = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_counter, container, false);

        Button button = view.findViewById(R.id.button_navigate);
        button.setOnClickListener(v -> {
            counterValue++;
            Bundle bundle = new Bundle();
            bundle.putInt("counterValue", counterValue);
            Navigation.findNavController(v).navigate(R.id.action_counterFragment_to_resultFragment, bundle);
        });

        return view;
    }
}
