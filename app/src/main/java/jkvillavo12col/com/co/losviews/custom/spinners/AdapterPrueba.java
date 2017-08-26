package jkvillavo12col.com.co.losviews.custom.spinners;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import jkvillavo12col.com.co.losviews.R;
import jkvillavo12col.com.co.losviews.entities.Persona;

/**
 * Created by JuanCarlos on 15/02/2016.
 */
public class AdapterPrueba extends ArrayAdapter<Persona> {

   private ArrayList<Persona> arrayList;
   private Context context;

   public AdapterPrueba (Context context, ArrayList<Persona> objects) {

      super(context, R.layout.custom_spinner_view, objects);
      arrayList = objects;
      this.context = context;
   }

   public Persona getPersona (int i) {

      return arrayList.get(i);
   }

   @Override
   public View getView (int position, View convertView, ViewGroup parent) {

      ViewHolder viewHolder;

      if (convertView == null) {
         // inflate the layout
         LayoutInflater inflater = ((Activity) context).getLayoutInflater();
         convertView = inflater.inflate(R.layout.custom_spinner_view, parent, false);
         // well set up the ViewHolder
         viewHolder = new ViewHolder();
         viewHolder.textViewNombres = (TextView) convertView.findViewById(R.id.custom_spinner_viewTextView);
         // store the holder with the view.
         convertView.setTag(viewHolder);
      } else {
         // we've just avoided calling findViewById() on resource everytime
         // just use the viewHolder
         viewHolder = (ViewHolder) convertView.getTag();
      }
      // object item based on the position
      Persona persona = arrayList.get(position);

      // assign values if the object is not null
      if (persona != null) {
         // get the TextView from the ViewHolder and then set the text (item name) and tag (item ID) values
         viewHolder.textViewNombres.setText(persona.getNombre());

      }

      return convertView;
   }

   @Override
   public View getDropDownView (int position, View convertView, ViewGroup parent) {

      ViewHolder viewHolder;

      if (convertView == null) {
         // inflate the layout
         LayoutInflater inflater = ((Activity) context).getLayoutInflater();
         convertView = inflater.inflate(R.layout.custom_spinner_dropdown, parent, false);
         // well set up the ViewHolder
         viewHolder = new ViewHolder();
         viewHolder.textViewNombres = (TextView) convertView.findViewById(R.id.custom_spinner_dropNombre);
         viewHolder.textViewApellidos = (TextView) convertView.findViewById(R.id.custom_spinner_dropApellido);
         viewHolder.textViewSexo = (TextView) convertView.findViewById(R.id.custom_spinner_dropDocumento);
         viewHolder.textViewNroDocumento = (TextView) convertView.findViewById(R.id.custom_spinner_dropSexo);
         // store the holder with the view.
         convertView.setTag(viewHolder);
      } else {
         // we've just avoided calling findViewById() on resource everytime
         // just use the viewHolder
         viewHolder = (ViewHolder) convertView.getTag();
      }
      // object item based on the position
      Persona empresa = arrayList.get(position);

      // assign values if the object is not null
      if (empresa != null) {
         // get the TextView from the ViewHolder and then set the text (item name) and tag (item ID) values
         viewHolder.textViewNombres.setText(empresa.getNombre());
         viewHolder.textViewApellidos.setText(empresa.getApellido());
         viewHolder.textViewNroDocumento.setText(empresa.getNroDocumento());
         viewHolder.textViewSexo.setText(empresa.getSexo());

      }

      return convertView;
   }

   static class ViewHolder {

      TextView textViewNombres, textViewApellidos, textViewNroDocumento, textViewSexo;
   }

}
