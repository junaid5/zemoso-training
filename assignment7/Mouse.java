package intro.assignment7;

public class Mouse extends Rodent {
    Mouse() {
        System.out.println("this is Mouse class");
    }

    @Override
    public void info() {
        System.out.println("mouse is found in common households");
    }

    @Override
    public void show() {
        System.out.println("this is mouse ");
    }

}
