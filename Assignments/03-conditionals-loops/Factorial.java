// Factorial Program

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out .println("enter a number");
        int number= in.nextInt();
        int i;
        int fact=1;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
