package za.ac.cput.Chapter5.Structural;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Chapter5.Structural.Composite.Composite;
import za.ac.cput.Chapter5.Structural.Composite.Footballer;
import za.ac.cput.Chapter5.Structural.Composite.SoccersBest;

/**
 * Created by student on 2015/03/12.
 */
public class TestComposite {
    @Before
    public void setUpClass() throws Exception {
    }

    @After
    public void tearDownClass() throws Exception {
    }

    @Test
    public void testComposite() {
        Footballer name1 = new Footballer("De Gea");
        Footballer name2 = new Footballer("Davids");
        Footballer name3 = new Footballer("Ronaldo");
        Footballer name4 = new Footballer("Rooney");
        Footballer name5 = new Footballer("Xavi");


        Composite c1 = new Composite();
        c1.add(name1);
        c1.add(name2);

        Composite c2 = new Composite();
        c2.add(name3);
        c2.add(name4);

        Composite c3 = new Composite();
        c3.add(c1);
        c3.add(c2);
        c3.add(name5);
        name2.saves();
        Assert.assertNotEquals(name1, name2);
        c1.saves();
        c2.scores();
        c3.scores();
    }
}

