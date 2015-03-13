package za.ac.cput.Chapter5.Behavioural.InterpreterPattern;

/**
 * Created by student on 2015/03/13.
 */
public class And implements Expression {

    private Expression expres1 = null;
    private Expression expres2 = null;

    public And(Expression expres1, Expression expres2)
    {
        this.expres1 = expres1;
        this.expres2 = expres2;
    }

    public static Expression getFemaleExpression() {
        Expression sam = new MainInterpreterExpression("sam");
        Expression relationship = new MainInterpreterExpression("relationship");
        return new And(sam, relationship);
    }

    @Override
    public boolean interpret(String inter){
        return expres1.interpret(inter) && expres2.interpret(inter);
    }
}
