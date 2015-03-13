package za.ac.cput.Chapter5.Creational.FactoryMethod;

/**
 * Created by student on 2015/03/12.
 */
public class MotorCycleFactory {

    public MotorCycles getSpeed(String make) {
        if ("ninja".equalsIgnoreCase(make))
            return new KawasakiNinja();
        else
            return new HondaCBR();
    }
}
