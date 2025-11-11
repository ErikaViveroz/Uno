/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

/**
 *
 * @author erika
 */
public class Datos {
    
    String name;
    String date;
    int id;
    int score;
    
    public Datos(String name, int id, int score, String date){
        this.name = name;
        this.id = id;
        this.score = score;
        this.date = date;
    }

    Datos() {
        
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setScore(int score){
        this.score = score;
    }
    public void setDate(String date){
        this.date = date;
    }
    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
    public int getScore(){
        return this.score;
    }
    public String getDate(){
        return this.date;
    }
}
