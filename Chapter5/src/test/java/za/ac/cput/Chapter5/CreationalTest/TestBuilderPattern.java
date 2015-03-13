package za.ac.cput.Chapter5.CreationalTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Chapter5.Creational.Builder.*;

/**
 * Created by student on 2015/03/12.
 */
public class TestBuilderPattern {

    @Before
    public void setUpClass() throws Exception {
    }

    @After
    public void tearDownClass() throws Exception {
    }

    @Test
    public void testBuilderPatternPattern() {
        ProgrammerBuilder cput = new CPUTProgammer();
        ProgrammerDirector programmerdirector = new ProgrammerDirector(cput);
        programmerdirector.ProgramLife();
        Programmer pro = programmerdirector.getActivities();
        Assert.assertEquals(pro.toString(), "Eat: Pizza, Sleep: Comfy Bed, Code: Testing Code, Fitness: Jogging" );


        ProgrammerBuilder mealBuilder = new UCTProgrammer();
        ProgrammerDirector mealDirector = new ProgrammerDirector(mealBuilder);
        mealDirector.ProgramLife();
        Programmer meal = mealDirector.getActivities();
        Assert.assertEquals(meal.toString(), "Eat: Gatsby, Sleep: Warm Bed, Code: Html, Fitness: Jogging");
    }
}
