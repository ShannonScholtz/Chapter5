package za.ac.cput.Chapter5.Structural.Decorator;

/**
 * Created by student on 2015/03/12.
 */
public class SponsorDecorator extends TrackCarDecorator{

    public SponsorDecorator(TrackCars track) {
        super(track);
    }

    @Override
    public void racing() {
        track.racing();
        Spons();
    }

    public void Spons() {
        System.out.println("Money for car parts");
    }
}
