package TemplateDP;

public class Tea extends BeverageTemplate{
    @Override
    public void addPowder() {
        System.out.println("Tea: add powder\n");
    }

    @Override
    public void presentDrink() {
        System.out.println("Tea: present drink\n");
    }
}
