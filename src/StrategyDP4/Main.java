package StrategyDP4;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.addToCart(300);
        customer1.setPaymentMethod(new PayByVisa());
        customer1.payPlusDelivery();
        customer1.addToCart(2002.131);
        customer1.setPaymentMethod(new PayInCash());
        customer1.pay();
    }
}