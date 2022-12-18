// 1-Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;
public class oddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int n = in.nextInt();
        if (n % 2 == 0) {
            System.out.println("its even ");
        } else {
            System.out.println("its odd");
        }
    }
}
