package com.example.myapplication.fragments;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication.R;

import java.time.LocalDate;

public class ProfileFragment extends Fragment {

    private TextView firstName, lastName;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_profile, container,false);
        firstName = v.findViewById(R.id.firstName);
        lastName = v.findViewById(R.id.lastName);
        Bundle extras = getActivity().getIntent().getExtras();

        if (extras != null)
        {
            String strFirst = extras.getString("firstName");
            String strLast = extras.getString("lastName");

            firstName.setText(strFirst);
            lastName.setText(strLast);
        }

        return v;
    }


}