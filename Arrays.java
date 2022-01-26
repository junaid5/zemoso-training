package intro;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("enter the number");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.println(arr[i]*2);
        }
        ArrayList<Double> d=new ArrayList<>();
        while (true){
            System.out.println("enter the number");
            double dou=sc.nextDouble();
            d.add(dou);
            if(dou<0) break;
        }
        int size=d.size();
        for(int i=size-2;i>=0;i--) System.out.println(d.get(i));
    }
}
