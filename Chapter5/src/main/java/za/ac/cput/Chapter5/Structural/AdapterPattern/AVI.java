package za.ac.cput.Chapter5.Structural.AdapterPattern;

/**
 * Created by student on 2015/03/12.
 */
public class AVI implements  Player{

    @Override
    public void vlc(String movieName)
    {
        //do nothing
    }

    @Override
    public void avi(String movieName)
    {
        System.out.println("Playing " + movieName + " through Jet Audio");
    }
}
