package za.ac.cput.Chapter5.BehaviouralTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Chapter5.Behavioural.InterpreterPattern.And;
import za.ac.cput.Chapter5.Behavioural.InterpreterPattern.Expression;
import za.ac.cput.Chapter5.Behavioural.InterpreterPattern.Information;
import za.ac.cput.Chapter5.Behavioural.InterpreterPattern.MainInterpreterExpression;

/**
 * Created by student on 2015/03/13.
 */
public class TestInterpreterPattern {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testInterpreterPattern() {
        Information interpret = new Information();

        Expression shannon = new MainInterpreterExpression("Shannon");
        Expression ethon = new MainInterpreterExpression("Ethon");

        Expression isMale = interpret.getMaleExpression(shannon, ethon);

        Expression kim = new MainInterpreterExpression("Kim");
        Expression ferrari = new MainInterpreterExpression("Ferrari");

        Expression isMarried = interpret.getFemaleFastCarExpression(kim, ferrari);

        Assert.assertEquals(isMale.interpret("Shannon"), true);
        Assert.assertEquals(isMale.interpret("Ethon"), true);
        Assert.assertEquals(isMale.interpret("Eddy"), false);


        Assert.assertEquals(isMarried.interpret("Ferrari Kim"), true);
        Assert.assertEquals(isMarried.interpret("Civic Kim"), false);



    }
}
