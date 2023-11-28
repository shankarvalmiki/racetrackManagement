package com.example.geektrust.Entities;

public class Vehicle {

    private VehicleType vehicleType;

    private Integer id;
    
    private String vehicleNum;



    public Vehicle(VehicleType vehicleType, String vehicleNum) {
        this.vehicleType = vehicleType;
        this.vehicleNum = vehicleNum;
    }

    

    public Vehicle(VehicleType vehicleType, Integer id, String vehicleNum) {
        this.vehicleType = vehicleType;
        this.id = id;
        this.vehicleNum = vehicleNum;
    }



    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNum() {
        return vehicleNum;
    }

    public void setVehicleNum(String vehicleNum) {
        this.vehicleNum = vehicleNum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    
}
