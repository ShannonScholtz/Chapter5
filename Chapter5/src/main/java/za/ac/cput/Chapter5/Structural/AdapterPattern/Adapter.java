package za.ac.cput.Chapter5.Structural.AdapterPattern;

/**
 * Created by student on 2015/03/12.
 */
public class Adapter implements ComputerMediaPlayers{

    Player p;

    public Adapter(String filetype)
    {
        if(filetype.equalsIgnoreCase("vlc"))
        {
            p = new VLC();
        }
        else if(filetype.equalsIgnoreCase("avi"))
        {
            p = new AVI();
        }
    }

    @Override
    public void playMovie(String filetype, String movieName)
    {
        if(filetype.equalsIgnoreCase("vlc"))
        {
            p.vlc(movieName);
        }
        else if(filetype.equalsIgnoreCase("avi"))
        {
            p.avi(movieName);

        }
    }
}
