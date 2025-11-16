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
        for (Vehicles v : vehicles) {
            if (v.getCarAge() > 15 && v.getSteeringType().equals("wheel")) {
                i++;
            }
        }
        Vehicles[] oldVehicles = new Vehicles[i];
        for (Vehicles v : vehicles) {
            if (v.getCarAge() > 15 && v.getSteeringType().equals("wheel")) {
                oldVehicles[j] = v;
                j++;
            }
        }
        return oldVehicles;
    }

    public int vehiclesWheelSteerType()
    {
        int count = 0;
        for (Vehicles v : vehicles) {
            if((v instanceof Regular || v instanceof Light) && v.getSteeringType().equals("wheel"))
            {
                count ++;
            }
        }
        return count;
    }
}
