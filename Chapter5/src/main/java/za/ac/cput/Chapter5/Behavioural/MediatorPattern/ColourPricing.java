package za.ac.cput.Chapter5.Behavioural.MediatorPattern;

/**
 * Created by student on 2015/03/11.
 */
public class ColourPricing {

    Mediator mediator;
    public static final double price = 5999.00;
    public static final double StandardColours = 1999.99;
    public static final double  SpecificColours = 5099.99;

    public ColourPricing(Mediator mediator) {
        mediator.ColourCode(this);
        this.mediator = mediator;
    }

    private double StandardColour(double standard) {
        double stan = standard * (StandardColours);
        //System.out.println("");
        return stan;
    }

    private double SpecificColour(double specific) {
        double spec = specific * (SpecificColours);
        //System.out.println("");
        return spec;
    }



    public double ColourChoice(double amount, String colour) {
        if("White".equalsIgnoreCase(colour)) {
            return StandardColour(amount);
        }
        else
            return SpecificColour(amount);
    }

}
