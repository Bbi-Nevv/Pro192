package DTO;

// Subclass representing a specific type of item: a Painting
public class Painting extends Item {
    // Width of the painting (in cm or other unit)
    public int width;
    // Height of the painting (in cm or other unit)
    public int height;
    // Style of the painting (e.g., Impressionism, Abstract)
    public String style;

    // Constructor to initialize Painting-specific attributes along with inherited ones
    public Painting(int value, String creator, int width, int height, String style) {
        super(value, creator); // Call the superclass constructor
        this.width = width;
        this.height = height;
        this.style = style;
    }

    // Getter for width
    public int getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(int width) {
        this.width = width;
    }

    // Getter for height
    public int getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(int height) {
        this.height = height;
    }

    // Getter for style
    public String getStyle() {
        return style;
    }

    // Setter for style
    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return super.toString() + "width= " + width + ", height= " + height + ", style= " + style;
    }

    
}
