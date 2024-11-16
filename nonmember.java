/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;


/**
 *
 * @author Marc
 */
public class NonMember extends Passenger {

    public NonMember(int a, String n) {
        super(a, n);
    }

    @Override
    public double applyDiscount(double p) {
        if (age > 65) {
            p = (p *9)/10;
            return p;
        }
        return p;
    }

}