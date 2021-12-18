package com.example.fragmentlifecycle;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentTwo extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("FragmentTwo", "onCreateView invoked");
        return inflater.inflate(R.layout.fragment_two, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("FragmentTwo", "onStart invoked");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("FragmentTwo", "onResume invoked");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("FragmentTwo", "onPause invoked");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("FragmentTwo", "onStop invoked");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("FragmentTwo", "onDestroyView invoked");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("FragmentTwo", "onDestroy invoked");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("FragmentTwo", "onDetach invoked");
    }
}
