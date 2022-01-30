package intro.assignment5.main;

import junaid.assignmnet.data.FirstClass;
import junaid.assignmnet.singleton.SecondClass;

public class third {
    public static void main(String[] args) {
        FirstClass f=new FirstClass();
        f.display();
        f.diplay2();
        SecondClass obj= SecondClass.ret("hello");
        obj.show();
    }
}
