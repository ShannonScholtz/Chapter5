package za.ac.cput.Chapter5.Creational.AbstractFactory;

/**
 * Created by student on 2015/03/12.
 */
public class SuperCars implements CarModel{

    public Cars getCars(String model)
    {
        if("buggati".equalsIgnoreCase(model))
            return new BugattiVeyron();
        else
            return new KoenigseggAgeraR();
    }
}
