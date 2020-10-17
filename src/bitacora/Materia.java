/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitacora;

import java.util.ArrayList;

/**
 *
 * @author Jeanine Gill
 */
public class Materia {
   private String nombre;
   public ArrayList<Tema> temas;

    public Materia(String nombre, ArrayList<Tema> temas) {
        this.nombre = nombre;
        this.temas = temas;
    }
   
    
   //GETTERS AND SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Tema> getTemas() {
        return temas;
    }

    public void setTemas(ArrayList<Tema> temas) {
        this.temas = temas;
    }
   
}
