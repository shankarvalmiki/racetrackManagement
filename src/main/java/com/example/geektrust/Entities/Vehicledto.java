package com.example.geektrust.Entities;

import java.time.LocalTime;

public class Vehicledto {
    public Vehicledto(Vehicle vehicle, java.time.LocalTime localTime) {
        this.vehicle = vehicle;
        LocalTime = localTime;
    }
    private Vehicle vehicle;
    private LocalTime LocalTime;
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public LocalTime getLocalTime() {
        return LocalTime;
    }
    public void setLocalTime(LocalTime localTime) {
        LocalTime = localTime;
    }

    
}
