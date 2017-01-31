/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.factorymethod;

/**
 *
 * @author MonsteropE
 */
public class VehicleClient {
    public static void main(String[] args) {
        VehicleCreator creator = new VehicleCreator();
        int fuelLevel;
        //------------------
        System.out.println("****Produce Frist Masterpiece****");
        Vehicle heilcopter = creator.createVehicle("Heilcopter");
        heilcopter.refuel();
        fuelLevel = heilcopter.getFuel();
        System.out.println("- Current Fuel Level is "+fuelLevel);
        heilcopter.move();
        fuelLevel = heilcopter.getFuel();
        System.out.println("- Current Fuel Level is "+fuelLevel);
        //------------------
        System.out.println("****Produce Second Masterpiece****");
        Vehicle submarine = creator.createVehicle("Submarine");
        submarine.refuel();
        fuelLevel = submarine.getFuel();
        System.out.println("- Current Fuel Level is "+fuelLevel);
        submarine.move();
        fuelLevel = submarine.getFuel();
        System.out.println("- Current Fuel Level is "+fuelLevel);
        //------------------
        System.out.println("****Produce Third Masterpiece****");
        Vehicle sportCar = creator.createVehicle("Sport Car");
    }
}
