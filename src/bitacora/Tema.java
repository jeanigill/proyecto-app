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
public class Tema {
  private int fecha;
  private String nombre;
  public ArrayList<Item> items;
  public ArrayList<Ejercicio> ejercicios;
  public ArrayList<Investigacion> investigaciones;

    public Tema(int fecha, String nombre, ArrayList<Item> items, ArrayList<Ejercicio> ejercicios, ArrayList<Investigacion> investigaciones) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.items = items;
        this.ejercicios = ejercicios;
        this.investigaciones = investigaciones;
    }
  
  //GETTER AND SETTERS

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public ArrayList<Ejercicio> getEjercicios() {
        return ejercicios;
    }

    public void setEjercicios(ArrayList<Ejercicio> ejercicios) {
        this.ejercicios = ejercicios;
    }

    public ArrayList<Investigacion> getInvestigaciones() {
        return investigaciones;
    }

    public void setInvestigaciones(ArrayList<Investigacion> investigaciones) {
        this.investigaciones = investigaciones;
    }
    
  
}
