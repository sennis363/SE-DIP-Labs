/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author Michael
 */
public class ShoeService {
    private Shoe shoe;
    
    public void setShoe(Shoe s) {
        if(s == null) {
            throw new NullPointerException();
        }
        
        shoe = s;
    }
    
    public double getFinalPrice(Shoe s) {
        return s.getFinalPrice();
    }
    
}
