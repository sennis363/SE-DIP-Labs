/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author Michael
 */
public class ComfortableShoe implements Shoe{
    private int comfiness;
    private double price;

    public ComfortableShoe(int comfiness, double price) {
        setComfiness(comfiness);
        setPrice(price);
    }
    
    public double getComfiness() {
        return comfiness;
    }

    public void setComfiness(int comfiness) {
        this.comfiness = comfiness;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
    
    public double getFinalPrice() {
        return (this.price) + (this.price * .1);
    }
    
    
}
