// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;
public class eligible {
    public static void main(String[] args) {
        int age, diff;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        age = scan.nextInt();
        if(age>=18)
        {
            System.out.println("You are eligible for voting.");
        }
        else
        {
            diff = (18 - age);
            System.out.println("Sorry,You can vote after: "+ diff + " years");
        }
    }
}
