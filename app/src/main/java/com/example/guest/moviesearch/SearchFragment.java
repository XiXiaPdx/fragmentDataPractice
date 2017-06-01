package com.example.guest.moviesearch;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment implements View.OnClickListener {
    @Bind(R.id.searchInputText)
    EditText mSearchInputText;

    @Bind (R.id.searchTextView)
    TextView mSearchTextView;
    @Bind (R.id.searchButton)
    Button mSearchButton;


    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        ButterKnife.bind(this, view);
        mSearchButton.setOnClickListener(this);
        return view;

    }


    @Override
    public void onClick(View v) {
//        if (v == mSearchButton){
//            ((MainActivity)getActivity()).setTitleText("HI!!!!");
//        }
        if (v == mSearchButton){
            ((MainActivity)getActivity()).mTitleText.setVisibility(View.INVISIBLE);
        }

    }
}
