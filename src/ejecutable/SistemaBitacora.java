    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutable;

import clases.Bitacora;
import clases.Materia;
import clases.Tema;
import java.util.Scanner;

public class SistemaBitacora {

    /**
     * @param args the command line arguments
     */
    public static Bitacora bitacora = new Bitacora();
    public static Materia unaMateria = new Materia();
    public static Tema unTema = new Tema();

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        System.out.println("****Bienvenido al sistema de bitacora en JAVA****");
        System.out.println("Listado de materias en este semestre");
        bitacora.imprimirMaterias();
        System.out.println("0- Cargar materias");
        System.out.println("");
//        System.out.println("Eliga una materia o cargue una nueva materia");
        opcion = teclado.nextInt();
        System.out.println("");
        if (opcion != 0) {
            unaMateria = bitacora.buscarMateria();
            if (unaMateria != null) {
                unaMateria.imprimirMateria();
                unaMateria.imprimirTemas();
            } else {
                System.out.println("No existe la materia");
            }
        } else if (opcion == 0) {
            bitacora.cargarMateria();
        }
        System.out.println("Elegir un tema o crear uno nuevo");
        unaMateria.imprimirTemas();
        System.out.println("0- Cargar materias");
        opcion = teclado.nextInt();
        if (opcion == 0) {

        } else {
            Tema unTema = unaMateria.buscarTema();
            System.out.println(" ");
            System.out.println("1. Ítems");
            System.out.println("2. Ejercicios");
            System.out.println("3. Investigaciones");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1: 
                    unTema.imprimirItems();
                    
                    break;
                case 2:
                    unTema.imprimirEjercicios();
                    break;
                case 3:
                    unTema.imprimirInvestigaciones();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("La ejecución del sistema ha finalizado");
            }
        }
        while (opcion != 5);
    }

}

//        do{
//            System.out.println("");
//            System.out.println("SISTEMA DE BITACORA ACADEMICA");
//            System.out.println("");
//            System.out.println("Menú del sistema");
//            System.out.println("1. Materias");
//            System.out.println("2. Tema");
//            System.out.println("3. Item");
//            System.out.println("4. Ejercicio");
//            System.out.println("5. Investigación");
//            System.out.println("6. Ver completo");
//            System.out.println("7. Salir");
//            System.out.println("");
//            System.out.print("Ingrese el número de la opción elegida: ");
//            System.out.println("");
//            opcion = teclado.nextInt();
//                
//            switch(opcion){
//                case 1: 
//                      System.out.println("Menú materias");
//                      System.out.println("");
//                      System.out.println("1. Ver materias");
//                      System.out.println("2. Cargar materias");
//                      System.out.println("");
//                      System.out.print("Ingrese el número de la opción elegida: ");
//                      opcion = teclado.nextInt();
//                      
//                      if(opcion == 1){
//                          bitacora.imprimirMaterias();
//                      } else if (opcion == 2 ){
//                          bitacora.cargarMateria();
//                      } else {
//                         System.out.println("Número ingresado no exite. Intente nuevamente");
//                      }
//                    break;
//                case 2:
//                      System.out.println("Menú Temas");
//                      System.out.println("");
//                      System.out.println("1. Ver temas");
//                      System.out.println("2. Cargar temas");
//                      System.out.println("");
//                      System.out.print("Ingrese el número de la opción elegida: ");
//                      opcion = teclado.nextInt();
//                      
//                      if(opcion == 1){
//                          materia.imprimirTemas();
//                      } if (opcion == 2 ){
//                          materia.cargarTema();
//                      } else {
//                         System.out.println("Número ingresado no exite. Intente nuevamente");
//                      }
//                    break;
//                case 3:
//                    System.out.println("Menú Item");
//                      System.out.println("");
//                      System.out.println("1. Ver Item");
//                      System.out.println("2. Cargar nuevo Item");
//                      System.out.println("");
//                      System.out.print("Ingrese el número de la opción elegida: ");
//                      opcion = teclado.nextInt();
//                      if(opcion == 1){
//                         tema.itemsPorDefecto();
//                      } if (opcion == 2 ){
//                         tema.cargarItem();
//                      } else {
//                         System.out.println("Número ingresado no exite. Intente nuevamente");
//                      } 
//                    break;    
//                case 4:
//                    System.out.println("Menú Ejercicio");
//                      System.out.println("");
//                      System.out.println("1. Ver ejercicios");
//                      System.out.println("2. Cargar nuevo Ejercicio");
//                      System.out.println("");
//                      System.out.print("Ingrese el número de la opción elegida: ");
//                      opcion = teclado.nextInt();
//                      if(opcion == 1){
//                        tema.ejercicioPorDefecto();
//                      } if (opcion == 2 ){
//                        tema.cargarEjercicio();
//                      } else {
//                         System.out.println("Número ingresado no exite. Intente nuevamente");
//                      } 
//                    break;
//                case 5:
//                    System.out.println("Menú Investigación");
//                      System.out.println("");
//                      System.out.println("1. Ver Investigación");
//                      System.out.println("2. Cargar nuevo Investigación");
//                      System.out.println("");
//                      System.out.print("Ingrese el número de la opción elegida: ");
//                      opcion = teclado.nextInt();
//                      if(opcion == 1){
//                          tema.investigacionPorDefecto();
//                      } if (opcion == 2 ){
//                          tema.cargarInvestigacion();
//                      } else {
//                         System.out.println("Número ingresado no exite. Intente nuevamente");
//                      } 
//                    break;
//                case 6:
//                    bitacora.imprimirBitacora();
//                    break;
//                default:
//                    System.out.println("La ejecución del sistema ha finalizado");
//            }
//        }while(opcion != 7);
//    }    
//    }
