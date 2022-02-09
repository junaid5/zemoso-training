package assignment5.singleton;


public class Second {
    String str;
    Second(String s){
        str=s;
    }
    public static Second ret(String st){
        Second obj=new Second(st);
        return obj;
    }
    public void show(){
        System.out.println("string is:"+str);
    }
}
