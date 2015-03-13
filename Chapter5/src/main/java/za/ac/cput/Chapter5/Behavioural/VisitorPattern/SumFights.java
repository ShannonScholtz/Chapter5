package za.ac.cput.Chapter5.Behavioural.VisitorPattern;

import java.util.List;

/**
 * Created by student on 2015/03/12.
 */
public class SumFights implements Fights{

    @Override
    public void rounds(DivisionsWon ko) {
        int amount = ko.div1 + ko.div2 + ko.div3 + ko.div5;
        System.out.println(ko.div1 +" + "+ ko.div2 +" + "+ ko.div3 +" + "+ ko.div5 +" = "+amount);
    }

    @Override
    public void rounds(KnockoutInDivision fr) {
        int amount = fr.div1 + fr.div2 + fr.div3;
        System.out.println(fr.div1 +" + "+fr.div2 +" + "+fr.div3 +" = "+amount);
    }

    @Override
    public void rounds(List<MMAFights> fightList) {
        for(MMAFights mma : fightList)
            mma.fighting(this);
    }
}
