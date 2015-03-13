package za.ac.cput.Chapter5.Structural.AdapterPattern;

/**
 * Created by student on 2015/03/13.
 */
public class MoviePlayer implements ComputerMediaPlayers {

    Adapter cmp;

    @Override
    public void playMovie(String filetype, String movieName)
    {
      if(filetype.equalsIgnoreCase("mp3"))
      {
          System.out.println("Playing " + movieName + " with an mp3 format");
      }
        else if(filetype.equalsIgnoreCase("vlc") || filetype.equalsIgnoreCase("avi")) {
            cmp = new Adapter(filetype);
          cmp.playMovie(filetype, movieName);
        }
        else {

          System.out.println("Invalid media " + filetype + " not supported");
      }
    }
}
