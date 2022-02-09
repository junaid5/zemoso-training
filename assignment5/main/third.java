package assignment5.main;


import assignment5.data.First;
import assignment5.singleton.*;
import assignment5.singleton.Second;

public class third {
    public static void main(String[] args) {
        First f=new First();
        f.display();
        f.diplay2();
        Second obj= Second.ret("hello");
        obj.show();
    }
}
