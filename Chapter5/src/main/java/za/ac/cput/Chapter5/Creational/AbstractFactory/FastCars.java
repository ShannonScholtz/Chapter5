package za.ac.cput.Chapter5.Creational.AbstractFactory;

/**
 * Created by student on 2015/03/12.
 */
public class FastCars implements  CarModel {

    public Cars getCars(String model)
    {
        if("m3".equalsIgnoreCase(model))
            return new BmwM3();
        else
            return new MercedesC63();
    }
}
