package za.ac.cput.Chapter5.Structural;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Chapter5.Structural.FlyweightPattern.Flyweight;
import za.ac.cput.Chapter5.Structural.FlyweightPattern.FlyweightFactory;

/**
 * Created by student on 2015/03/12.
 */
public class TestFlyweightPattern {

    @Before
    public void setUpClass() throws Exception {
    }

    @After
    public void tearDownClass() throws Exception {
    }

    @Test
    public void testFlyweightPattern() {
        FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();
        FlyweightFactory flyweightFactory2 = FlyweightFactory.getInstance();

        for (int i = 1; i <= 5; i++) {

            Flyweight fly = flyweightFactory.getFlyweight("minus");
            fly.Calculation(i, i);

            Flyweight fly2 = flyweightFactory2.getFlyweight("divide");
            fly2.Calculation(i, i);

        }
        Assert.assertEquals(flyweightFactory, flyweightFactory2);

        //did not have much understanding for flyweight
    }
}
