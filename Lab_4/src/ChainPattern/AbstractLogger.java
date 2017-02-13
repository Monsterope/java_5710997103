/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainPattern;

/**
 *
 * @author MonsteropE
 */
public abstract class AbstractLogger {
    public int INFO;
    public int DEBUG;
    public int ERROR;
    public int level;
    public AbstractLogger nextLogger;
    
    public void setNextLogger(){
        
    }
    
    public void logMessage(){
        
    }
    
    private void write(){
        
    }
}
