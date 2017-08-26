package jkvillavo12col.com.co.losviews.custom.spinners;

/**
 * Created by cl18409 on 26/08/2017.
 */
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import jkvillavo12col.com.co.losviews.R;
import jkvillavo12col.com.co.losviews.entities.Persona;
import jkvillavo12col.com.co.losviews.entities.Sala;

/**
 * Created by JkVillavo12Col on 17/10/16.
 */

public class AdaptadorSalas extends ArrayAdapter {

    private ArrayList<Sala> arrSalas;
    private Context context;

    public AdaptadorSalas(Context context, ArrayList arrSalas) {
        super(context, R.layout.custom_spinner_view, arrSalas);
        this.context=context;
        this.arrSalas=arrSalas;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolderSala viewHolder;

        if (convertView == null) {
            // inflate the layout
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            convertView = inflater.inflate(R.layout.custom_spinner_view, parent, false);
            // well set up the ViewHolder
            viewHolder = new ViewHolderSala();
            viewHolder.textViewNombreSala = (TextView) convertView.findViewById(R.id.custom_spinner_viewTextView);
            // store the holder with the view.
            convertView.setTag(viewHolder);
        } else {
            // we've just avoided calling findViewById() on resource everytime
            // just use the viewHolder
            viewHolder = (ViewHolderSala) convertView.getTag();
        }
        // object item based on the position
        Sala sala = arrSalas.get(position);

        // assign values if the object is not null
        if (sala != null) {
            // get the TextView from the ViewHolder and then set the text (item name) and tag (item ID) values
            viewHolder.textViewNombreSala.setText(sala.getNombre());

        }

        return convertView;
    }

    @Override
    public View getDropDownView (int position, View convertView, ViewGroup parent) {

        ViewHolderSala viewHolder;

        if (convertView == null) {
            // inflate the layout
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            convertView = inflater.inflate(R.layout.custom_spinner_salas, parent, false);
            // well set up the ViewHolder
            viewHolder = new ViewHolderSala();
            viewHolder.textViewNombreSala = (TextView) convertView.findViewById(R.id.custom_spinner_dropNombreSala);
            viewHolder.textViewNumeroPuestos = (TextView) convertView.findViewById(R.id.custom_spinner_dropNumeroPuestos);
            viewHolder.textViewTemperatura = (TextView) convertView.findViewById(R.id.custom_spinner_Temperatura);

            // store the holder with the view.
            convertView.setTag(viewHolder);
        } else {
            // we've just avoided calling findViewById() on resource everytime
            // just use the viewHolder
            viewHolder = (ViewHolderSala) convertView.getTag();
        }
        // object item based on the position
        Sala sala = arrSalas.get(position);

        // assign values if the object is not null
        if (sala != null) {
            // get the TextView from the ViewHolder and then set the text (item name) and tag (item ID) values
            viewHolder.textViewNombreSala.setText(sala.getNombre());
            viewHolder.textViewNumeroPuestos.setText(String.valueOf( sala.getPuestos()));
            viewHolder.textViewTemperatura.setText(sala.getTemperatura());
            if(sala.getPuestos()>20) {
                    viewHolder.textViewNumeroPuestos.setTextColor(Color.GREEN);

            }else {
                viewHolder.textViewNumeroPuestos.setTextColor(Color.RED);
            }


        }

        return convertView;
    }

    public Sala getSala (int i) {

        return arrSalas.get(i);
    }

    static class ViewHolderSala {

        TextView textViewNombreSala, textViewTemperatura, textViewNumeroPuestos;

    }
}