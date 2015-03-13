package za.ac.cput.Chapter5.Behavioural.MediatorPattern;

/**
 * Created by student on 2015/03/11.
 */
public class IndividualPurchaser extends Purchaser {

    public IndividualPurchaser(Mediator mediator) {
        super(mediator, "LimeGreen");
        this.mediator.IndividualInterest(this);
    }
}
