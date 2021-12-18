package com.example.fragmentlifecycle;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "onCreate invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity", "onStart invoked");
    }

    public void selectFragment(View view) {

        Fragment fr;
        if (view == findViewById(R.id.button1)) {
            fr = new FragmentOne();
        } else {
            fr = new FragmentTwo();
        }

        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_section, fr);
        fragmentTransaction.commit();
    }
}