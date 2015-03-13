package za.ac.cput.Chapter5.BehaviouralTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Chapter5.Behavioural.CommandPattern.*;

/**
 * Created by student on 2015/03/11.
 */
public class TestCommandPattern {

    @Before
    public void setUpClass() throws Exception {
    }

    @After
    public  void tearDownClass() throws Exception {
    }

    @Test
    public void testCommandPattern() {
        FreeKickTaker freeKick = new FreeKickTaker();
        Command FreeKickTakerCommand = new FreeKickTakerCommand(freeKick);

        PenaltyTaker penaltykick = new PenaltyTaker();
        Command PenaltyTakerCommand = new PenaltyTakerCommand(penaltykick);

        SpotTaker st = new SpotTaker(FreeKickTakerCommand);
        Assert.assertEquals(st, st);

        st.setCommand(PenaltyTakerCommand);
        st.invoke();


    }


}
