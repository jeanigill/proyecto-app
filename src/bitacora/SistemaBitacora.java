/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitacora;

import java.util.Scanner;

/**
 *
 * @author Jeanine Gill
 */
public class SistemaBitacora {
    
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        int opcion;
                        
        do{
            System.out.println("");
            System.out.println("SISTEMA DE BITACORA ACADEMICA");
            System.out.println("");
            System.out.println("Menú del sistema");
            System.out.println("1. ");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. ");
            System.out.println("6. ");
            System.out.println("7. Salir");
            System.out.println("");
            System.out.print("Ingrese el número de la opción elegida: ");
            opcion = teclado.nextInt();
                
            switch(opcion){
                case 1: 
                      System.out.println("Menú materias");
                      System.out.println("");
                      System.out.println("1. Ver materias");
                      System.out.println("2. Cargar materias");
                      System.out.println("");
                      System.out.print("Ingrese el número de la opción elegida: ");
                      opcion = teclado.nextInt();
                      
                      if(opcion == 1){
                         // bitacora.verMateria();
                      } if (opcion == 2 ){
                          //bitacora.cargarMaterias();
                      } else {
                         System.out.println("Número ingresado no exite. Intente nuevamente");
                      }
                    break;
                case 2:
                      System.out.println("Menú Temas");
                      System.out.println("");
                      System.out.println("1. Ver temas");
                      System.out.println("2. Cargar temas");
                      System.out.println("");
                      System.out.print("Ingrese el número de la opción elegida: ");
                      opcion = teclado.nextInt();
                      
                      if(opcion == 1){
                         // materias.verTemas();
                      } if (opcion == 2 ){
                          //materias.cargarTemas();
                      } else {
                         System.out.println("Número ingresado no exite. Intente nuevamente");
                      }
                    break;
                case 3:
                    System.out.println("Menú Item");
                      System.out.println("");
                      System.out.println("1. Ver Item");
                      System.out.println("2. Cargar nuevo Item");
                      System.out.println("");
                      System.out.print("Ingrese el número de la opción elegida: ");
                      opcion = teclado.nextInt();
                      if(opcion == 1){
                         // temas.verItem();
                      } if (opcion == 2 ){
                          //temas.cargarItem();
                      } else {
                         System.out.println("Número ingresado no exite. Intente nuevamente");
                      } 
                    break;    
                case 4:
                    System.out.println("Menú Ejercicio");
                      System.out.println("");
                      System.out.println("1. Ver ejercicios");
                      System.out.println("2. Cargar nuevo Ejercicio");
                      System.out.println("");
                      System.out.print("Ingrese el número de la opción elegida: ");
                      opcion = teclado.nextInt();
                      if(opcion == 1){
                         // temas.verEjercicio();
                      } if (opcion == 2 ){
                          //temas.cargarEjercicio();
                      } else {
                         System.out.println("Número ingresado no exite. Intente nuevamente");
                      } 
                    break;
                case 5:
                    System.out.println("Menú Investigación");
                      System.out.println("");
                      System.out.println("1. Ver Investigación");
                      System.out.println("2. Cargar nuevo Investigación");
                      System.out.println("");
                      System.out.print("Ingrese el número de la opción elegida: ");
                      opcion = teclado.nextInt();
                      if(opcion == 1){
                         // tema.verInvestigaciones();
                      } if (opcion == 2 ){
                          //tema.cargarInvestigacion();
                      } else {
                         System.out.println("Número ingresado no exite. Intente nuevamente");
                      } 
                    break;
                default:
                    System.out.println("La ejecución del sistema ha finalizado");
            }
        }while(opcion != 6);
    }    
    }


        
        
    
    

