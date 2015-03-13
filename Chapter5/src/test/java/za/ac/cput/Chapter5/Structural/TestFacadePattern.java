package za.ac.cput.Chapter5.Structural;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Chapter5.Structural.FacadePattern.Facade;

/**
 * Created by student on 2015/03/12.
 */
public class TestFacadePattern {

    @Before
    public void setUpClass() throws Exception {
    }

    @After
    public void tearDownClass() throws Exception {
    }

    @Test
    public void testFacadePattern() {

        int x = 10;
        Facade facade = new Facade();
        facade.Calc2(x);
        facade.Calc1(x);
        facade.Calc3(x);
        Assert.assertEquals(facade,facade);


    }
}
