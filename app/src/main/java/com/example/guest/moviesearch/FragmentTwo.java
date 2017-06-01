package com.example.guest.moviesearch;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTwo extends Fragment implements View.OnClickListener {
    @Bind(R.id.barkButton)
    Button barkButton;
    public Dog newDog;

    public FragmentTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        ButterKnife.bind(this, view);
        barkButton.setOnClickListener(this);
        return view;
    }

    public void receiveDog (Dog newDog){
        this.newDog = newDog;
        Log.d("dog name", newDog.getName());
    }


    @Override
    public void onClick(View v) {
        if (v == barkButton){
            Log.d("dog name", newDog.getName());

        }
    }
}
