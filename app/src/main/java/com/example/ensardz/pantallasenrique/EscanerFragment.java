package com.example.ensardz.pantallasenrique;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class EscanerFragment extends Fragment {


    public EscanerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Activity mainActivity = getActivity();
        if(mainActivity instanceof MainActivity){
            ((MainActivity)getActivity()).getSupportActionBar().setTitle("Escanear");
        }

        View fragmentEscaner = inflater.inflate(R.layout.fragment_escaner, container, false);
        return inflater.inflate(R.layout.fragment_escaner, container, false);
    }


}
