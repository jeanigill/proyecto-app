/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitacora;

import java.util.Scanner;

public class SistemaBitacora {

    /**
     * @param args the command line arguments
     */
    public static Bitacora bitacora = new Bitacora ();
    public static Materia materia = new Materia ();
    public static Tema tema = new Tema ();
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        int opcion;
                        
        do{
            System.out.println("");
            System.out.println("SISTEMA DE BITACORA ACADEMICA");
            System.out.println("");
            System.out.println("Menú del sistema");
            System.out.println("1. Materias");
            System.out.println("2. Tema");
            System.out.println("3. Item");
            System.out.println("4. Ejercicio");
            System.out.println("5. Investigación");
            System.out.println("6. Ver completo");
            System.out.println("7. Salir");
            System.out.println("");
            System.out.print("Ingrese el número de la opción elegida: ");
            System.out.println("");
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
                          bitacora.imprimirMaterias();
                      } else if (opcion == 2 ){
                          bitacora.cargarMateria();
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
                          materia.imprimirTemas();
                      } if (opcion == 2 ){
                          materia.cargarTema();
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
                         tema.itemsPorDefecto();
                      } if (opcion == 2 ){
                         tema.cargarItem();
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
                        tema.ejercicioPorDefecto();
                      } if (opcion == 2 ){
                        tema.cargarEjercicio();
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
                          tema.investigacionPorDefecto();
                      } if (opcion == 2 ){
                          tema.cargarInvestigacion();
                      } else {
                         System.out.println("Número ingresado no exite. Intente nuevamente");
                      } 
                    break;
                case 6:
                    bitacora.imprimirBitacora();
                    break;
                default:
                    System.out.println("La ejecución del sistema ha finalizado");
            }
        }while(opcion != 7);
    }    
    }
