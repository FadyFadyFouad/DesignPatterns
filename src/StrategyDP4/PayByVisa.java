package StrategyDP4;

public class PayByVisa implements IPayment{

    @Override
    public void pay(double amount) {
        System.out.println("Payed " + amount + " By Visa!");
    }
}
