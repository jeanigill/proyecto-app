/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitacora;

/**
 *
 * @author Jeanine Gill
 */
public class Item {
    private String concepto;
    private String descripcion;
    private String dudas;
    private boolean aprendido;

    public Item(String concepto, String descripcion, String dudas, boolean aprendido) {
        this.concepto = concepto;
        this.descripcion = descripcion;
        this.dudas = dudas;
        this.aprendido = aprendido;
    }
        public Item(String concepto, String dudas, boolean aprendido) {
        this.concepto = concepto;
        this.dudas = dudas;
        this.aprendido = aprendido;
    }
    
    public void imprimirItem(){        
        System.out.println("Item: " + concepto );        
    }
    
    //GETTERS AND SETTERS

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDudas() {
        return dudas;
    }

    public void setDudas(String dudas) {
        this.dudas = dudas;
    }

    public boolean isAprendido() {
        return aprendido;
    }

    public void setAprendido(boolean aprendido) {
        this.aprendido = aprendido;
    }
    
}
