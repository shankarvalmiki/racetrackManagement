package com.example.geektrust.Repositories;

import java.util.Map;
import java.util.HashMap;
import java.util.Optional;
import java.util.List;

import com.example.geektrust.Entities.Vehicle;



public class BikeRepository {
    private final Map<Integer,Vehicle> bikeMap;
    private Integer autoIncrement=0;
    private Integer bikeRevenue=0;

   

    public BikeRepository(){
        this.bikeMap=new HashMap<Integer,Vehicle>();
    }

    public Vehicle save(Vehicle vehicle){
        autoIncrement++;
        Vehicle veh = new Vehicle(vehicle.getVehicleType(), autoIncrement,vehicle.getVehicleNum());
        bikeMap.put(autoIncrement,veh);
        return veh;
    }

    public boolean existsById(Integer id){

        return bikeMap.keySet().contains(id);
    }

    public Optional<Vehicle> findByVehicleNum(String vehicleNum){
            for(Vehicle veh:bikeMap.values()){
                if(veh.getVehicleNum().equals(vehicleNum)){
                    return Optional.of(veh);
                }
            }
            return Optional.empty();
            
    }

    Optional<Vehicle> findById(Integer id){
        return Optional.ofNullable(bikeMap.get(id));
    }

    List<Vehicle> findAll(){

        return (List<Vehicle>)bikeMap.values();

    }


    void deleteByVehicleNum(String vehicleNum){
        for(Map.Entry<Integer,Vehicle> veh:bikeMap.entrySet()){
            if(veh.getValue().getVehicleNum().equals(vehicleNum)){
                bikeMap.remove(veh.getKey());
                return;
            }

        }

    }

    void deleteById(Integer id){
       bikeMap.remove(id);
    }

    void addRevenue(Integer fee){

        bikeRevenue=bikeRevenue+fee;

    }


}
