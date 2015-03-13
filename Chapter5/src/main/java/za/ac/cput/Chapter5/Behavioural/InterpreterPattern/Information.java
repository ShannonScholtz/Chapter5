package za.ac.cput.Chapter5.Behavioural.InterpreterPattern;

/**
 * Created by student on 2015/03/13.
 */
public class Information{

    public Expression getMaleExpression(Expression expr1, Expression expr2){
        return new Or(expr1, expr2);
    }

    public Expression getFemaleFastCarExpression(Expression expr1, Expression expr2){
        return new And(expr1, expr2);
    }
}



