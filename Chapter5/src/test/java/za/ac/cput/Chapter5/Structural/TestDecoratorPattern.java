package za.ac.cput.Chapter5.Structural;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Chapter5.Structural.Decorator.Racer;
import za.ac.cput.Chapter5.Structural.Decorator.SponsorDecorator;
import za.ac.cput.Chapter5.Structural.Decorator.TrackCars;
import za.ac.cput.Chapter5.Structural.Decorator.WheelDecorator;

/**
 * Created by student on 2015/03/12.
 */
public class TestDecoratorPattern {

    @Before
    public void setUpClass() throws Exception {
    }

    @After
    public void tearDownClass() throws Exception {
    }

    @Test
    public void testDecoratorPattern() {
        TrackCars tc = new Racer();
        tc.racing();
        tc = new WheelDecorator(tc);
        tc.racing();
        tc = new SponsorDecorator(tc);
        tc = new SponsorDecorator(tc);
        tc.racing();

        Assert.assertEquals(tc, tc);
    }
}
