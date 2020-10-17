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
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                   
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("###");
                    
                    break;    
                case 7:
                    System.out.println("La ejecución del sistema ha finalizado");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de vuelta por favor");
            }
        }while(opcion != 7);
    }
}

        
        
    
    

