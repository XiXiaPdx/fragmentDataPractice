package com.example.guest.moviesearch;


import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.parceler.Parcels;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment implements View.OnClickListener {
    @Bind(R.id.inputText)
    EditText mInputText;

    TextView mSearchTextView;
    @Bind (R.id.showHideButton)
    Button mShowHideButton;
    @Bind (R.id.changeTextFragment) Button mChangeTextFromFragment;
    @Bind(R.id.changeTextMain) Button mChangeTextFromMain;
    @Bind(R.id.submitButton) Button mSubmit;
    Communicator comm;


    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        ButterKnife.bind(this, view);
        mShowHideButton.setOnClickListener(this);
        mChangeTextFromFragment.setOnClickListener(this);
        mChangeTextFromMain.setOnClickListener(this);
        mSubmit.setOnClickListener(this);
        // slidenerd video...https://www.youtube.com/watch?v=fvG20PAUdcU   ---  this was deep. Something about dynamic run time polymorphnism.  Essentially allow us to call a method the interface ....which can exist ANYWHERE that implements that interface.
        comm = (Communicator) getActivity();
        return view;

    }


    @Override
    public void onClick(View v) {

        if (v == mChangeTextFromMain){
            ((MainActivity)getActivity()).setTitleText("Changed From Main Method");
        }

        if (v == mChangeTextFromFragment){
            ((MainActivity)getActivity()).mTitleText.setText("Changed From Fragment");
        }


        if (v == mShowHideButton){
            if ( ((MainActivity)getActivity()).mTitleText.getVisibility() == View.INVISIBLE){
                ((MainActivity)getActivity()).mTitleText.setVisibility(View.VISIBLE);
            } else {
                ((MainActivity)getActivity()).mTitleText.setVisibility(View.INVISIBLE);
            }

        }

        if (v == mSubmit){
            String input = mInputText.getText().toString();
                        TextView textView = (TextView) getActivity().findViewById(R.id.fragmentTwoTextView);
            textView.setText(input);

            Dog newDog = new Dog( input, 7);
            //this is key...using the interface requirement on Main, we call the main method transportDog to move the object over.
           comm.transportDog(newDog);

        }

    }
}
