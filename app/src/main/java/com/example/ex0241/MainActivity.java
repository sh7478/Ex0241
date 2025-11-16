package com.example.ex0241;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.ex0241.ex2.Bicycle;
import com.example.ex0241.ex2.Cart;
import com.example.ex0241.ex2.Heavy;
import com.example.ex0241.ex2.Regular;
import com.example.ex0241.ex2.Vehicles;

public class MainActivity extends AppCompatActivity {

    public static double pluralExhaust(Vehicles[] vehicles)
    {
        double sum = 0;
        for(Vehicles v : vehicles)
        {
            sum += v.exhaust();
        }
        return sum;
    }
    public static void noiseInVehicles(Vehicles[] vehicles)
    {
        for(Vehicles v : vehicles)
        {
            if(v instanceof Regular) {
                ((Regular) v).noise();
            }
        }
    }

    public static int passengersInVehicles(Vehicles[] vehicles)
    {
        int passengers = 0;
        for(Vehicles v : vehicles)
        {
            if(v instanceof Regular) {
                passengers += ((Regular) v).getPassengerAmount() - 1;
            }
            else if(v instanceof Bicycle)
            {
                passengers++;
            }
        }
        return passengers;
    }

    public static int vehicleHighChargeTime(Vehicles[] vehicles)
    {
        double chargeTime = 0;
        int carNumber = 0;
        for(Vehicles v : vehicles)
        {
            if(v instanceof Cart) {
                if(chargeTime < ((Cart)v).getChargeTime())
                {
                    chargeTime = ((Cart)v).getChargeTime();
                    carNumber = v.getCarNumber();
                }
            }
        }
        return carNumber;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
