package GUI;

import DTO.*;

public class AntiqueShop {
    public static void main(String[] args) {
        // Create a Vase object with value, creator, height, and material
        Vase vase = new Vase(1000, "Nguyen Van A", 30, "Ceramic");
        System.out.println(vase);
        
        // Create a Statue object with value, creator, weight, and color
        Statue statue = new Statue(1500, "Le Van B", 50, "Bronze");
        System.out.println(statue);
        
        // Create a Painting object with value, creator, width, height, and style
        Painting painting = new Painting(2000, "Tran Van C", 40, 60, "Impressionism");
        System.out.println(painting);

        
    }
}
