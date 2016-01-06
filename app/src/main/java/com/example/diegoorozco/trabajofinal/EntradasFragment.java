package com.example.diegoorozco.trabajofinal;



import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;



/**
 * A simple {@link Fragment} subclass.
 */
public class EntradasFragment extends Fragment {


    public EntradasFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inputfragment2=inflater.inflate(R.layout.fragment_entradas,container,false);

        Button Entrada1=(Button)inputfragment2.findViewById(R.id.bEntra1);
        Button Entrada2=(Button)inputfragment2.findViewById(R.id.bEntra2);
        Button Entrada3=(Button)inputfragment2.findViewById(R.id.bEntra3);
        Button Entrada4=(Button)inputfragment2.findViewById(R.id.bEntra4);

        Entrada1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), BasePlatos.class);
                i.putExtra("plato","Entrada1");
                getActivity().startActivity(i);
            }
        });

        Entrada2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), BasePlatos.class);
                i.putExtra("plato","Entrada2");
                getActivity().startActivity(i);
            }
        });
        Entrada3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), BasePlatos.class);
                i.putExtra("plato","Entrada3");
                getActivity().startActivity(i);
            }
        });
        Entrada4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), BasePlatos.class);
                i.putExtra("plato","Entrada4");
                getActivity().startActivity(i);
            }
        });


        return inputfragment2;
    }


}