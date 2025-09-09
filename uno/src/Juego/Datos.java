/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

/**
 *
 * @author tree6
 */
public class Datos {
    
    String nombre;
    int c;
    int puntuacion;
    String fecha;
    
    public Datos(String nombre, int c, int puntuacion, String fecha){
        this.nombre=nombre;
        this.c=c;
        this.puntuacion=puntuacion;
        this.fecha=fecha;
    }

    Datos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public void setc(int c){
        this.c=c;
    }
    public void setpuntuacion(int puntuacion){
        this.puntuacion=puntuacion;
    }
    public void setfecha(String fecha){
        this.fecha=fecha;
    }
    public String getnombre(){
        return this.nombre;
    }
    public int getc(){
        return this.c;
    }
    public int getpuntuacion(){
        return this.puntuacion;
    }
    public String getfecha(){
        return this.fecha;
    }
}
