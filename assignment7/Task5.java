package intro.assignment7;

public class Task5 {
    class OuterClassOne {

        class InnerClassOne {
            InnerClassOne(int a) {
                System.out.println(a);
            }
        }


    }



    class OuterClassTwo extends OuterClassOne {

        class InnerClassTwo {
            InnerClassTwo() {
                System.out.println("inner class two");
            }
        }


    }



}
