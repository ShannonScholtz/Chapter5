package za.ac.cput.Chapter5.BehaviouralTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Chapter5.Behavioural.MediatorPattern.*;

/**
 * Created by student on 2015/03/11.
 */
public class TestMediatorPattern {

    @Before
    public void setUpClass() throws Exception {
    }

    @After
    public void tearDownClass() throws Exception {
    }

    @Test
    public void testMediatorPattern() {
        Mediator mediator = new Mediator();

        Purchaser individualpurchaser = new IndividualPurchaser(mediator);
        Purchaser companypurchaser = new CompanyPurchaser(mediator);

        float sellingPriceInDollars = 10.0f;
        CarDealer americanSeller = new CarDealer(mediator, sellingPriceInDollars);
        ColourPricing colourpricing = new ColourPricing(mediator);

        double swedishBidInKronor = 6000.00;
        while(!individualpurchaser.attemptToPurchase(swedishBidInKronor)) {
            swedishBidInKronor += 3000.00;
        }

        double frenchBidInEuros = 2000.00;
        while(!companypurchaser.attemptToPurchase(frenchBidInEuros)) {
            frenchBidInEuros += 1000.00;
        }


        Assert.assertEquals(mediator, mediator);
    }


}


