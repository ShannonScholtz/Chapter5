package za.ac.cput.Chapter5.CreationalTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Chapter5.Creational.FactoryMethod.KawasakiNinja;
import za.ac.cput.Chapter5.Creational.FactoryMethod.MotorCycleFactory;
import za.ac.cput.Chapter5.Creational.FactoryMethod.MotorCycles;

/**
 * Created by student on 2015/03/12.
 */
public class TestFactoryMethod {

    @Before
    public void setUpClass() throws Exception {
    }

    @After
    public void tearDownClass() throws Exception {
    }

    @Test
    public void testFactoryMethod() {

        MotorCycleFactory mcf = new MotorCycleFactory();

        MotorCycles kawa = mcf.getSpeed("ninja");
        MotorCycles honda = mcf.getSpeed("cbr");

        Assert.assertNotEquals(honda.speed(),kawa.speed());

    }
}
