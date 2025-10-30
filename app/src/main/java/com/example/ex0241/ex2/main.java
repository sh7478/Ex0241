package com.example.ex0241.ex2;

public class main {
    public static void main(String[]args)
    {

    }

    public double pluralExhaust(Vehicles[] vehicles)
    {
        double sum = 0;
        for(Vehicles v : vehicles)
        {
            sum += v.exhaust();
        }
    }

    public void noiseInVehicles(Vehicles[] vehicles)
    {
        for(Regular r : (Regular[]) vehicles)
        {
            r.noise();
        }
    }
}
