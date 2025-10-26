package com.example.ex0241.ex1;

public class Electronics extends Product{
    private double length;

    public Electronics(String name, double price, String description, double length) {
        super(name, price, description);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "and " + this.length + "cm length";
    }
}
