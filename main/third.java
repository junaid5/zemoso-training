package junaid.assignmnet.main;

import junaid.assignmnet.data.First;
import junaid.assignmnet.singleton.Second;

public class third {
    public static void main(String[] args) {
        First f=new First();
        f.display();
        f.diplay2();
        Second obj=Second.ret("hello");
        obj.show();
    }
}
