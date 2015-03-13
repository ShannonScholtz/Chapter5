package za.ac.cput.Chapter5.Structural;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Chapter5.Structural.ProxyPattern.MaximumRestriction;
import za.ac.cput.Chapter5.Structural.ProxyPattern.Proxy;

/**
 * Created by student on 2015/03/12.
 */
public class TestProxyPattern {

    @Before
    public void setUpClass() throws Exception {
    }

    @After
    public void tearDownClass() throws Exception {
    }

    @Test
    public void testProxyPattern() {
        Proxy proxy = new Proxy();
        MaximumRestriction max = new MaximumRestriction();
        Assert.assertNotNull(proxy);
        max.sendingMessage();
        proxy.sendingMessage();
    }
}
