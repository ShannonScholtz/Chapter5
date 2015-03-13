package za.ac.cput.Chapter5.Behavioural.VisitorPattern;

/**
 * Created by student on 2015/03/12.
 */
public class DivisionsWon implements MMAFights{

    int div1;
    int div2;
    int div3;
    int div5;

    public DivisionsWon(int div1, int div2, int div3, int div5) {
        this.div1 = div1;
        this.div2 = div2;
        this.div3 = div3;
        this.div5 = div5;
    }


    @Override
    public void fighting(Fights f) {
        f.rounds(this);
    }
}
