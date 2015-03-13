package za.ac.cput.Chapter5.Behavioural.CommandPattern;

/**
 * Created by student on 2015/03/11.
 */
public class FreeKickTakerCommand implements Command {

    FreeKickTaker freekick;

    public FreeKickTakerCommand(FreeKickTaker freekick) {
        this.freekick = freekick;
    }

    @Override
    public void perform() {
        freekick.TakeFreeKick();
    }

}
