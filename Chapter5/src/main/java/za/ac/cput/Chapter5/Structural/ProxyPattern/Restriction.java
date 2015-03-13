package za.ac.cput.Chapter5.Structural.ProxyPattern;

import java.util.Date;

/**
 * Created by student on 2015/03/12.
 */
public abstract class Restriction {

    public void sendingMessage() {
        System.out.println(this.getClass().getSimpleName() + " you have no restrictions for today only "+ new Date());
    }

}
