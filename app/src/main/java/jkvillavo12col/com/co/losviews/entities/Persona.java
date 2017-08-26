package jkvillavo12col.com.co.losviews.entities;

import java.io.Serializable;

/**
 * Created by JkVillavo12Col on 17/10/16.
 */

public class Persona implements Serializable {

   private String nombre;
   private String apellido;
   private String sexo;
   private String nroDocumento;

   public Persona (String diana, String lopez, String s, String mujer) {

      this.nombre = diana;
      this.apellido = lopez;
      this.nroDocumento = s;
      this.sexo = mujer;


   }

   public String getNombre () {

      return nombre;
   }

   public void setNombre (String nombre) {

      this.nombre = nombre;
   }

   public String getApellido () {

      return apellido;
   }

   public void setApellido (String apellido) {

      this.apellido = apellido;
   }

   public String getSexo () {

      return sexo;
   }

   public void setSexo (String sexo) {

      this.sexo = sexo;
   }

   public String getNroDocumento () {

      return nroDocumento;
   }

   public void setNroDocumento (String nroDocumento) {

      this.nroDocumento = nroDocumento;
   }
}
