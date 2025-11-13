package Juego;

/**
 *
 * @author erika
 */
public class Card {
    private String color;
    private String number;
    private String imagePath;

    public Card(String color, String number, String imagePath) {
        this.color = color;
        this.number = number;
        this.imagePath = imagePath;
    }

    public String getColor() {
        return color;
    }

    public String getNumber() {
        return number;
    }

    public String getImagePath() {
        return imagePath;
    }

    public boolean matches(Card other) {
        return this.color.equalsIgnoreCase(other.color) ||
               this.number.equalsIgnoreCase(other.number);
    }
    
    public boolean matchesByColor(Card other){
        if (other == null) return false;
        return this.color.equalsIgnoreCase(other.color);
    }

    public boolean matchesByNumber(Card other){
        if (other == null) return false;
        return this.number.equalsIgnoreCase(other.number);
    }

    @Override
    public String toString() {
        return color + " " + number;
    }
}
