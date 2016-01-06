package com.example.diegoorozco.trabajofinal;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class BasePlatos extends AppCompatActivity  {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_platos);

        TextView DesPlato =(TextView) findViewById(R.id.tDescrPlato);
        TextView TituPlato=(TextView) findViewById(R.id.tTituloPlato);
        ImageView portada=(ImageView) findViewById(R.id.iFoto);
        RadioGroup Bebidas=(RadioGroup) findViewById(R.id.RadioGroupBebidas);
        RadioButton RButton1=(RadioButton) findViewById(R.id.RadioUno);
        RadioButton RButton2=(RadioButton) findViewById(R.id.RadioDos);
        RadioButton RButton3=(RadioButton) findViewById(R.id.RadioTres);
        RadioButton RButton4=(RadioButton) findViewById(R.id.RadioCuatro);
        RadioButton RButton5=(RadioButton) findViewById(R.id.RadioCinco);
        RadioButton RButton6=(RadioButton) findViewById(R.id.RadioSeis);
        RadioButton RButton7=(RadioButton) findViewById(R.id.RadioSiete);

        Button oreden= (Button) findViewById(R.id.bAnadOrden);

        Bundle bundle=getIntent().getExtras();
        String control=bundle.getString("plato");

        switch (control)
        {
            case "Entrada2":
                TituPlato.setText(getString(R.string.Entrada3));
                portada.setImageResource(R.drawable.mini_sandwich_receta);
                DesPlato.setText(getString(R.string.DesEntra2));
                break;
            case "Entrada3":
                TituPlato.setText(getString(R.string.Entrada2));
                portada.setImageResource(R.drawable.brochetta);
                DesPlato.setText(getString(R.string.DesEntra3));
                break;
            case "Entrada4":
                TituPlato.setText(getString(R.string.Entrada4));
                portada.setImageResource(R.drawable.entrada4);
                DesPlato.setText(getString(R.string.DesEntra4));
                break;
            case "Sopa1":
                TituPlato.setText(getString(R.string.Plato1));
                portada.setImageResource(R.drawable.sopa_champi);
                DesPlato.setText(getString(R.string.DesSopa1));
                break;
            case "Sopa2":
                TituPlato.setText(getString(R.string.Plato2));
                portada.setImageResource(R.drawable.crema_espinaca);
                DesPlato.setText(getString(R.string.DesSopa2));
                break;
            case "Sopa3":
                TituPlato.setText(getString(R.string.Plato3));
                portada.setImageResource(R.drawable.sopa_de_tortilla);
                DesPlato.setText(getString(R.string.DesSopa3));
                break;
            case "Sopa4":
                TituPlato.setText(getString(R.string.Plato4));
                portada.setImageResource(R.drawable.sopa_de_cebolla_gratinada_con_emmental);
                DesPlato.setText(getString(R.string.DesSopa4));
                break;
            case "Pasta1":
                TituPlato.setText(getString(R.string.Plato5));
                portada.setImageResource(R.drawable.pastas_camarones);
                DesPlato.setText(getString(R.string.DesPasta1));
                break;
            case "Pasta2":
                TituPlato.setText(getString(R.string.Plato6));
                portada.setImageResource(R.drawable.spaghetti_carbonara);
                DesPlato.setText(getString(R.string.DesPasta2));
                break;
            case "Pasta3":
                TituPlato.setText(getString(R.string.Plato7));
                portada.setImageResource(R.drawable.bolonesa);
                DesPlato.setText(getString(R.string.DesPasta3));
                break;
            case "Pasta4":
                TituPlato.setText(getString(R.string.Plato8));
                portada.setImageResource(R.drawable.alfredo);
                DesPlato.setText(getString(R.string.DesPasta4));
                break;
            case "Ensalada1":
                TituPlato.setText(getString(R.string.Ensalada1));
                portada.setImageResource(R.drawable.ensalada_cesar_pollo);
                DesPlato.setText(getString(R.string.DesEnsa1));
                break;
            case "Ensalada2":
                TituPlato.setText(getString(R.string.Ensalada2));
                portada.setImageResource(R.drawable.gourmet);
                DesPlato.setText(getString(R.string.DesEnsa2));
                break;
            case "Ensalada3":
                TituPlato.setText(getString(R.string.Enalada4));
                portada.setImageResource(R.drawable.ensalada_de_camarones_y_mango);
                DesPlato.setText(getString(R.string.DesEnsa3));
                break;
            case "Ensalada4":
                TituPlato.setText(getString(R.string.Ensalada3));
                portada.setImageResource(R.drawable.ensalada_tropical);
                DesPlato.setText(getString(R.string.DesEnsa4));
                break;
            case "JugosAgua":
                TituPlato.setText(getString(R.string.JugAgu));
                portada.setImageResource(R.drawable.bedidas_agua);
                DesPlato.setText(getString(R.string.DesJugAgu));
                Bebidas.setVisibility(View.VISIBLE);
                break;
            case "JugosLeche":
                TituPlato.setText(getString(R.string.JugLec));
                portada.setImageResource(R.drawable.bebidas_leche);
                DesPlato.setText(getString(R.string.DesJugLec));
                Bebidas.setVisibility(View.VISIBLE);
                break;
            case "Gaseosas":
                TituPlato.setText(getString(R.string.gaseos));
                portada.setImageResource(R.drawable.cocacola_1);
                DesPlato.setText(getString(R.string.DesGas));
                Bebidas.setVisibility(View.VISIBLE);
                RButton1.setText("Coca-Cola");
                RButton2.setText("Sprite");
                RButton3.setText("Qatro");
                RButton4.setText("Fanta Manzana");
                RButton5.setText("Coca-Cola Zero");
                RButton6.setText("Coca-Cola Light");
                RButton7.setText("Tea Helado");
                break;
            case "Cervezas":
                TituPlato.setText(getString(R.string.cerveza));
                portada.setImageResource(R.drawable.cerveza1);
                DesPlato.setText(getString(R.string.DesCer));
                Bebidas.setVisibility(View.VISIBLE);
                RButton1.setText("Pilsen.............4.000");
                RButton2.setText("Club Colombia......4.000");
                RButton3.setText("Miller.............5.000");
                RButton4.setText("Aguila.............4.000");
                RButton5.setText("Aguila Light.......4.500");
                RButton6.setText("Reeds..............4.500");
                RButton7.setVisibility(View.GONE);
                break;
            case "VinoTinto":
                TituPlato.setText(getString(R.string.VinoTin));
                portada.setImageResource(R.drawable.vino_tinto);
                DesPlato.setText(getString(R.string.DesVinT));
                Bebidas.setVisibility(View.VISIBLE);
                RButton1.setText("Gato Negro...............35.000");
                RButton2.setText("Casillero del Diablo.....45.000");
                RButton3.setText("Trio.....................50.000");
                RButton4.setVisibility(View.GONE);
                RButton5.setVisibility(View.GONE);
                RButton6.setVisibility(View.GONE);
                RButton7.setVisibility(View.GONE);
                break;
            case "VinoBlanco":
                TituPlato.setText(getString(R.string.VinoBla));
                portada.setImageResource(R.drawable.vino_blanco);
                DesPlato.setText(getString(R.string.DesVinB));
                Bebidas.setVisibility(View.VISIBLE);
                RButton1.setText("Argento.........30.000");
                RButton2.setText("Casa Boher......38.000");
                RButton3.setText("Mantra..........40.000");
                RButton4.setVisibility(View.GONE);
                RButton5.setVisibility(View.GONE);
                RButton6.setVisibility(View.GONE);
                RButton7.setVisibility(View.GONE);
                break;
            case "VinoRosado":
                TituPlato.setText(getString(R.string.VinoRos));
                portada.setImageResource(R.drawable.vino_rosada);
                DesPlato.setText(getString(R.string.DesVinR));
                Bebidas.setVisibility(View.VISIBLE);
                RButton1.setText("Kaiken.....28.000");
                RButton2.setText("Rosé.......37.000");
                RButton3.setText("Malbec.....49.000");
                RButton4.setVisibility(View.GONE);
                RButton5.setVisibility(View.GONE);
                RButton6.setVisibility(View.GONE);
                RButton7.setVisibility(View.GONE);
                break;
            case "LicorClaro":
                TituPlato.setText(getString(R.string.LicBla));
                portada.setImageResource(R.drawable.licor_blanco);
                DesPlato.setText(getString(R.string.DesLicB));
                Bebidas.setVisibility(View.VISIBLE);
                RButton1.setText("Wodka...........35.000");
                RButton2.setText("Aguardiente.....18.000");
                RButton3.setText("Ginebra.........45.000");
                RButton4.setVisibility(View.GONE);
                RButton5.setVisibility(View.GONE);
                RButton6.setVisibility(View.GONE);
                RButton7.setVisibility(View.GONE);
                break;

            case "LicorOscuro":
                TituPlato.setText(getString(R.string.LicOsc));
                portada.setImageResource(R.drawable.whisky);
                DesPlato.setText(getString(R.string.DesLicO));
                Bebidas.setVisibility(View.VISIBLE);
                RButton1.setText("Ron...........19.000");
                RButton2.setText("Tequila.......58.000");
                RButton3.setText("Brandy........55.000");
                RButton4.setText("Whisky........65.000");
                RButton5.setVisibility(View.GONE);
                RButton6.setVisibility(View.GONE);
                RButton7.setVisibility(View.GONE);
                break;


        }
    }
}
