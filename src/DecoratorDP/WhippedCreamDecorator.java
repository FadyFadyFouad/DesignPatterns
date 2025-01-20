package DecoratorDP;

public class WhippedCreamDecorator implements IDecorator{
    IDecorator decorator;

    public WhippedCreamDecorator(IDecorator decorator){
        this.decorator = decorator;
    }

    @Override
    public double cost() {
        return 20 + this.decorator.cost();
    }
}
