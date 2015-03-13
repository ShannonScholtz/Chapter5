package za.ac.cput.Chapter5.Behavioural.CommandPattern;

/**
 * Created by student on 2015/03/11.
 */
public class PenaltyTakerCommand implements Command {

    PenaltyTaker penaltykick;

    public PenaltyTakerCommand(PenaltyTaker penaltykick) {
        this.penaltykick = penaltykick;
    }

    @Override
    public void perform() {
        penaltykick.TakePenalty();
    }

}
