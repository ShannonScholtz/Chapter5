package za.ac.cput.Chapter5.CreationalTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Chapter5.Creational.AbstractFactory.AbstractFactory;
import za.ac.cput.Chapter5.Creational.AbstractFactory.CarModel;
import za.ac.cput.Chapter5.Creational.AbstractFactory.Cars;

/**
 * Created by student on 2015/03/12.
 */
public class TestAbstractFactory {

    @Before
    public void setUpClass() throws Exception {
    }

    @After
    public void tearDownClass() throws Exception {
    }

    @Test
    public void testAbstractFactoryPattern() {

        AbstractFactory abstractFactory = new AbstractFactory();

        CarModel cm = abstractFactory.getCarModel("supercars");
        Cars bug = cm.getCars("buggati");
        Assert.assertEquals(bug.speed(), "409km");

        Cars ageraR= cm.getCars("agera");
        Assert.assertEquals(ageraR.speed(), "440km");

        CarModel cm2 = abstractFactory.getCarModel("fastcars");
        Cars bmw = cm2.getCars("m3");
        Assert.assertEquals(bmw.speed(), "355km");

        Cars merc = cm2.getCars("c63");
        Assert.assertEquals(merc.speed(), "350km");
    }
}
