import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //   int[][] arr2D = {
        //           {1, 2, 3,},
        //          {4, 5, 6},
        //         {7, 8, 9}
        //  };
        int[][] arr = new int[3][3];
        System.out.println(arr.length);
        // input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
            }
        }
}
