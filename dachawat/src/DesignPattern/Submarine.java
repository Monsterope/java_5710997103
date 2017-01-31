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
public class Submarine extends Vehicle{
    public void refuel(){
        System.out.println("- Refuel");
        fuelLevel = fuelLevel+1000;
    }
    public int getFuel(){
        return fuelLevel;
    }
    public void move(){
        System.out.println("- Dive Dive Dive !");
        fuelLevel = fuelLevel - 30;
    }
    public Submarine(){
        System.out.println("- Hello, I am Submarine");
        fuelLevel = 0;
    }
}
