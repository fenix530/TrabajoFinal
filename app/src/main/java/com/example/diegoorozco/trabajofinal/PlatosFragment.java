package com.example.diegoorozco.trabajofinal;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlatosFragment extends Fragment {


    public PlatosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View inputfragment1=inflater.inflate(R.layout.fragment_platos,container,false);

        Button Sopa1=(Button)inputfragment1.findViewById(R.id.bSopa1);
        Button Sopa2=(Button)inputfragment1.findViewById(R.id.bSopa2);
        Button Sopa3=(Button)inputfragment1.findViewById(R.id.bSopa3);
        Button Sopa4=(Button)inputfragment1.findViewById(R.id.bSopa4);
        Button Pasta1=(Button)inputfragment1.findViewById(R.id.Pasta1Camar);
        Button Pasta2=(Button)inputfragment1.findViewById(R.id.Pasta2Carbo);
        Button Pasta3=(Button)inputfragment1.findViewById(R.id.Pasta3Bolo);
        Button Pasta4=(Button)inputfragment1.findViewById(R.id.Pasta4Alfre);
        Button Ensalada1=(Button)inputfragment1.findViewById(R.id.Ensala1Cesar);
        Button Ensalada2=(Button)inputfragment1.findViewById(R.id.Ensala2Gour);
        Button Ensalada3=(Button)inputfragment1.findViewById(R.id.Ensala3Camaro);
        Button Ensalada4=(Button)inputfragment1.findViewById(R.id.Ensala4Tropic);

        Sopa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), BasePlatos.class);
                i.putExtra("plato","Sopa1");
                getActivity().startActivity(i);
            }
        });

        Sopa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), BasePlatos.class);
                i.putExtra("plato","Sopa2");
                getActivity().startActivity(i);
            }
        });

        Sopa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), BasePlatos.class);
                i.putExtra("plato","Sopa3");
                getActivity().startActivity(i);
            }
        });

        Sopa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), BasePlatos.class);
                i.putExtra("plato","Sopa4");
                getActivity().startActivity(i);
            }
        });

        Pasta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), BasePlatos.class);
                i.putExtra("plato","Pasta1");
                getActivity().startActivity(i);
            }
        });

        Pasta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), BasePlatos.class);
                i.putExtra("plato","Pasta2");
                getActivity().startActivity(i);
            }
        });

        Pasta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), BasePlatos.class);
                i.putExtra("plato","Pasta3");
                getActivity().startActivity(i);
            }
        });

        Pasta4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), BasePlatos.class);
                i.putExtra("plato","Pasta4");
                getActivity().startActivity(i);
            }
        });

        Ensalada1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), BasePlatos.class);
                i.putExtra("plato","Ensalada1");
                getActivity().startActivity(i);
            }
        });

        Ensalada2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), BasePlatos.class);
                i.putExtra("plato","Ensalada2");
                getActivity().startActivity(i);
            }
        });

        Ensalada3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), BasePlatos.class);
                i.putExtra("plato","Ensalada3");
                getActivity().startActivity(i);
            }
        });

        Ensalada4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), BasePlatos.class);
                i.putExtra("plato","Ensalada4");
                getActivity().startActivity(i);
            }
        });

        return inputfragment1;
    }

}
