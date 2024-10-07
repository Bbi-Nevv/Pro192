
package DTO;


public class Vase extends Item {
    
    public int height;
    
    public String material;

    
    public Vase(int value, String creator, int height, String material) {
        super(value, creator); 
        this.height = height;
        this.material = material;
    }

    // Getter và Setter
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString() + "height= " + height + ", material= " + material;
    }
    
}
