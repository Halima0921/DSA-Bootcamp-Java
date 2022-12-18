// Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

import java.util.Scanner;
public class circumference {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2=sc.nextInt();
        sc.close();//closing the scanner class
        calcProduct(num1,num2); //calling the method
    }
    public static void calcProduct(int x,int y){
        int result=0;
        result=x*y;
        System.out.println("product of two numbers  "+result);
    }
}
