package jkvillavo12col.com.co.losviews.custom;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

import jkvillavo12col.com.co.losviews.R;
import jkvillavo12col.com.co.losviews.entities.Persona;

/**
 * Created by JkVillavo12Col on 17/10/16.
 */

public class A extends ArrayAdapter {

    private List<Persona> arrPersonas;
    private Context context;

    public A(Context context, List<Persona> arrPersonas) {
        super(context, R.layout.custom_spinner_view, arrPersonas);
        this.context=context;
        this.arrPersonas=arrPersonas;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}
