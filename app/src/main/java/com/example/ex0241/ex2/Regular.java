package com.example.ex0241.ex2;

public class Regular extends Vehicles{
    private int passengerAmount;

    public Regular(int carNumber, double carAge, int wheelsAmount, String steeringType, double exhaustPullotPerMin, int passengerAmount) {
        super(carNumber, carAge, wheelsAmount, steeringType, exhaustPullotPerMin);
        this.passengerAmount = passengerAmount;
    }

    public int getPassengerAmount() {
        return passengerAmount;
    }

    public void setPassengerAmount(int passengerAmount) {
        this.passengerAmount = passengerAmount;
    }

    @Override
    public String toString() {
        return "Heavy{" +
                "passengerAmount=" + this.passengerAmount +
                "carNumber=" + super.getCarNumber() +
                ", carAge=" + super.getCarAge() +
                ", wheelsAmount=" + super.getWheelsAmount() +
                ", steeringType='" + super.getSteeringType() + '\'' +
                ", exhaustPullotPerMin=" + super.getExhaustPullotPerMin() +
                '}';
    }

    @Override
    public double exhaust()
    {
        return super.exhaust() + (passengerAmount * 2);
    }
}
