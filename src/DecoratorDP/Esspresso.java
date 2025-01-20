package DecoratorDP;

public class Esspresso implements IDecorator{
    public Esspresso(){

    }

    @Override
    public double cost(){
        return 50;
    }
}
