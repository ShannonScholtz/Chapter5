package za.ac.cput.Chapter5.Behavioural.IteratorPattern;

/**
 * Created by student on 2015/03/09.
 */
public class ShoeBrand {

    String brand;
    String type;
    double price;


    public ShoeBrand(String brand, String type, double price){
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString(){
        return brand + " "+ type + ": R" + price;
    }
}
