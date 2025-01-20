package FactoryDP;

import DecoratorDP.*;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.createPizza(1);
        pizzaStore.createPizza(2);
        pizzaStore.createPizza(3);
    }
}