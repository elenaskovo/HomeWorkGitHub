package class5;
import java.util.Scanner;
public class E2If {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //print the
        System.out.println("i it time for break true/false");
        //boolean inBreak=>
        boolean isBreak=input.nextBoolean();
        //if(inBreak)
        if (isBreak) { //true/false
            System.out.println("Break");
        }else {
            System.out.println("study");
        }


    }
}
