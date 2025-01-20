package TemplateDP;

public abstract class BeverageTemplate {

    public final void brew(){
        getCleanCup();
        boilWater();
        addPowder();
        pourWater();
        presentDrink();
    }

    public final void getCleanCup(){
        System.out.println("Beverage Template: Get Clean Cup\n");
    }

    public final void boilWater(){
        System.out.println("Beverage Template: Boil Water\n");
    }

    public abstract void addPowder();
    public final void pourWater(){
        System.out.println("Beverage Template: Pour Water\n");
    }
    public abstract void presentDrink();
}
