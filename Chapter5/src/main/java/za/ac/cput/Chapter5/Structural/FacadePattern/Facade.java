package za.ac.cput.Chapter5.Structural.FacadePattern;

/**
 * Created by student on 2015/03/12.
 */
public class Facade {

    public int Calc1(int x) {
        ManU man = new ManU();
        x = 10;
        return man.CommonTask1(x);

    }

    public int Calc2(int x) {
        ManU class1 = new ManU();
        Chelc class2 = new Chelc();
        return class2.CommonTask2(class1, x);

    }

    public int Calc3(int x) {
        ManU class1 = new ManU();
        Chelc class2 = new Chelc();
        Liv class3 = new Liv();
        return class3.CommonTask3(class1, class2, x);

    }





}
