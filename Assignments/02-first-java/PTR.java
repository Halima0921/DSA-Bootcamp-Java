// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;
public class PTR {
    public static void main(String[] args) {
        Scanner b = new Scanner( System.in);
        System.out.println("enter principal value : ");
        int P = b.nextInt();
        System.out.println("enter time : ");
        int T = b.nextInt();
        System.out.println("enter rate :");
        int R = b.nextInt();
        int result = P*R*T/100;
        System.out.println("RESULT IS " + result);
    }
}
