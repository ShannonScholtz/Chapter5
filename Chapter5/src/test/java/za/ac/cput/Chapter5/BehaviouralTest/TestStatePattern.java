package za.ac.cput.Chapter5.BehaviouralTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Chapter5.Behavioural.StatePattern.Depressing;
import za.ac.cput.Chapter5.Behavioural.StatePattern.Exstatic;
import za.ac.cput.Chapter5.Behavioural.StatePattern.SoccerTeam;

/**
 * Created by student on 2015/03/11.
 */
public class TestStatePattern {

    @Before
    public void setUpClass() throws Exception {
    }

    @After
    public void tearDownClass() throws Exception {
    }

    @Test
    public void testStatePattern() {
        SoccerTeam soccerteam = new SoccerTeam(new Exstatic());
        Assert.assertEquals(soccerteam.WinningTeam(), "Yeah we won!!!!!");
        Assert.assertEquals(soccerteam.LoosingTeam(), "We glad we made it this far");

        soccerteam.setChamps(new Depressing());
        Assert.assertEquals(soccerteam.WinningTeam(), "We won but they don't want to give through us a party");
        Assert.assertEquals(soccerteam.LoosingTeam(), "We lost agh!!!!");
    }
}
