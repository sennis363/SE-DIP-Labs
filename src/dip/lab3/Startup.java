/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author Michael
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComfortableShoe pair1 = new ComfortableShoe(5, 45.15);
        RunningShoe pair2 = new RunningShoe(3, 20.80);
        
        
        Shoe[] shoes = {pair1, pair2};
        
        ShoeService ss = new ShoeService();
        
        for(int i=0; i < shoes.length; i++) {
            System.out.print("Shoe pair " + (i+1) + ": $");
            System.out.println(ss.getFinalPrice(shoes[i]));
            
        }
    }
}
