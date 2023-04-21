package org.example;

import java.util.List;

public class BottleOfWaterVendingMachine {

    private final List<Product> products;

    public BottleOfWaterVendingMachine(List<Product> products){
        this.products = products;
    }

    public Product getBottleOfWater(String name, int volume){
        for (Product product : products) {
            if (product instanceof BottleOfWater) {
                if (product.getName() == name && ((BottleOfWater) product).getVolume() == volume) {
                    return (BottleOfWater)product;

                }
            }
        }
        return null;
    }
    public Product getBottleOfMilk(String name, int volume){
        for (Product product : products) {
            if (product instanceof BottleOfMilk) {
                if (product.getName() == name && ((BottleOfMilk) product).getVolume() == volume) {
                    return (BottleOfMilk)product;
                }
            }
        }
        return null;
    }
    //Разработать метод получения бутылки с молоком самостоятельно
}
