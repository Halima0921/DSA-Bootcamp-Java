import java.util.Scanner;

public class inputArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 25;
        arr[2] = 243;
        arr[3] = 1;
        arr[4] = 103;
        System.out.println(arr[3]);

        //input using for loops
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
   //     for (int i = 0; i < arr.length; i++) {
   //         System.out.print(arr[i] + " ");
   //     }
       // another way to print output
        for (int num : arr){ // for every element in array , print the element
            System.out.print(num + " "); // here num represents element of the array

        }
    }
}