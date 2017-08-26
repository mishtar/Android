package jkvillavo12col.com.co.losviews.custom.spinners;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

import jkvillavo12col.com.co.losviews.R;
import jkvillavo12col.com.co.losviews.entities.Persona;

/**
 * Created by JkVillavo12Col on 17/10/16.
 */

public class AdapterOtro extends ArrayAdapter<Persona> {

   ArrayList<Persona> personas;
   private Context context;

   public AdapterOtro (Context context, ArrayList<Persona> objects) {

      super(context, R.layout.custom_spinner_view, objects);
      this.context = context;
      this.personas = objects;
   }

   @NonNull
   @Override
   public View getView (int position, View convertView, ViewGroup parent) {

      return super.getView(position, convertView, parent);
   }

   @Override
   public View getDropDownView (int position, View convertView, ViewGroup parent) {

      return super.getDropDownView(position, convertView, parent);
   }

   private Persona getPersona (int position) {

      return personas.get(position);
   }
}
