/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

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
   public Tema unTema = new Tema();

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
    temaPorDefecto ();
}
    
    public void temaPorDefecto (){  
       
        String fechaS = "2020-12-14";
        Date fecha = (Date.valueOf(fechaS));
//        Tema newTema = new Tema (01, fecha, "Programación Orientada a Objetos");
        Tema newTema = new Tema (01, fecha, "Programación Orientada a Objetos", unTema.items, unTema.ejercicios, unTema.investigaciones);
        temas.add(newTema);
    }
    
    public void cargarTema (){
         System.out.println("ID: ");
        int id = teclado.nextInt();
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
        Tema newTema = new Tema(id, fecha, tema );
        temas.add(newTema);
    
    }
    
    public void editTema ( Tema unTema){
          System.out.println("Nombre: ");
          String newNombre = teclado.nextLine();
          System.out.println("Ingrese el tema: ");
        String tema = teclado.nextLine();
        System.out.println("Día: ");
        String diaN = teclado.nextLine();
        System.out.println("Mes: ");
        String mesN = teclado.nextLine();
        System.out.println("Año: ");
        String anhoN = teclado.nextLine();
        String FechaC = anhoN + "-" + mesN + "-" + diaN;
        java.sql.Date fecha = (java.sql.Date.valueOf(FechaC));
        unTema.setNombre(newNombre);
        unTema.setFecha(fecha);
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
        if (temas.size()>0){
            System.out.println("Temas: ");
        for(int i= 0; i<temas.size(); i++ ){
        Tema unTema = temas.get(i);
            System.out.println(unTema.getId()+"-"+unTema.getNombre()+ " Fecha: "+unTema.getFecha());
    } }else{
            System.out.println("No hay ningún tema cargado");    
            }
        

    }
    public Tema buscarTema (int idT){
        Tema unTema = null;
       // System.out.println("Ingrese el id del tema:");    
        //int idT = teclado.nextInt();
        for (int i =0; i<temas.size(); i++){
            unTema = temas.get(i);
            if (unTema.getId()== idT){
                i= temas.size();
            }
        }return unTema;
    }
//    public void editItemAprendido() {
//        Tema thisTema;
//        thisTema = buscarTema(});
//            if (thisTema != null) {
//                Item unItem = thisTema.buscarItem();
//                unItem.editarAprendido();
//                System.out.println("El Item ha sido marcado como aprendido correctamente");                
//            }else {
//                System.out.println("El id del Tema no existe");
//            }
//            thisTema.imprimirItems();
//    }
    
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
