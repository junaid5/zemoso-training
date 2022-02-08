package intro.assignment7;

class Cycle{
    public void balance(){
        System.out.println("Cycle balance");
    };
};
class Unicycle extends Cycle{
    public void balance(){
        System.out.println("unicylce is hardest to balance ");
    }
};
class Bicycle extends Cycle{
    public void balance(){
        System.out.println("bicycle is easier to balance than unicycle ");
    }
};

class Tricycle extends Cycle{

}

public class CycleMain {
    public static void main(String[] args) {
        Cycle[] c=new Cycle[3];
        c[0]=new Bicycle();
        c[0].balance();
        c[1]=new Unicycle();
        c[1].balance();
        c[2]=new Tricycle();
        c[2].balance();
    }
}
