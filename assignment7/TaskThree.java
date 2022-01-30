package intro.assignment7;

interface One{
    public void getOne();
    public void dispOne();
}
interface Two{
    public void getTwo();
    public void dispTwo();
}
interface Three{
    public void getThree();
    public void dispThree();

}
interface Four extends One,Two,Three{
    public void getFour();

}

class Concrete{
    public void info(){
        System.out.println("this is a concrete class");
    }
};
class Five extends Concrete  implements Four{
    public void getOne(){
        System.out.println("interface one get method");
    }
    public void dispOne(){
        System.out.println("interface one disp method");
    }
    public void getTwo(){
        System.out.println("interface two get method");
    }
    public void dispTwo(){
        System.out.println("interface two disp method");
    }
    public void getThree(){
        System.out.println("interface three get method");
    }
    public void dispThree(){
        System.out.println("interface three disp method");
    }
    public void getFour(){
        System.out.println("interface four get mehtod ");
    }
    public void method1(One o){
        o.dispOne();
    }
    public void method2(Two t){
        t.dispTwo();
    }
    public void method3(Three th){
        th.dispThree();
    }
};


public class TaskThree {

    public static void main(String[] args) {
        Five obj=new Five();
        obj.method1(new Five());
        obj.method2(new Five());
        obj.method3(new Five());
    }
}
