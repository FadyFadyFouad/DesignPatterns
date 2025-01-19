package StrategyDP4;

public class PayByFawry implements IPayment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " By Fawry!");
    }
}
