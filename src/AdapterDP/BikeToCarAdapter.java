package AdapterDP;

public class BikeToCarAdapter implements IVehicle {
    Bike bike;

    public BikeToCarAdapter(Bike bike){
        this.bike = bike;
    }

    @Override
    public void accelerate() {
        bike.pedal();
    }

    @Override
    public void pressBrakes() {
        bike.pullBreaks();
    }

    @Override
    public void horn() {
        bike.ringBell();
    }
}
