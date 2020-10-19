/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitacora;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Jeanine Gill
 */
public class Tema {
    
    Scanner teclado = new Scanner (System.in);
    
  private Date fecha;
  private String nombre;
  public ArrayList<Item> items = new ArrayList();
  public ArrayList<Ejercicio> ejercicios = new ArrayList();
  public ArrayList<Investigacion> investigaciones = new ArrayList();
  private int id;

    public Tema(int id, Date fecha, String nombre, ArrayList<Item> items, ArrayList<Ejercicio> ejercicios, ArrayList<Investigacion> investigaciones) {
        this.id = id;
        this.fecha = fecha;
        this.nombre = nombre;
        this.items = items;
        this.ejercicios = ejercicios;
        this.investigaciones = investigaciones;
    }

    public Tema(int id, Date fecha, String nombre) {
        this.id = id;
        this.fecha = fecha;
        this.nombre = nombre;
    }

  
    public Tema (){
        investigacionPorDefecto ();
        itemsPorDefecto ();
        ejercicioPorDefecto ();
    }
    
    public void investigacionPorDefecto (){
        Investigacion investigacion1 = new Investigacion (01, 30, "Static en Java", "Static se usa con métodos y atributos.", 
                80,"Aún no me queda claro ya que la palabra reservada se usa con atributos y métodos.");
        investigaciones.add(investigacion1);
    }
    
    public void itemsPorDefecto (){
    Item item1 = new Item (01, "Clase", "Modelo que define conjunto de atributos y métodos", "", true);
    Item item2 = new Item (02, "Objeto", "Unidad dentro de un programa que tiene estado y comportamiento. Instancia de una clase.", "", true);
    Item item3 = new Item (03, "Instancia",  "¿Cuál es la diferencia entre objeto e instancia?", false);
    Item item4 = new Item (04, "Constructor", "", false);
    items.add(item1);
    items.add(item2);
    items.add(item3);
    items.add(item4);
    }
    
    public void ejercicioPorDefecto () {
    Ejercicio ejercicio1 = new Ejercicio (01, 90, "Aprendí que una clase puede tener varios constructores.",
            "¿Para qué sirve la palabra reservada static?", 80 );
    ejercicios.add(ejercicio1);
    }
        
     public Investigacion cargarInvestigacion(){
         teclado.nextLine();
         System.out.println("Tema investigado: ");
         String tema = teclado.nextLine();
         System.out.println("Comentarios: ");
         String comentarios = teclado.nextLine();
         System.out.println("Dudas: ");
         String dudas = teclado.nextLine();
         System.out.println("Tiempo dedicado: ");
         int tiempoD = teclado.nextInt();        
         System.out.println("Nivel de comprensión: ");
         int nivelComp = teclado.nextInt();
         
         Investigacion newInvestigacion = new Investigacion (01, tiempoD, tema, comentarios, nivelComp, dudas);
         this.investigaciones.add(newInvestigacion);
         return newInvestigacion;
     }

     public Ejercicio cargarEjercicio (){
         System.out.println("ID: ");
         int id = teclado.nextInt();
         teclado.nextLine();
         System.out.println("Experiencia: ");
         String experiencia = teclado.nextLine();
         System.out.println("Dudas: ");
         String dudas = teclado.nextLine();
         System.out.println("Timpo dedicado:");
         int tiempoD = teclado.nextInt();
         System.out.println("Porcentaje logrado: ");
         int logrado = teclado.nextInt();
         Ejercicio newEjercicio = new Ejercicio (id, tiempoD, experiencia, dudas, logrado);
         this.ejercicios.add(newEjercicio);
         return newEjercicio;
     }
     
     public Item cargarItem (){
         System.out.println("ID:");
         int id = teclado.nextInt();
         teclado.nextLine();
         System.out.println("Concepto: ");
         String concepto = teclado.nextLine();
         System.out.println("Descripción: ");
         String descripcion = teclado.nextLine();
         System.out.println("Dudas: ");
         String dudas = teclado.nextLine();
         System.out.println("¿Has aprendido el ítem?: ");
         System.out.println("1- Sí");
         System.out.println("2- No");
         boolean aprendido = false;
         int opcion = teclado.nextInt();
         if (opcion == 1){
             aprendido = true;
         }else if (opcion==2){
             aprendido = false;
         }
         Item newItem = new Item (id, concepto, descripcion, dudas, aprendido);
         this.items.add(newItem);
         return newItem;
     }

     //GETTER AND SETTERS
     
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
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
