package jkvillavo12col.com.co.losviews.entities;

import java.io.Serializable;
/**
 * Created by cl18409 on 26/08/2017.
 */

public class Sala  implements Serializable{

    private int puestos;

    public Sala(int puestos, String nombre, String temperatura) {
        this.puestos = puestos;
        this.nombre = nombre;
        Temperatura = temperatura;
    }

    private String nombre;
    private String Temperatura;

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(String temperatura) {
        Temperatura = temperatura;
    }


}
