package FactoryDP;

public class PizzaStore {
    PizzaFactory pizzaFactory;

    public PizzaStore(){
        this.pizzaFactory = new PizzaFactory();
    }

    public Pizza createPizza(int x){
        return pizzaFactory.createPizza(x);
    }
}
