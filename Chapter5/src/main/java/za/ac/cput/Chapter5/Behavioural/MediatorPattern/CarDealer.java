package za.ac.cput.Chapter5.Behavioural.MediatorPattern;

/**
 * Created by student on 2015/03/11.
 */
public class CarDealer {

    Mediator mediator;
    double price;

    public CarDealer(Mediator mediator, double price) {
        this.mediator = mediator;
        this.price = price;
        this.mediator.VwCarDealer(this);
    }

    public static boolean AcceptOrder(double order) {
        if (order >= order) {
            return true;
        } else {
            return false;
        }
    }

}
