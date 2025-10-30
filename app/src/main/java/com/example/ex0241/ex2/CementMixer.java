package com.example.ex0241.ex2;

public class CementMixer extends Truck{
    boolean haveCement;

    public CementMixer(int carNumber, double carAge, int wheelsAmount, String steeringType, double exhaustPullotPerMin, int trailersAmount, double loadCapacity, boolean haveCement) {
        super(carNumber, carAge, wheelsAmount, steeringType, exhaustPullotPerMin, trailersAmount, loadCapacity);
        this.haveCement = haveCement;
    }

    public boolean isHaveCement() {
        return haveCement;
    }

    public void setHaveCement(boolean haveCement) {
        this.haveCement = haveCement;
    }
}
