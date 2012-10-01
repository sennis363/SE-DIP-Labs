/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author Michael
 */
public class RunningShoe implements Shoe{
    private double speed;
    private double price;

public RunningShoe(int speed, double price) {
        setSpeed(speed);
        setPrice(price);
    }    
    
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getFinalPrice() {
        return (this.price) + (this.price *.3);
    }
    
    
    
}
