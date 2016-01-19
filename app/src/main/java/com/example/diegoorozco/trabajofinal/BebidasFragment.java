package com.example.diegoorozco.trabajofinal;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class BebidasFragment extends Fragment {


    public BebidasFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View inputfragment=inflater.inflate(R.layout.fragment_bebidas,container,false);
        // Inflate the layout for this fragment

        Button JugoLeche = (Button)inputfragment.findViewById(R.id.bJugoLeche);
        Button JugoAgua =(Button)inputfragment.findViewById(R.id.bJugAgua);
        Button Gaseosa =(Button)inputfragment.findViewById(R.id.bGaseosa);
        Button Cerveza= (Button) inputfragment.findViewById(R.id.bCerveza);
        Button VinoTinto= (Button) inputfragment.findViewById(R.id.bVinoT);
        Button VinoBlanco= (Button)inputfragment.findViewById(R.id.bVinoB);
        Button VinoRosado= (Button)inputfragment.findViewById(R.id.bVinoR);
        Button LicorClaro=(Button) inputfragment.findViewById(R.id.bLicorBla);
        Button LicorOscuro=(Button) inputfragment.findViewById(R.id.bLicorOscur);



        JugoAgua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), BasePlatos.class);
                i.putExtra("plato","JugosAgua");
                getActivity().startActivity(i);
            }
        });

        JugoLeche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), BasePlatos.class);
                i.putExtra("plato","JugosLeche");
                getActivity().startActivity(i);
            }
        });

        Gaseosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), BasePlatos.class);
                i.putExtra("plato", "Gaseosas");
                getActivity().startActivity(i);
            }
        });

        Cerveza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), BasePlatos.class);
                i.putExtra("plato", "Cervezas");
                getActivity().startActivity(i);
            }
        });

        VinoTinto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), BasePlatos.class);
                i.putExtra("plato", "VinoTinto");
                getActivity().startActivity(i);
            }
        });

        VinoBlanco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), BasePlatos.class);
                i.putExtra("plato", "VinoBlanco");
                getActivity().startActivity(i);
            }
        });
        VinoRosado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), BasePlatos.class);
                i.putExtra("plato", "VinoRosado");
                getActivity().startActivity(i);
            }
        });

        LicorClaro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), BasePlatos.class);
                i.putExtra("plato", "LicorClaro");
                getActivity().startActivity(i);
            }
        });

        LicorOscuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), BasePlatos.class);
                i.putExtra("plato", "LicorOscuro");
                getActivity().startActivity(i);
            }
        });

        return inputfragment;
    }


}
