package org.example;

public class BottleOfMilk extends Product {
    private int volume;
    private int fat;

    public int getVolume() {
        return volume;
    }

    public BottleOfMilk(String name, double price, int volume, int fat) {
        super(name, price);
        this.volume = volume;
        this.fat = fat;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    @Override
    String displayInfo() {
        //return super.displayInfo();
        return String.format("%s - %s - %f - объем: %d", brand, name, price, volume);

    }
}
