
package DTO;

public class Item {
    public int value;
    public String creator;

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }
// Getter and Setter
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {
        return "Item{" + "value= " + value + ", creator= " + creator + '}';
    }

    
}
