package com.example.fragmentlifecycle;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentOne extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("FragmentOne", "onCreateView invoked");
        return inflater.inflate(R.layout.fragment_one, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("FragmentOne", "onStart invoked");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("FragmentOne", "onResume invoked");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("FragmentOne", "onPause invoked");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("FragmentOne", "onStop invoked");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("FragmentOne", "onDestroyView invoked");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("FragmentOne", "onDestroy invoked");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("FragmentOne", "onDetach invoked");
    }
}