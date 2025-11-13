package Juego;

/**
 *
 * @author erika
 */
public class Player {
    
    String name;
    String date;
    int id;
    int score;
    
    public Player(){
        this.name = "";
        this.score = 0;
        this.date = "";
    }
    

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setScore(int score){
        this.score = score;
    }
    public void setDate(String date){
        this.date = date;
    }
    

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getScore(){
        return this.score;
    }
    public String getDate(){
        return this.date;
    }
}
