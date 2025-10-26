package com.example.ex0241.ex2;

public class Truck extends Heavy{
    private double loadCapacity;

    public Truck(int carNumber, double carAge, int wheelsAmount, String steeringType, double exhaustPullotPerMin, int trailersAmount, double loadCapacity) {
        super(carNumber, carAge, wheelsAmount, steeringType, exhaustPullotPerMin, trailersAmount);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Heavy{" +
                "loadCapacity=" + this.loadCapacity +
                "carNumber=" + super.getCarNumber() +
                ", carAge=" + super.getCarAge() +
                ", wheelsAmount=" + super.getWheelsAmount() +
                ", steeringType='" + super.getSteeringType() + '\'' +
                ", exhaustPullotPerMin=" + super.getExhaustPullotPerMin() +
                '}';
    }
}
