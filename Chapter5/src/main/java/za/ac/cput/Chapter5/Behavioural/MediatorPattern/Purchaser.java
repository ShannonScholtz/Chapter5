package za.ac.cput.Chapter5.Behavioural.MediatorPattern;

/**
 * Created by student on 2015/03/11.
 */
public class Purchaser {

    Mediator mediator;
    String colour;

    public Purchaser(Mediator mediator, String colour) {
        this.mediator = mediator;
        this.colour = colour;
    }

    public boolean attemptToPurchase(double amount) {
        System.out.println("Purchaser ordering " + amount+" "+colour);
        return mediator.placingOrder(amount, colour);
    }
}
