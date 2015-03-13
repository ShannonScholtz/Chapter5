package za.ac.cput.Chapter5.Structural.FacadePattern;

/**
 * Created by student on 2015/03/12.
 */
public class Chelc {

    public int CommonTask2(ManU man, int x) {
        return 6 + man.CommonTask1(x);
    }
}
