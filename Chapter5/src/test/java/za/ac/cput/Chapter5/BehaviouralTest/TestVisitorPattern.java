package za.ac.cput.Chapter5.BehaviouralTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Chapter5.Behavioural.VisitorPattern.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/03/12.
 */
public class TestVisitorPattern {


    @Before
    public void setUpClass() throws Exception {
    }

    @After
    public void tearDownClass() throws Exception {
    }

    @Test
    public void testVisitorPattern() {
        DivisionsWon ko = new DivisionsWon(3, 1, 5, 6);
        DivisionsWon ko2 = new DivisionsWon(2, 7, 1, 1);
        KnockoutInDivision three = new KnockoutInDivision(1, 1, 1);

        List<MMAFights> mma = new ArrayList();
        mma.add(ko);
        mma.add(ko2);
        mma.add(three);

        Fights f = new SumFights();
        f.rounds(mma);

        TotalFights tf = new TotalFights();
        tf.rounds(mma);

        Assert.assertNotEquals(ko, ko2);
    }
}
