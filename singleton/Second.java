package junaid.assignmnet.singleton;

public class Second {
    String str;
    Second(String s){
        str=s;
    }
    public static SecondClass ret(String st){
        SecondClass obj=new SecondClass(st);
        return obj;
    }
    public void show(){
        System.out.println("string is:"+str);
    }
}
