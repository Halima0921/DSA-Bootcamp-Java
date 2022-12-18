// Q: Find the largest of the 3 numbers

import java.util.Scanner;
public class Largest3Number {
     public static void main(String[] args) {
         System.out.println(" please enter 3 numbers to get the largest one ");
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int max = a;
            if (b > max) {
                max = b;
            }
            if (c > max) {
                max = c;
            } System.out.println(max);
        }
    }
