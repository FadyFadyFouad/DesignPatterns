package DecoratorDP;

public class Latte implements IDecorator{

    public Latte(){
    }

    @Override
    public double cost() {
        return 60;
    }
}
