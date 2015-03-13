package za.ac.cput.Chapter5.Structural.ProxyPattern;

/**
 * Created by student on 2015/03/12.
 */
public class MinimumRestriction extends Restriction {

    public MinimumRestriction() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
