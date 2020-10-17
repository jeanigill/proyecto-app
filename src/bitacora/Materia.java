/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitacora;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jeanine Gill
 */
public class Materia {
    Scanner teclado = new Scanner (System.in);
   private String nombre;
   public ArrayList<Tema> temas;

    public Materia(String nombre, ArrayList<Tema> temas) {
        this.nombre = nombre;
        this.temas = temas;
    }
   Tema unTema;
    public Materia () {
    //temaPorDefecto ();
}
    
//    public void temaPorDefecto (){
//        Item unItem;
//        Tema unTema ;
//        Ejercicio unEjercicio;
//        Investigacion unaInvestigacion;
//        Tema newTema = new Tema ("10/14/2020", "Programación Orientada a Objetos",
//                unTema.itemsPorDefecto(), unTema.ejercicioPorDefecto(), unTema.investigacionPorDefecto() );
//        
//    }
    
    public void cargarTema (){
        teclado.nextLine();
        System.out.println("Ingrese el tema: ");
        String tema = teclado.nextLine();
        System.out.println("Fecha: ");
        int fecha = teclado.nextInt();
        Item newItem = unTema.cargarItem();
        Ejercicio newEjercicio = unTema.cargarEjercicio();
        Investigacion newInvestigacion = unTema.cargarInvestigacion();
    //    Tema newTema = new Tema(fecha, tema, newItem, newEjercicio, newInvestigacion);
    
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
