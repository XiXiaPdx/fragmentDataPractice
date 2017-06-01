package com.example.guest.moviesearch;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements Communicator {
@Bind(R.id.titleTextView)
TextView mTitleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    public void setTitleText (String str){
        mTitleText.setText(str);
    }

    public void toggleTitleText (){

    }

    public void printInput(String testinput){
        Log.d("Test testinput string", testinput);
    }

    @Override
    public void transportDog(Dog newDog) {
        FragmentManager manager = getSupportFragmentManager();

        FragmentTwo f2 = (FragmentTwo) manager.findFragmentById(R.id.fragmentTwo);
        f2.receiveDog(newDog);



    }
}
