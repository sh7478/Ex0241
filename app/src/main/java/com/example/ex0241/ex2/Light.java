package com.example.ex0241.ex2;

public class Light extends Vehicles{
    private boolean engine;

    public Light(int carNumber, double carAge, int wheelsAmount, String steeringType, double exhaustPullotPerMin, boolean engine) {
        super(carNumber, carAge, wheelsAmount, steeringType, exhaustPullotPerMin);
        this.engine = engine;
    }

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }
    @Override
    public String toString() {
        return "Heavy{" +
                "engine=" + this.engine +
                "carNumber=" + super.getCarNumber() +
                ", carAge=" + super.getCarAge() +
                ", wheelsAmount=" + super.getWheelsAmount() +
                ", steeringType='" + super.getSteeringType() + '\'' +
                ", exhaustPullotPerMin=" + super.getExhaustPullotPerMin() +
                '}';
    }
}
