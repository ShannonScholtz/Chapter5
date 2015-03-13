package za.ac.cput.Chapter5.Structural.Decorator;

/**
 * Created by student on 2015/03/12.
 */
public class WheelDecorator extends TrackCarDecorator{

    public WheelDecorator(TrackCars track) {
        super(track);
    }

    @Override
    public void racing() {
        track.racing();
        wheel();
    }

    public void wheel() {
        System.out.println("Screech on take off");
    }
}
