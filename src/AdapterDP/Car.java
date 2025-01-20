package AdapterDP;

public class Car implements IVehicle{

    public void accelerate(){
        System.out.println("Car accelerating!\n");
    }

    public void pressBrakes(){
        System.out.println("Car braking!\n");
    }

    public void horn(){
        System.out.println("Car horn pressed!\n");
    }
}
