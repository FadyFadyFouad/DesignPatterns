package DecoratorDP;

public class MilkDecorator implements IDecorator{
    IDecorator decorator;

    public MilkDecorator(IDecorator decorator){
        this.decorator = decorator;
    }

    @Override
    public double cost() {
        return 10 + this.decorator.cost();
    }
}
