package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        System.out.println(product1.displayInfo());

        Product product2 = new Product ("Бутылка с молоком", 200);
        System.out.println(product2.displayInfo());

        Product product3 = new Product ("Ок", "11", -10);
        System.out.println(product3.displayInfo());

        //product3.setPrice(-50.5);
        //product3.name = "_____";
        //product3.price = -50.5;

        System.out.println(product3.displayInfo());

        BottleOfWater bottleOfWater1 = new BottleOfWater("Вода", 100, 2);
        System.out.println(bottleOfWater1.displayInfo());

        BottleOfWater bottleOfWater2 = new BottleOfWater("Вода1", 100, 2);
        System.out.println(bottleOfWater2.displayInfo());

        BottleOfWater bottleOfWater3 = new BottleOfWater("Вода2", 100, 2);
        System.out.println(bottleOfWater3.displayInfo());

        BottleOfWater bottleOfWater4 = new BottleOfWater("Вода3", 100, 2);
        System.out.println(bottleOfWater4.displayInfo());

        BottleOfWater bottleOfWater5 = new BottleOfWater("Вода4", 100, 2);
        System.out.println(bottleOfWater5.displayInfo());



        Product bottleOfMilk1 = new BottleOfMilk("Молоко", 100, 2, 10);

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater2);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater3);
        products.add(bottleOfWater4);
        products.add(bottleOfWater5);

        BottleOfWaterVendingMachine machine = new BottleOfWaterVendingMachine(products);

        BottleOfWater bottleOfWaterRes = (BottleOfWater) machine.getBottleOfWater("Вода", 2);
        if (bottleOfWaterRes != null){
            System.out.println("Вы купили");
            System.out.println(bottleOfWaterRes.displayInfo());
        }
        else {
            System.out.println("Такой нет");
        }
    }
}