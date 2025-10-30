package com.example.ex0241.ex2;

public class Heavy extends Vehicles{
    private int trailersAmount;
    public Heavy(int carNumber, double carAge, int wheelsAmount, String steeringType, double exhaustPullotPerMin, int trailersAmount) {
        super(carNumber, carAge, wheelsAmount, steeringType, exhaustPullotPerMin);
        this.trailersAmount = trailersAmount;
    }

    public int getTrailersAmount() {
        return trailersAmount;
    }

    public void setTrailersAmount(int trailersAmount) {
        this.trailersAmount = trailersAmount;
    }

    @Override
    public String toString() {
        return "Heavy{" +
                "trailersAmount=" + trailersAmount +
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
        return super.exhaust() + (500 * trailersAmount);
    }
}
