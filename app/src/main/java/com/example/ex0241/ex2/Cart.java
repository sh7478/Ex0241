package com.example.ex0241.ex2;

public class Cart extends Light{
    private double chargeTime;

    public Cart(int carNumber, double carAge, int wheelsAmount, String steeringType, double exhaustPullotPerMin, boolean engine, double chargeTime) {
        super(carNumber, carAge, wheelsAmount, steeringType, exhaustPullotPerMin, engine);
        this.chargeTime = chargeTime;
    }

    public double getChargeTime() {
        return chargeTime;
    }

    public void setChargeTime(double chargeTime) {
        this.chargeTime = chargeTime;
    }

    @Override
    public String toString() {
        return "Heavy{" +
                "chargeTime=" + this.chargeTime +
                "carNumber=" + super.getCarNumber() +
                ", carAge=" + super.getCarAge() +
                ", wheelsAmount=" + super.getWheelsAmount() +
                ", steeringType='" + super.getSteeringType() + '\'' +
                ", exhaustPullotPerMin=" + super.getExhaustPullotPerMin() +
                '}';
    }
}
