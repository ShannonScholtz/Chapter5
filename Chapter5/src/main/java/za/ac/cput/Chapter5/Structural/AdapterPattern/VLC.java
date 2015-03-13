package za.ac.cput.Chapter5.Structural.AdapterPattern;

/**
 * Created by student on 2015/03/12.
 */
public class VLC implements Player{

    @Override
    public void vlc(String movieName)
    {
        System.out.println("Playing " + movieName + " through VLC");
    }

    @Override
    public void avi(String movieName)
    {
        //leave empty for now
    }
}
