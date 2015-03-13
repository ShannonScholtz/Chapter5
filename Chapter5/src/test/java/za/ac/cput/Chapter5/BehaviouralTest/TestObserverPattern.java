package za.ac.cput.Chapter5.BehaviouralTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Chapter5.Behavioural.ObserverPattern.ChelseaPlayer;
import za.ac.cput.Chapter5.Behavioural.ObserverPattern.GoalScorerLogBoard;
import za.ac.cput.Chapter5.Behavioural.ObserverPattern.ManUnitedPlayer;

/**
 * Created by student on 2015/03/12.
 */
public class TestObserverPattern {

    @Before
    public void setUpClass() throws Exception {
    }

    @After
    public void tearDownClass() throws Exception {
    }

    @Test
    public void testObserverPattern() {

        GoalScorerLogBoard gslb = new GoalScorerLogBoard(6);
        ChelseaPlayer cfc = new ChelseaPlayer();
        ManUnitedPlayer mufc = new ManUnitedPlayer();

        gslb.addPlayer(cfc);
        gslb.addPlayer(mufc);
        gslb.setGoals(8);
        gslb.removePlayer(cfc);
        gslb.setGoals(21);

        Assert.assertNotEquals(mufc, cfc);
    }
}
