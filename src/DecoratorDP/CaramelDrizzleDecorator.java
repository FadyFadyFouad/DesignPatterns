package DecoratorDP;

public class CaramelDrizzleDecorator implements IDecorator{
    IDecorator decorator;

    public CaramelDrizzleDecorator(IDecorator decorator){
        this.decorator = decorator;
    }

    @Override
    public double cost() {
        return 15 + this.decorator.cost();
    }
}
