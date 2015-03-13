package za.ac.cput.Chapter5.BehaviouralTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Chapter5.Behavioural.IteratorPattern.Brands;
import za.ac.cput.Chapter5.Behavioural.IteratorPattern.ShoeBrand;

import java.util.Iterator;

/**
 * Created by student on 2015/03/09.
 */
public class TestIteratorPattern {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testIteratorPattern() {
        ShoeBrand bran1 = new ShoeBrand("Nike", "Roche" , 799.99);
        ShoeBrand bran2 = new ShoeBrand("Vanz", "offthewall", 499.99);
        ShoeBrand bran3 = new ShoeBrand("Jordan","Air", 1059.99);
        ShoeBrand bran4 = new ShoeBrand("Jordan", "Flight", 1599.00);
        ShoeBrand bran5 = new ShoeBrand("DC", "skateboard", 599.00);

        Brands b = new Brands();
        b.addItem(bran1);
        b.addItem(bran2);
        b.addItem(bran3);
        b.addItem(bran4);
        b.addItem(bran5);

        System.out.println("Brands:");
        Iterator<ShoeBrand> iterator = b.iterator();
        while(iterator.hasNext()) {
            ShoeBrand sb = iterator.next();
            System.out.println(sb);
        }

        System.out.println("\nRemoving the last item");
        iterator.remove();

        System.out.println("\nBrands");
        iterator = b.iterator();
        while(iterator.hasNext()) {
            ShoeBrand sb = iterator.next();
            System.out.println(sb);
        }

        Assert.assertEquals(b, b);
        Assert.assertNotEquals(b,iterator);

    }

}
