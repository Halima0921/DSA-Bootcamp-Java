
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // loops :
        // For loop syntax :
       /* for (initialize; condition; increase/decrement) {
              //body
        } */
        // Q: Print numbers from 1 to 5
       // for (int num = 1; num <= 5; num += 1) {
         // System.out.println(num);}

        //from user
     /*   Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int num = 1; num <= n; num += 1) {
            System.out.print(num + " ");
        }*/
        // print hello many times
       /* Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int num = 1; num <= n; num += 1) {
            System.out.println("hello");} */

        //  While loop syntax :
        // while (condition) {
        //  body }

       int i = 3;
       int total=0;
        while (i <= 20) {
            total=total+i;


            i += 1;
    }
        System.out.println(total);

// do while Loops
      // do {
        // } while (condition);

      /*  int n = 1;
        do {
            System.out.println(n);
            n++;
    } while (n<=5);   */



    }
}