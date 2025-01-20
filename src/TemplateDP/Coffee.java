package TemplateDP;

public class Coffee extends BeverageTemplate{
    @Override
    public void addPowder() {
        System.out.println("Coffee: add powder\n");
    }

    @Override
    public void presentDrink() {
        System.out.println("Coffee: present Drink\n");
    }
}
