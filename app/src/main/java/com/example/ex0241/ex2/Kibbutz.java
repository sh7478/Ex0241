package com.example.ex0241.ex2;

public class Kibbutz {
    private Vehicles[] vehicles;
    private int vehiclesCounter;

    public Kibbutz() {
        this.vehicles = new Vehicles[500];
        this.vehiclesCounter = 0;
    }

    public void addVehicle(Vehicles vehicle) {
        vehicles[vehiclesCounter] = vehicle;
        this.vehiclesCounter++;
    }

    public Vehicles[] getOldVehicles() {
        int i = 0;
        int j = 0;
        int num = 0;
        for (int i = 0; i < vehiclesCounter; i++) {
            Vehicles v = vehicles[i];
            if (v.getCarAge() > 15 && v.getSteeringType().equals("wheel")) {
                num++;
            }
        }
        Vehicles[] oldVehicles = new Vehicles[num];
        num = 0;
        for (int j = 0; j < vehiclesCounter; j++) {
            Vehicles v = vehicles[j];
            if (v.getCarAge() > 15 && v.getSteeringType().equals("wheel")) {
                oldVehicles[num] = v;
                num++;
            }
        }
        return oldVehicles;
    }

    public int vehiclesWheelSteerType()
    {
        int count = 0;
        for (int i = 0; i < vehiclesCounter; i++) {
            Vehicles v = vehicles[i];
            if((v instanceof Regular || v instanceof Light) && v.getSteeringType().equals("wheel"))
            {
                count ++;
            }
        }
        return count;
    }
}