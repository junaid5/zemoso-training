package intro.assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class AssignmentTwo {
    public static void main(String[] args) {
        int res=0;
        int[] stdArray=new int[26];
        Arrays.fill(stdArray,1);
        int[] inputArray=new int[26];
        String inputString;
        Scanner sc=new Scanner(System.in);
        System.out.println("Give the input string ");
        inputString=sc.nextLine();
        for(char c:inputString.toCharArray()){
            inputArray[c-'a']++;
        }
        for(int i=0;i<=25;i++){
            if(inputArray[i]==stdArray[i]) res++;
        }
        if(res==26) System.out.println("The input string contains all the letters of the alphabet[a-z]");
        else System.out.println("The input string do not contain all the letters of the alphabet[a-z]");
    }
}

//Time complexity: O(N)
//Space complexity: O(1)