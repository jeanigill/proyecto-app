/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Jeanine Gill
 */
public class Ejercicio {
    private int tiempoDedicado;
    private String experiencia;
    private String dudas;
    private int logrado;
    private int id ;

    public Ejercicio(int id, int tiempoDedicado, String experiencia, String dudas, int logrado) {
        this.id = id;
        this.tiempoDedicado = tiempoDedicado;
        this.experiencia = experiencia;
        this.dudas = dudas;
        this.logrado = logrado;
    }

    public void imprimirEjercicio(){        
        System.out.println("Item: " + logrado );        
    }
    
    
    //GETTERS AND SETTERS
    
    public int getTiempoDedicado() {
        return tiempoDedicado;
    }

    public void setTiempoDedicado(int tiempoDedicado) {
        this.tiempoDedicado = tiempoDedicado;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getDudas() {
        return dudas;
    }

    public void setDudas(String dudas) {
        this.dudas = dudas;
    }

    public int getLogrado() {
        return logrado;
    }

    public void setLogrado(int logrado) {
        this.logrado = logrado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
