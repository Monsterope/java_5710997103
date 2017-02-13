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
public class NullCustomer extends AbstractCustomer{
    private String name;
    
    public NullCustomer(){
        
    }
    
    public Boolean isNil(){
        return null;
    }
    
    public String getname(){
        return null;
    }
}
