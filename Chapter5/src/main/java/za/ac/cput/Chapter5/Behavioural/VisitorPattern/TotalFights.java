package za.ac.cput.Chapter5.Behavioural.VisitorPattern;

import java.util.List;

/**
 * Created by student on 2015/03/12.
 */
public class TotalFights implements Fights {

    int total = 0;

    @Override
    public void rounds(DivisionsWon ko) {
        int amount = ko.div1 + ko.div2 + ko.div3 + ko.div5;
        System.out.println(ko.div1 +" + "+ ko.div2 +" + "+ ko.div3 +" + "+ ko.div5 +" = "+amount);;
        total += amount;
    }

    @Override
    public void rounds(KnockoutInDivision fr) {
        int amount = fr.div1 + fr.div2 + fr.div3;
        System.out.println("Adding " + fr.div1 + "+" + fr.div2 + "+" + fr.div3 + "=" + amount + " to total");
        total += amount;
    }

    @Override
    public void rounds(List<MMAFights> FightList) {
        for (MMAFights mma : FightList) {
            mma.fighting(this);
        }
    }

    public int getTotal() {
        return total;
    }
}
