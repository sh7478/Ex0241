package com.example.ex0241.ex2;

public class Bicycle extends Light{
    private boolean basket;

    public Bicycle(int carNumber, double carAge, int wheelsAmount, String steeringType, double exhaustPullotPerMin, boolean engine, boolean basket) {
        super(carNumber, carAge, wheelsAmount, steeringType, exhaustPullotPerMin, engine);
        this.basket = basket;
    }

    public boolean isBasket() {
        return basket;
    }

    public void setBasket(boolean basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Heavy{" +
                "basket=" + this.basket +
                "carNumber=" + super.getCarNumber() +
                ", carAge=" + super.getCarAge() +
                ", wheelsAmount=" + super.getWheelsAmount() +
                ", steeringType='" + super.getSteeringType() + '\'' +
                ", exhaustPullotPerMin=" + super.getExhaustPullotPerMin() +
                '}';
    }
}
