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
public class VehicleCreator {
    /**Creates a new instance of VehicleCreator */
    public Vehicle createVehicle(String order){
        if(order.equals("Heilcopter")){
            return (new Heilcopter());
        }
        else{
            if(order.equals("Submarine")){
                return(new Submarine());
            }
            else{
                System.out.println("Out of Spec");
                return(null);
            }
        }
    }
}
