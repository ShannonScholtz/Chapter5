package za.ac.cput.Chapter5.Behavioural.InterpreterPattern;

/**
 * Created by student on 2015/03/13.
 */
public class MainInterpreterExpression implements Expression {

    private String info;

    public MainInterpreterExpression(String info)
    {
        this.info = info;
    }

    public static Expression getMaleExpression() {
        Expression shannon = new MainInterpreterExpression("Shannon");
        Expression ethon = new MainInterpreterExpression("Ethon");
        return new Or(shannon, ethon);
    }


    @Override
    public boolean interpret(String inter)
    {
        if(inter.contains(info))
        {
            return true;
        }
        return false;
    }
}
