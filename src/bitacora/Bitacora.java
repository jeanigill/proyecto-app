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
public class Bitacora {

    public  Materia materia = new Materia ();
    public  Tema tema = new Tema ();
    Scanner teclado = new Scanner (System.in);
    public int año;
    public ArrayList<Materia> materias = new ArrayList ();

    public void materiasPorDefecto() {

    }
    public Bitacora (){
        
    }

    public void cargarMateria() {
        teclado.nextLine();
        System.out.println("Introduzca el id: ");
        int id = teclado.nextInt();
        System.out.println("Nombre de la materia: ");
        String nombre = teclado.nextLine();
        Materia newMateria = new Materia (id, nombre);
        this.materias.add(newMateria);
    }
    
    public void imprimirMaterias (){
        System.out.println("");
        System.out.println("Materias: ");
        for(int i= 0; i<materias.size(); i++ ){
        Materia unaMateria = materias.get(i);
            System.out.println(unaMateria.getId()+"-"+unaMateria.getNombre());
    }
    }
    
    public Materia buscarMateria (){
        Materia unaMateria = null;
        imprimirMaterias();
        System.out.println("Introduzca el id de la materia");
        int idM = teclado.nextInt();
        for (int i=0; i<materias.size(); i++){
        unaMateria= materias.get(i);
            if (idM == unaMateria.getId()){
                i = materias.size();
            }     
        }
    return unaMateria;
    }
    
        public void imprimirBitacora(){
        System.out.println("Lista de materias");
        imprimirMaterias();
//        System.out.println("1- Buscar Materia");
        System.out.println("0- Cargar materias");
        int opcion = teclado.nextInt();
        if (opcion != 0) {
            buscarMateria();
        } else {
            cargarMateria();
        }
        do {
        System.out.println("Ingrese una opcion");
        System.out.println("1. Tema");
        System.out.println("2. Item");
        System.out.println("3. Ejercicio");
        System.out.println("4. Investigación");
       
        System.out.print("Ingrese el número de la opción elegida: ");
        opcion = teclado.nextInt();
          switch(opcion){
                case 1: 
                    materia.cargarTema();
                    break;
                case 2:                  
                    tema.cargarItem();
                    break;
                case 3:
        tema.cargarEjercicio();
                    break;
                case 4:
        tema.cargarInvestigacion();
                    break;    
                default:
                    System.out.println("La ejecución del sistema ha finalizado");
            }
        } while(opcion != 7);
    }  

    //GETTERS AND SETTERS
    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

}
