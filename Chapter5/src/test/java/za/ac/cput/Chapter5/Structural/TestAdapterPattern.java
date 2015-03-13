package za.ac.cput.Chapter5.Structural;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Chapter5.Structural.AdapterPattern.MoviePlayer;

/**
 * Created by student on 2015/03/13.
 */
public class TestAdapterPattern {


    @Before
    public  void setUpClass() throws Exception {
    }

    @After
    public  void tearDownClass() throws Exception {
    }

    @Test
    public void testAdapterPattern() {

        MoviePlayer mp = new MoviePlayer();
        mp.playMovie("avi", "Dumb and Dummber2");
        mp.playMovie("vlc", "Thor.mp3");
        mp.playMovie("mp3", "Love Don't Cost A Thing");
        Assert.assertEquals(mp, mp);

        MoviePlayer mp2 = new MoviePlayer();
        mp2.playMovie("mp4", "Titanic");
        mp2.playMovie("mkv", "Rowing");
        Assert.assertEquals(mp2,mp2);


    }
}
