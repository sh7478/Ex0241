package com.example.ex0241.ex2;

public class Tractor extends Heavy{
    public String trailerType;

    public Tractor(int carNumber, double carAge, int wheelsAmount, String steeringType, double exhaustPullotPerMin, int trailersAmount, String trailerType) {
        super(carNumber, carAge, wheelsAmount, steeringType, exhaustPullotPerMin, trailersAmount);
        this.trailerType = trailerType;
    }

    public String getTrailerType() {
        return trailerType;
    }

    public void setTrailerType(String trailerType) {
        this.trailerType = trailerType;
    }
    @Override
    public String toString() {
        return "Heavy{" +
                "trailerType=" + this.trailerType +
                "carNumber=" + super.getCarNumber() +
                ", carAge=" + super.getCarAge() +
                ", wheelsAmount=" + super.getWheelsAmount() +
                ", steeringType='" + super.getSteeringType() + '\'' +
                ", exhaustPullotPerMin=" + super.getExhaustPullotPerMin() +
                '}';
    }
}
