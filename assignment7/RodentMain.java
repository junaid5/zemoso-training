package intro.assignment7;

abstract class Rodent{
    Rodent(){
        System.out.println("This is Rodent class");
    }
    public abstract void info();
    public abstract void show();
};

;

class Gerbil extends Rodent{
    Gerbil(){
        System.out.println("this is Gerbil class");
    }
    @Override
    public void info() {
        System.out.println("Gerbil body size is 110-150mm");
    }

    @Override
    public void show() {
        System.out.println("this is Gerbil ");
    }
};

class Hamster extends Rodent{
    Hamster(){
        System.out.println("this is Hamster class");
    }

    @Override
    public void info() {
        System.out.println("Hamster eyesight is poor");
    }

    @Override
    public void show() {
        System.out.println("this is Hamster");
    }
};

public class RodentMain {
    public static void main(String[] args) {
        Rodent[] r=new Rodent[3];
        r[0]=new Mouse();
        r[0].info();
        r[0].show();
        r[1]=new Gerbil();
        r[1].show();
        r[1].info();
        r[2]=new Hamster();
        r[2].show();
        r[2].info();
    }

}
