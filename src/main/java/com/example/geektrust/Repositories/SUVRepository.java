package com.example.geektrust.Repositories;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import com.example.geektrust.Entities.Vehicle;


public class SUVRepository {

    private Map<Integer,Vehicle> suvMap;
    private Integer autoIncrement=0;
    private Integer suvRevenue=0;


    public SUVRepository(){
        this.suvMap= new HashMap<Integer,Vehicle>();
    }

    
    Vehicle save(Vehicle vehicle){
        autoIncrement++;
        Vehicle veh= new Vehicle(vehicle.getVehicleType(), autoIncrement,vehicle.getVehicleNum());
        suvMap.put(autoIncrement,veh);
        return veh;
    }


    boolean existsById(Integer id){
        return suvMap.containsKey(id);
    }

    List<Vehicle> findAll(){

        return (List<Vehicle>) suvMap.values();

    }

    Optional<Vehicle> findById(Integer id){
        return Optional.of(suvMap.get(id));
    }

    Optional<Vehicle> findByVehNum(String vehnum){
        for(Map.Entry<Integer,Vehicle> veh:suvMap.entrySet()){
            if(veh.getValue().getVehicleNum().equals(vehnum)){
                return Optional.of(veh.getValue());
            }
        }

        return Optional.empty();
    }

    void deleteById(Integer id){
        suvMap.remove(id);
    }

    void deleteByVehicleNum(String vehNum){
        for(Map.Entry<Integer,Vehicle> veh:suvMap.entrySet()){
            if(veh.getValue().getVehicleNum().equals(vehNum)){
                suvMap.remove(veh.getKey());
                return;
            }
        }
    }

    void addRevenue(Integer fee){
        suvRevenue=suvRevenue+fee;
    }



}
