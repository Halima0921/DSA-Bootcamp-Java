// Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class greetingMessage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name :");
        String name = input.next();
        System.out.println("nice to meet you " + name);


        //--Question Three
        Scanner b = new Scanner(System.in);
        System.out.println("enter principal value : ");
        int P = b.nextInt();
        System.out.println("enter time : ");
        int T = b.nextInt();
        System.out.println("enter rate :");
        int R = b.nextInt();
        int result = P * R * T / 100;
        System.out.println("RESULT IS " + result);
    }
}
