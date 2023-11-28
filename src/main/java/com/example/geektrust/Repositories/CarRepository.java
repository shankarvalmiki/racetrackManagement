package com.example.geektrust.Repositories;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.List;


import com.example.geektrust.Entities.Vehicle;

public class CarRepository {

    private Map<Integer, Vehicle> carMap;
    private Integer autoIncrement=0;
    private Integer carRevenue=0;;

    public CarRepository(){
        this.carMap= new HashMap<Integer, Vehicle>();
    }


    Vehicle save(Vehicle vehicle){
        autoIncrement++;
        Vehicle veh = new Vehicle(vehicle.getVehicleType(), autoIncrement,vehicle.getVehicleNum());
        carMap.put(autoIncrement, veh);
        return veh;
    }

    boolean existsById(Integer id){
        return carMap.keySet().contains(id);
    }

    Optional<Vehicle> findByVehicleNum(String vehNum){
        for(Map.Entry<Integer,Vehicle> veh: carMap.entrySet()){
            if(veh.getValue().getVehicleNum().equals(vehNum)){
                return Optional.of(veh.getValue());
            }
        }
        return Optional.empty();
    }

    Optional<Vehicle> findById(Integer id ){
        return Optional.of(carMap.get(id));
    }

    List<Vehicle> findAll(){

        return (List<Vehicle>) carMap.values();

    }

    void deleteByVehicleNum(String vehNum){
        for(Map.Entry<Integer,Vehicle> veh : carMap.entrySet()){
            if(veh.getValue().getVehicleNum().equals(vehNum)){
                carMap.remove(veh.getKey());
                return;
            }

        }
    }

    void deleteById(Integer id){
        carMap.remove(id);
    }

    void addRevenue(Integer fee){
        carRevenue=carRevenue+fee;
    }




    
}
