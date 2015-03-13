package za.ac.cput.Chapter5.Structural.ProxyPattern;

import java.util.Date;

/**
 * Created by student on 2015/03/12.
 */
public class Proxy {

    MinimumRestriction minimum;
    public Proxy() {
        System.out.println("Creating proxy at "+ new Date());
    }

    public void sendingMessage() {
        if (minimum == null)
            minimum = new MinimumRestriction();
        minimum.sendingMessage();
    }
}
