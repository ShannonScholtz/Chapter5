package za.ac.cput.Chapter5.Behavioural.MediatorPattern;

/**
 * Created by student on 2015/03/11.
 */
public class Mediator {

    Purchaser companypurchaser;
    Purchaser individualpurchaser;
    CarDealer dealer;
    ColourPricing colourpricng;

    public Mediator() {
    }

    public void CompanyInterest(CompanyPurchaser companypurchaser) {
        this.companypurchaser = companypurchaser;
    }

    public void IndividualInterest(IndividualPurchaser individualpurchaser) {
        this.individualpurchaser = individualpurchaser;
    }

    public void VwCarDealer(CarDealer dealer) {
        this.dealer = dealer;
    }

    public void ColourCode(ColourPricing colourpricng) {
        this.colourpricng = colourpricng;
    }

    public boolean placingOrder(double amount, String colour) {
        double col = colourpricng.ColourChoice(amount, colour);
        return CarDealer.AcceptOrder(col);
    }
}
