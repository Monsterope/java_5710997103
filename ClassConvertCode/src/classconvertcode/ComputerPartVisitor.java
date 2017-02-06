/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classconvertcode;

/**
 *
 * @author MonsteropE
 */
public interface ComputerPartVisitor {
    
    public void visit(Computer Computer);
    
    public void visit(Mouse Mouse);
    
    public void visit(Keyboard Keyboard);
    
    public void visit(Monitor Monitor);
}
