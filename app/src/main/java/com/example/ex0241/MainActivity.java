package com.example.ex0241;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.ex0241.ex2.Bicycle;
import com.example.ex0241.ex2.Heavy;
import com.example.ex0241.ex2.Regular;
import com.example.ex0241.ex2.Vehicles;

public class MainActivity extends AppCompatActivity {

    public double pluralExhaust(Vehicles[] vehicles)
    {
        double sum = 0;
        for(Vehicles v : vehicles)
        {
            sum += v.exhaust();
        }
        return sum;
    }
    public void noiseInVehicles(Vehicles[] vehicles)
    {
        for(Vehicles v : (Vehicles[]) vehicles)
        {
            if(v instanceof Regular) {
                ((Regular) v).noise();
            }
        }
    }

    public int passengersInVehicles(Vehicles[] vehicles)
    {
        int passengers = 0;
        for(Vehicles v : (Vehicles[]) vehicles)
        {
            if(v instanceof Regular) {
                passengers += ((Regular) v).getPassengerAmount();
            }
            else if(v instanceof Bicycle)
            {
                passengers++;
            }
        }
        return passengers;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
