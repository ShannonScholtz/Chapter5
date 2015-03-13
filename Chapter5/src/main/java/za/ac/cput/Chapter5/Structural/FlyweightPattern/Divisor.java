/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.Chapter5.Structural.FlyweightPattern;

/**
 * Created by student on 2015/03/12.
 */
public class Divisor implements Flyweight {
    String operation;

    @Override
    public void Calculation(int x, int y) {
        System.out.println(operation +" "+x+" and "+y+": "+(x / y));
    }

    public Divisor() {
        operation = "Dividing";
        try {
            Thread.sleep(5000);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
