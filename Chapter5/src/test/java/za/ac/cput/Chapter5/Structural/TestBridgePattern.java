/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.Chapter5.Structural;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import za.ac.cput.Chapter5.Structural.BridgePattern.*;


/**
 * Created by student on 2015/03/12.
 */
public class TestBridgePattern {

    @Before
    public  void setUpClass() throws Exception {
    }

    @After
    public  void tearDownClass() throws Exception {
    }
    
    @Test
    public void testBridgePattern() {
        Football ball = new EnglishPremierLeague(new English());
        ball.score();
        Assert.assertEquals(ball.score(), "One of the best leagues in the world\nTough competition");
        
       ball.setSport(new English());
        ball.score();
        Assert.assertEquals(ball.score(), "One of the best leagues in the world\nTough competition");

        Football ball2 = new LaLiga(new Spanish());
        ball2.score();
        Assert.assertEquals(ball2.score(), "A lot of flair in the spanish league\nYou have to be fast and skillful");


        ball2.setSport(new Spanish());
        ball2.score();
        Assert.assertEquals(ball2.score(), "A lot of flair in the spanish league\nYou have to be fast and skillful");
        
    }
}
