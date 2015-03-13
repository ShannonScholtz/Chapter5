package za.ac.cput.Chapter5.Structural.Decorator;

/**
 * Created by student on 2015/03/12.
 */
public class CarModelDecorator extends TrackCarDecorator{

    public CarModelDecorator(TrackCars track) {
        super(track);
    }

    @Override
    public void racing() {
        track.racing();
        VWModel();
    }

    public void VWModel() {
        System.out.println("Golf 7r");
    }

}
