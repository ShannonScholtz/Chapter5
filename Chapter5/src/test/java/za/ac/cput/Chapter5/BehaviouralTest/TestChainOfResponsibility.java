package za.ac.cput.Chapter5.BehaviouralTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Chapter5.Behavioural.ChainOfResponsibiltyPattern.*;

/**
 * Created by student on 2015/03/11.
 */
public class TestChainOfResponsibility {


    @Before
    public void setUpClass() throws Exception {
    }

    @After
    public void tearDownClass() throws Exception {
    }

    @Test
    public void testChainOfReponsibilityPattern() {
        BestEnglishSoccerClubs chain = setUpChain();

        chain.Response(BestEnglishSoccerClubsEnum.ManchesterUnited);
        chain.Response(BestEnglishSoccerClubsEnum.Chelsea);
        chain.Response(BestEnglishSoccerClubsEnum.ManCity);
        chain.Response(BestEnglishSoccerClubsEnum.Arsenal);
        chain.Response(BestEnglishSoccerClubsEnum.Liverpool);


        Assert.assertEquals(chain, chain);

    }

    public static BestEnglishSoccerClubs setUpChain() {
        BestEnglishSoccerClubs manu= new ManUnited();
        BestEnglishSoccerClubs chelc = new ChelseaFc();
        BestEnglishSoccerClubs arsen = new ArsenalFc();
        BestEnglishSoccerClubs manc = new ManCityFc();
        BestEnglishSoccerClubs liv = new LiverpoolFc();

        manu.setChampions(chelc);
        chelc.setChampions(arsen);
        arsen.setChampions(manc);
        manc.setChampions((liv));

        return manu;
    }


}
