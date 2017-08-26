package jkvillavo12col.com.co.losviews;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import jkvillavo12col.com.co.losviews.custom.spinners.AdaptadorSalas;
import jkvillavo12col.com.co.losviews.custom.spinners.AdapterPrueba;
import jkvillavo12col.com.co.losviews.entities.Persona;
import jkvillavo12col.com.co.losviews.entities.Sala;

public class MainActivity extends AppCompatActivity {

   private ArrayList listSalas;
   private AdaptadorSalas adapterPrueba = null;

   private Spinner spinner;


   @Override
   protected void onCreate (Bundle savedInstanceState) {

      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main_spinners);

      spinner = (Spinner) findViewById(R.id.spinnerTest);
      listSalas = new ArrayList();
      listSalas.add(new Sala(19,"sala 1", "temperatura fria"));
      listSalas.add(new Sala(17,"sala 2", "temperatura caliente"));
      listSalas.add(new Sala(16,"sala 3", "temperatura cálida"));
      listSalas.add(new Sala(27,"sala 4", "temperatura etc"));

      adapterPrueba = new AdaptadorSalas(MainActivity.this, listSalas);
      spinner.setAdapter(adapterPrueba);
   }

   @Override
   protected void onStart () {

      super.onStart();


      //Sala sala = adapterPrueba.getSala(1);


   }
}
