package jkvillavo12col.com.co.losviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

   private Button button;

   @Override
   protected void onCreate (Bundle savedInstanceState) {

      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main_otros);
   }

   @Override
   protected void onStart () {

      super.onStart();
      button = (Button) findViewById(R.id.elinclude).findViewById(R.id.buttonDePruebaInclude);
      button.setText("Un cambio de texto");
   }
}
