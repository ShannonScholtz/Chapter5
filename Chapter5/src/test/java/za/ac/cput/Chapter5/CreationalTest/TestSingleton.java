package za.ac.cput.Chapter5.CreationalTest;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Chapter5.Creational.Singleton.Singleton;

/**
 * Created by student on 2015/03/12.
 */
public class TestSingleton {

    @Before
    public void setUpClass() throws Exception {
    }

    @After
    public void tearDownClass() throws Exception {
    }

    @Test
    public void testSingleton() {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Assert.assertEquals(singleton1, singleton2);
    }
}
