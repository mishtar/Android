package jkvillavo12col.com.co.losviews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import jkvillavo12col.com.co.losviews.entities.Persona;

public class Main3Activity extends AppCompatActivity {

   @Override
   protected void onCreate (Bundle savedInstanceState) {

      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main3);
   }

   public void irAOtroLado (View view) {

      Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
      Bundle bundle = new Bundle();
      bundle.putSerializable("persona", new Persona("Sebastián", "Arboleda Salinas", "1152439568", "Masculino"));
      intent.putExtras(bundle);
      startActivity(intent);
   }
}
