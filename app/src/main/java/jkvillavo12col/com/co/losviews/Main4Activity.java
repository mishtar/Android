package jkvillavo12col.com.co.losviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import jkvillavo12col.com.co.losviews.entities.Persona;

public class Main4Activity extends AppCompatActivity {

   private TextView textView;

   @Override
   protected void onCreate (Bundle savedInstanceState) {

      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main4);

      textView = (TextView) findViewById(R.id.mian4textView);

      Bundle bundle = getIntent().getExtras();
      Persona persona = (Persona) bundle.getSerializable("persona");
      textView.setText(persona.getNombre() + "  " + persona.getApellido() +" de sexo: " +persona.getSexo() + " y nrodocumento " + persona.getNroDocumento());

   }
}
