package templateMethod;

public class Tea extends Beverage{
    protected void brew() {
        System.out.println("Заваривание чая...");
    }

    protected void addCondiments() {
        System.out.println("Добавление лимона...");
    }
}
