package com.example.ex0241.ex2;

public class SportCar extends Regular{
    private int horsePower;

    public SportCar(int carNumber, double carAge, int wheelsAmount, String steeringType, double exhaustPullotPerMin, int passengerAmount, int horsePower) {
        super(carNumber, carAge, wheelsAmount, steeringType, exhaustPullotPerMin, passengerAmount);
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
