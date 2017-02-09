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
public class NuevoReporteFragment extends Fragment {


    public NuevoReporteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Activity mainActivity = getActivity();
        if(mainActivity instanceof MainActivity){
            ((MainActivity)getActivity()).getSupportActionBar().setTitle("Nuevo Reporte");
        }
        View fragmentReporte = inflater.inflate(R.layout.fragment_nuevo_reporte, container, false);

        return fragmentReporte;
    }



}
