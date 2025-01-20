package AdapterDP;



public class Main {
    public static void main(String[] args) {
        IVehicle vehicle = new Car();
        vehicle.accelerate();
        vehicle.pressBrakes();
        vehicle.horn();
        vehicle = new BikeToCarAdapter(new Bike());
        vehicle.accelerate();
        vehicle.pressBrakes();
        vehicle.horn();
    }
}