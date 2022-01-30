package intro.assignment6;

public class TaskThree {
    TaskThree(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        TaskThree[] t=new TaskThree[5];
        t[0]=new TaskThree("hello");
    }
}
