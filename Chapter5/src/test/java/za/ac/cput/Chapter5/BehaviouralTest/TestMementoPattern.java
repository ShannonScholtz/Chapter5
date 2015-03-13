package za.ac.cput.Chapter5.BehaviouralTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Chapter5.Behavioural.MementoPattern.SoccerStar;
import za.ac.cput.Chapter5.Behavioural.MementoPattern.SoccerStarDescription;

/**
 * Created by student on 2015/03/11.
 */
public class TestMementoPattern {

    @Before
    public void setUpClass() throws Exception {
    }

    @After
    public void tearDownClass() throws Exception {
    }

    @Test
    public void testMementoPattern() {

        SoccerStar soccerstar = new SoccerStar();

        SoccerStarDescription soccerStardescription = new SoccerStarDescription("Ryan", "left-wing", "80%", 11, 75);

        soccerStardescription.setPostionAndFitnessAndWeight("left-wing", "90%", 75);
        soccerstar.SaveInfo(soccerStardescription);
        soccerStardescription.setPostionAndFitnessAndWeight("Right-wing", "80%", 80);
        soccerStardescription.setPostionAndFitnessAndWeight("Centre-Mid", "75%", 85);
        soccerstar.ReinstateInfo(soccerStardescription);
    }

    }
