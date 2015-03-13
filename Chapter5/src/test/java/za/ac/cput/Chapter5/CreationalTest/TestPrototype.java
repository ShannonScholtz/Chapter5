package za.ac.cput.Chapter5.CreationalTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Chapter5.Creational.Prototype.Cyclist;
import za.ac.cput.Chapter5.Creational.Prototype.Runner;

/**
 * Created by student on 2015/03/12.
 */
public class TestPrototype {

    @Before
    public void setUpClass() throws Exception {
    }

    @After
    public void tearDownClass() throws Exception {
    }

    @Test
    public void testPrototype() {

        Cyclist c1 = new Cyclist("Fast");
        Cyclist c2 = (Cyclist)c1.action();
        Assert.assertEquals(c2.toString(), c1.toString());

        Runner r1 = new Runner("Sprints");
        Runner r2 = (Runner)r1.action();
        Assert.assertEquals(r1.toString(), r2.toString());
    }
}
