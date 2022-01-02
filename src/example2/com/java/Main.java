package example2.com.java;

import example2.com.java.model.ClothingItem;

import java.util.Arrays;

public class Main<fore, foreach> {
    public static <copied> void main(String[] args) {
        System.out.println("Array of primitives ");
        int[]  ints ={3,6,9,1};
        Arrays.stream(ints).forEach(System.out::println);
        System.out.println("Array of strings ");
        String[] colors = {"RED","BLUE","WHITE","ORANGE","GREEN","BROWN","PINK","YELLOW"};

        Arrays.stream(colors).sorted().forEachOrdered(System.out::println);

        ClothingItem[] items = new ClothingItem[3];
        items[0] = new ClothingItem("Shirt","L",15);
        items[1] = new ClothingItem("Pants","32",20);
        items[2] = new ClothingItem("Hat","L",12);
        for (ClothingItem item:items) {
            System.out.println(item);
    }
        ClothingItem[] copied = Arrays.copyOf(items,items.length) ;
        for (ClothingItem item:copied) {
            System.out.println(item);
        }
        }
    }




