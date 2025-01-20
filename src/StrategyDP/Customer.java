package StrategyDP;

public class Customer {
    IPayment paymentMethod;
    double total;
    public void addToCart(double itemPrice){
        this.total+=itemPrice;
    }

    public void removeFromCart(double itemPrice){
        this.total-=itemPrice;
    }

    public void setPaymentMethod(IPayment paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public IPayment getPaymentMethod(){
        return this.paymentMethod;
    }

    public void pay(){
        this.paymentMethod.pay(this.total);
        total = 0;
    }

    public void payPlusDelivery(){
        this.paymentMethod.pay(this.total + 10);
        total = 0;
    }
}
