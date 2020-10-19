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
public class Investigacion {
  private int tiempoDedicado;
  private String tema;
  private String comentarios;
  private int comprension;
  private String dudas;
  private int id;

    public Investigacion(int id, int tiempoDedicado, String tema, String comentarios, int comprension, String dudas) {
        this.id = id;
        this.tiempoDedicado = tiempoDedicado;
        this.tema = tema;
        this.comentarios = comentarios;
        this.comprension = comprension;
        this.dudas = dudas;
    }

    public void imprimirInvestigacion(){        
        System.out.println("Investigación: "  );        
    }
    
    
    //GETTERS AND SETTERS
    public int getTiempoDedicado() {
        return tiempoDedicado;
    }

    public void setTiempoDedicado(int tiempoDedicado) {
        this.tiempoDedicado = tiempoDedicado;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public int getComprension() {
        return comprension;
    }

    public void setComprension(int comprension) {
        this.comprension = comprension;
    }

    public String getDudas() {
        return dudas;
    }

    public void setDudas(String dudas) {
        this.dudas = dudas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
  
  
  
  
}
