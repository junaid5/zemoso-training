package intro;

public class ArithmeticFun {
    public static void main(String[] args) {
        int a=6;
        int b=7;
        int result=a+b;
        int mul=a*b;
        int div=a/b;
        int mod=a%b;
        System.out.println("addition is "+result);
        System.out.println("multiplication is "+mul);
        System.out.println("division is "+div);
        System.out.println("modulus is "+mod);
        result++;
        System.out.println(result);
        result+=result;
        System.out.println(result);
        mul*=2;
        System.out.println(mul);
    }
}
