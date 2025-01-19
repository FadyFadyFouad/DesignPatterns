package StrategyDP4;

public class PayInCash implements IPayment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " In Cash!");
    }
}
