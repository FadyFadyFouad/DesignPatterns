package FactoryDP;

public class PizzaFactory {

    public Pizza createPizza(int x){
        if(x==1){
            return new MargeritaPizza();
        } else if (x==2) {
            return new ChickenBBQPizza();
        } else if (x==3) {
            return new PepperoniPizza();
        }
        return null;
    }
}
