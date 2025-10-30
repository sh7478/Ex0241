package com.example.ex0241.ex2;

public class Vehicles {
    private int carNumber;
    private double carAge;
    private int wheelsAmount;
    private String steeringType;
    private double exhaustPullotPerMin;

    public Vehicles(int carNumber, double carAge, int wheelsAmount, String steeringType, double exhaustPullotPerMin) {
        this.carNumber = carNumber;
        this.carAge = carAge;
        this.wheelsAmount = wheelsAmount;
        this.steeringType = steeringType;
        this.exhaustPullotPerMin = exhaustPullotPerMin;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public double getCarAge() {
        return carAge;
    }

    public void setCarAge(double carAge) {
        this.carAge = carAge;
    }

    public int getWheelsAmount() {
        return wheelsAmount;
    }

    public void setWheelsAmount(int wheelsAmount) {
        this.wheelsAmount = wheelsAmount;
    }

    public String getSteeringType() {
        return steeringType;
    }

    public void setSteeringType(String steeringType) {
        this.steeringType = steeringType;
    }

    public double getExhaustPullotPerMin() {
        return exhaustPullotPerMin;
    }

    public void setExhaustPullotPerMin(double exhaustPullotPerMin) {
        this.exhaustPullotPerMin = exhaustPullotPerMin;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "carNumber=" + carNumber +
                ", carAge=" + carAge +
                ", wheelsAmount=" + wheelsAmount +
                ", steeringType='" + steeringType + '\'' +
                ", exhaustPullotPerMin=" + exhaustPullotPerMin +
                '}';
    }

    public double exhaust()
    {
        return this.exhaustPullotPerMin * 60;
    }
}
