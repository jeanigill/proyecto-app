/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitacora;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jeanine Gill
 */
public class Materia {
    Scanner teclado = new Scanner (System.in);
   private String nombre;
   public ArrayList<Tema> temas = new ArrayList ();
   private int id;

    public Materia(int id, String nombre, ArrayList<Tema> temas) {
        this.nombre = nombre;
        this.temas = temas;
        this.id = id;
    }
 
    public Materia(int id, String nombre) {
        this.nombre = nombre;
        this.id = id;
    }
 
    public Materia () {
    //temaPorDefecto ();
}
    
//    public void temaPorDefecto (){
//        Item unItem;
//        Tema unTema ;
//        Ejercicio unEjercicio;
//        Investigacion unaInvestigacion;
//        Tema newTema = new Tema ("10/14/2020", "Programación Orientada a Objetos",
//                unTema.itemsPorDefecto(), unTema, unTema.investigacionPorDefecto() );
//        
//    }
    
    public void cargarTema (){
        teclado.nextLine();
        System.out.println("Ingrese el tema: ");
        String tema = teclado.nextLine();
        System.out.println("Día: ");
        String diaN = teclado.nextLine();
        System.out.println("Mes: ");
        String mesN = teclado.nextLine();
        System.out.println("Año: ");
        String anhoN = teclado.nextLine();
        String FechaC = anhoN + "-" + mesN + "-" + diaN;
        Date fecha = (Date.valueOf(FechaC));
        
//        Item newItem = unTema.cargarItem();
//        Ejercicio newEjercicio = unTema.cargarEjercicio();
//        Investigacion newInvestigacion = unTema.cargarInvestigacion();
//        Tema newTema = new Tema(fecha, unTema.items.set(fecha, newItem)tema, newItem, newEjercicio, newInvestigacion);
        Tema newTema = new Tema(fecha, nombre );
        temas.add(newTema);
    
    }
    public void imprimirMateria (){
        System.out.println("Nombre: "+nombre);
    } 
    
    public void verTemas (){
       Bitacora bitacora;
        //buscarMateria;
    }
    public void imprimirTemas(){
         System.out.println("");
        System.out.println("Temas: ");
        for(int i= 0; i<temas.size(); i++ ){
        Tema unTema = temas.get(i);
            System.out.println(i+1+"-"+unTema.getNombre()+ " Fecha: "+unTema.getFecha());
    }
    }
   //GETTERS AND SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
