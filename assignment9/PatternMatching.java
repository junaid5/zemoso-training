package intro.assignment9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give the input string");
        String input= sc.nextLine();
        Pattern p=Pattern.compile("[A-Z].+[.]");
        Matcher m=p.matcher(input);
        if(m.matches()){
            System.out.println("the input matches the pattern");
        }
        else {
            System.out.println("the input does not matches the pattern");
        }
    }
}
