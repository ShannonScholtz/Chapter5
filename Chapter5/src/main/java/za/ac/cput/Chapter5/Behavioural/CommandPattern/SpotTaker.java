package za.ac.cput.Chapter5.Behavioural.CommandPattern;

/**
 * Created by student on 2015/03/11.
 */
public class SpotTaker {

    Command command;

    public SpotTaker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void invoke() {
        command.perform();
    }
}
