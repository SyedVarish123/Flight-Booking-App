/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Marc
 */
public abstract class Passenger {

    String name;
    int age;

    public Passenger(int a, String n) {
        name = n;
        age = a;

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    abstract public double applyDiscount(double p);

}