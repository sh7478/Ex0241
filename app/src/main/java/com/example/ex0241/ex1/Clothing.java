package com.example.ex0241.ex1;

public class Clothing extends Product{
    private String color;

    public Clothing(String name, double price, String description, String color) {
        super(name, price, description);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "and the color is: " + this.color;
    }
}
