package za.ac.cput.Chapter5.Structural.FacadePattern;

/**
 * Created by student on 2015/03/12.
 */
public class Liv {

    public int CommonTask3(ManU man, Chelc chel, int x) {
        return man.CommonTask1(x) + chel.CommonTask2(man, x);
    }
}
