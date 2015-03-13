package za.ac.cput.Chapter5.BehaviouralTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Chapter5.Behavioural.StrategyPattern.BlueBulls;
import za.ac.cput.Chapter5.Behavioural.StrategyPattern.Result;
import za.ac.cput.Chapter5.Behavioural.StrategyPattern.RugbyTeam;
import za.ac.cput.Chapter5.Behavioural.StrategyPattern.Stormers;

/**
 * Created by student on 2015/03/11.
 */
public class TestStrategyPattern {

    @Before
    public void setUpClass() throws Exception {
    }

    @After
    public void tearDownClass() throws Exception {
    }

    @Test
    public void testStrategyPattern() {
        int score = 80;
        RugbyTeam worst = new BlueBulls();
        Result r = new Result(score, worst);

        RugbyTeam best = new Stormers();
        r.setRugbyTeam(best);

        Assert.assertNotEquals(worst, best);

    }
}
