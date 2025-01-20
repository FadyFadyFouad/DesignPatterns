package TemplateDP;


import AdapterDP.Bike;
import AdapterDP.BikeToCarAdapter;
import AdapterDP.Car;
import AdapterDP.IVehicle;

public class Main {
    public static void main(String[] args) {
        BeverageTemplate beverage = new Coffee();
        beverage.brew();
        beverage = new Tea();
        beverage.brew();
    }
}