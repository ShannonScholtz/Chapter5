package za.ac.cput.Chapter5.Creational.AbstractFactory;

/**
 * Created by student on 2015/03/12.
 */
public class AbstractFactory {


        public CarModel getCarModel(String model) {
            if("supercars".equalsIgnoreCase(model))
                return new SuperCars();
            else
                return new FastCars();
        }
}
