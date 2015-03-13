package za.ac.cput.Chapter5.BehaviouralTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Chapter5.Behavioural.TemplateMethodPattern.Defender;
import za.ac.cput.Chapter5.Behavioural.TemplateMethodPattern.Midfielder;
import za.ac.cput.Chapter5.Behavioural.TemplateMethodPattern.SoccerMethod;

/**
 * Created by student on 2015/03/11.
 */
public class TestTemplateMethodPattern {


    @Before
    public void setUpClass() throws Exception {
    }

    @After
    public void tearDownClass() throws Exception {
    }

    @Test
    public void testTestTemplateMethodPattern() {

        SoccerMethod sm = new Defender();
        sm.methods();

        System.out.println();

        SoccerMethod sm2 = new Midfielder();
        sm2.methods();

        Assert.assertNotEquals(sm, sm2);
    }
}
