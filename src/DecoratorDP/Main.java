package DecoratorDP;

import StrategyDP.Customer;
import StrategyDP.PayByVisa;
import StrategyDP.PayInCash;

public class Main {
    public static void main(String[] args) {
        IDecorator drink1 = new Esspresso();
        System.out.println("Total Cost = " + drink1.cost());
        drink1 = new MilkDecorator(drink1);
        System.out.println("Total Cost = " + drink1.cost());
        drink1 = new CaramelDrizzleDecorator(drink1);
        System.out.println("Total Cost = " + drink1.cost());
        drink1 = new WhippedCreamDecorator(drink1);
        System.out.println("Total Cost = " + drink1.cost());

        IDecorator drink2 = new Latte();
        System.out.println("Total Cost = " + drink2.cost());
        drink2 = new MilkDecorator(drink2);
        System.out.println("Total Cost = " + drink2.cost());
        drink2 = new CaramelDrizzleDecorator(drink2);
        System.out.println("Total Cost = " + drink2.cost());
        drink2 = new WhippedCreamDecorator(drink2);
        System.out.println("Total Cost = " + drink2.cost());
    }
}