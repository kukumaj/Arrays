package example2.com.java;

import example2.com.java.model.ClothingItem;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Array of primitives ");
        int[]  ints ={3,6,9,1};
        for (int i = 0; i < ints.length ; i++) System.out.println(ints[i]);
        System.out.println("Array of strings ");
        String[] colors = {"RED","BLUE","WHITE","ORANGE","GREEN","BROWN","PINK","YELLOW"};

        Arrays.stream(colors).sorted().forEachOrdered(System.out::println);
<<<<<<< HEAD
    }
    ClothingItem[] items = new ClothingItem[3];
    items[0] = new ClothingItem("Shirt","L","15");
=======
        ClothingItem[] items = new ClothingItem[3];
        items[0] = new ClothingItem("Shirt","L",15);
        items[1] = new ClothingItem("Pants","32",20);
        items[2] = new ClothingItem("Hat","L",12);
        Arrays.stream(items).forEach(System.out::println);
    }

>>>>>>> d20cdc3 (poprawki)
}
