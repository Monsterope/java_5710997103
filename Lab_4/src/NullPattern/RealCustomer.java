/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NullPattern;

/**
 *
 * @author MonsteropE
 */
public class RealCustomer extends AbstractCustomer{
    private String name;
    
    public RealCustomer(){
        
    }
    
    public Boolean isNil(){
        return null;
    }
    
    public String getname(){
        return null;
    }
}
