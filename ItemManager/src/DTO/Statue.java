package DTO;

// Subclass representing a specific type of item: a Statue
public class Statue extends Item {
    // Weight of the statue (in kg or other unit)
    public int weight;
    // Color of the statue
    public String color;

    // Constructor to initialize Statue-specific attributes along with inherited ones
    public Statue(int value, String creator, int weight, String color) {
        super(value, creator); // Call the superclass constructor
        this.weight = weight;
        this.color = color;
    }

    // Getter for weight
    public int getWeight() {
        return weight;
    }

    // Setter for weight
    public void setWeight(int weight) {
        this.weight = weight;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "weight= " + weight + ", color= " + color;
    }

    
}
