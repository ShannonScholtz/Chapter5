package za.ac.cput.Chapter5.Behavioural.MediatorPattern;

/**
 * Created by student on 2015/03/11.
 */
public class CompanyPurchaser extends Purchaser {

    public CompanyPurchaser(Mediator mediator) {
        super(mediator, "White");
        this.mediator.CompanyInterest(this);
    }
}
