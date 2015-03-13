package za.ac.cput.Chapter5.Behavioural.TemplateMethodPattern;

/**
 * Created by student on 2015/03/11.
 */
public class Defender extends SoccerMethod{

    @Override
    public void tackle()
    {
        System.out.println("A Defender defends his posts by tackling");
    }

    @Override
    public void score()
    {
        System.out.println("A Defender scores a volley goal");
    }

    @Override
    public void pass()
    {
        System.out.println("A Defender passes the ball to the midfielder");
    }
}
