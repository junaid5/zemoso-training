package intro.assignment7;

interface Unicycles{
    public void uniInfo();
}

interface Bicycles{
    public void biInfo();
}

interface Tricycles{
    public void triInfo();
}

interface Cycles extends Unicycles,Bicycles,Tricycles{
    public void cycInfo();
}

class FactoryA implements Unicycles{

    @Override
    public void uniInfo() {
        System.out.println("this is unicycle");
    }
}

class FactoryB implements Bicycles{

    @Override
    public void biInfo() {
        System.out.println("this is bicycle");
    }
}

class FactoryC implements Tricycles{

    @Override
    public void triInfo() {
        System.out.println("this is tricycle");
    }
}

public class TaskFour {
    public static void main(String[] args) {
            FactoryA a = new FactoryA();
            a.uniInfo();
            FactoryB b = new FactoryB();
            b.biInfo();
            FactoryC c = new FactoryC();
            c.triInfo();
    }
}
