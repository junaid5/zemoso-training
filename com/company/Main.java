package com.company;

public class Main {

        interface Greeting{
            public String sayHello(String g);
        }
        public void hello(String s,Greeting g){
            String result=g.sayHello(s);
            System.out.println(result);
        }
//()->output
        public static void main(String[] args) {
            Greeting gs=(String s)-> "hello ,"+s;
            new Main().hello("junaid",gs);
            new Main().hello("khan",(String s)-> "hello ,"+s);
            new Main().hello("",(String s)-> s.isEmpty()?"not found":"hello "+s);
        }

}
