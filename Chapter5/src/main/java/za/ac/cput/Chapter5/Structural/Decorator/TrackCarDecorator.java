package za.ac.cput.Chapter5.Structural.Decorator;

/**
 * Created by student on 2015/03/12.
 */
public abstract class TrackCarDecorator implements  TrackCars{

    TrackCars track;
    public TrackCarDecorator(TrackCars track) {
        this.track = track;
    }
}
