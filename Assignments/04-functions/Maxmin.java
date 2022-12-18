
import java.util.Scanner;
public class Maxmin {
    public static void main(String[] args) {
        System.out.println("enter 3 numbres to get maximum number and minimum ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int maximum = max(a, b, c);
        int minimum = min(a, b, c);
        System.out.println("maximum = " + maximum);
        System.out.print("minimum = " + minimum);

    }

    static int max(int a, int b, int c) {
        int maxi = a;
        if (b > maxi) {
            maxi = b;
        }
        if (c > maxi) {
            maxi = c;
        }
        return maxi;

    }

    static int min(int a, int b, int c) {

        int mini = a;
        if (b < mini) {
            mini = b;
        }
        if (c < mini) {
            mini = c;
        }
        return mini;
    }
}