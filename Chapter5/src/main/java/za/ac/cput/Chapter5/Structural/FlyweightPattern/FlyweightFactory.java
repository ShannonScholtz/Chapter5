/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.Chapter5.Structural.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/03/12.
 */
public class FlyweightFactory {
    private static FlyweightFactory flyweightFactory;
    private Map<String, Flyweight> flyweightPool;

    public FlyweightFactory() {
        flyweightPool = new HashMap<>();
    }
    
    public static FlyweightFactory getInstance() {
        if(flyweightFactory == null) {
            flyweightFactory = new FlyweightFactory();
        }
        return flyweightFactory;
    }
    
    public Flyweight getFlyweight(String key) {
        if(flyweightPool.containsKey(key))
            return flyweightPool.get(key);
        else {
            Flyweight flyweight;
            if("minus".equalsIgnoreCase(key))
                flyweight =  new Subtractor();
            else
                flyweight = new Divisor();
            flyweightPool.put(key, flyweight);
            return flyweight;
        }
    }
    
    
}
