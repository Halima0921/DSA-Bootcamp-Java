// Q 1 : Area Of Circle Java Program. 

import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        //--Question 1(Area Of Circle Java Program)

        Scanner s= new Scanner(System.in);
        System.out.println("Enter the radius:");
        double r= s.nextDouble();
        double  area=(22*r*r)/7 ;
        System.out.println("Area of Circle is: " + area);
    }
}

// Q 2 : Area Of Triangle.


import java.util.Scanner;
public class traingle {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the width of the Triangle:");
        double w= s.nextDouble();
        System.out.println("Enter the height of the Triangle:");
        double h= s.nextDouble();
        //Area = (width*height)/2
        double area=(w*h)/2;
        System.out.println("Area of Triangle is: " + area);
    }
}

// Q 3 : Area Of Rectangle Program .

import java.util.Scanner;
public class rectangular {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of Rectangle:");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of Rectangle:");
        double width = scanner.nextDouble();
        //Area = length*width;
        double area = length*width;
        System.out.println("Area of Rectangle is:"+area);
    }
}

// Q 4 : Area Of Equilateral Triangle.
import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        double side, area;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Enter Length of Side of an Equilateral Triangle");
        side = scanner.nextDouble();
        area = Math.sqrt(3) / 4 * side * side;
        System.out.format("The Area of Equilateral Triangle = %.3f \n", area);
    }
}

// Q 5 : Perimeter Of Circle.

import java.util.Scanner;
public class PerimeterOfCircle {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        System.out.println("Enter the radius:");
        double r= s.nextDouble();
        double  p=(22*2*r)/7 ;
        System.out.println("Perimeter of Circle is: " +p);

    }
}

// Q 6 : Calculate Average Of N Numbers
public class averageMarks {
    public static void main(String[] args) {
        int n = 5, avg = 0;
        int a[] = new int[n];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;
        for (int i = 0; i < n; i++) {
            avg = avg + a[i];
            System.out.println("average of  (" + a[0] + "," + a[1] + "," + a[2] + "," + a[3] + "," + a[4] + ")  is =" + avg / n);
        }
    }
}

// Q 7 : Calculate Distance Between Two Points 

import java.util.Scanner ;
public class distance {
    public static void main(String[] args) {

        int x1,x2,y1,y2;
        double distance;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x1 point");
        x1=sc.nextInt();
        System.out.println("enter y1 point");
        y1=sc.nextInt();
        System.out.println("enter x2point");
        x2=sc.nextInt();
        System.out.println("enter y2 point");
        y2=sc.nextInt();
        distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("distance between"+"("+x1+","+y1+"),"+"("+x2+","+y2+") is = "+distance);
    }

}

// Q 8 : Armstrong Number In Java

public class Armstrong {
  public static void main(String[] args) {


    int number = 371, originalNumber, remainder, result = 0;
    originalNumber = number;
    while (originalNumber != 0) {
    remainder = originalNumber % 10;
    result += Math.pow(remainder, 3);
    originalNumber /= 10;
}
    if(result == number)
    System.out.println(number + " is an Armstrong number.");
else
    System.out.println(number + " is not an Armstrong number.");

  }
}

//  Q 9 : HCF Of Two Numbers Program

import java.util.Scanner;
public class HCF {
        public static void main(String args[]){
            int a, b, i, hcf = 0;
            Scanner hc = new Scanner(System.in);
            System.out.println("Enter first number :: ");
            a = hc.nextInt();
            System.out.println("Enter second number :: ");
            b = hc.nextInt();

            for(i = 1; i <= a || i <= b; i++) {
                if( a%i == 0 && b%i == 0 )
                    hcf = i;
            }
            System.out.println("HCF of given two numbers is ::"+hcf);
        }
    }

    // Q 10 : LCM Of Two Numbers

    class LCM {
        public static void main(String[] args) {
            int a = 12, b = 9, gcd = 1;
            for(int i = 1; i <= a && i <= b; ++i) {
                if(a % i == 0 && b % i == 0)
                    gcd = i;
            }
            int lcm = (a * b) / gcd;
            System.out.printf("The LCM of %d and %d is %d.", a, b, lcm);
    
        }
    }
// Q 11 : Reverse A String In Java
import java.util.Scanner;
class REVERSE {
    public static void main(String[] args) {
    

String initial, rev="";
Scanner in=new Scanner(System.in);
System.out.println("Enter the string to reverse");
initial=in.nextLine();
int length=initial.length();
for(int i=length-1;i>=0;i--)
    rev=rev+initial.charAt(i);
System.out.println("Reversed string: "+rev);
    }
}

// Q 12 : Find if a number is palindrome or not 
public class palindrome {
    public static void main(String[] args) {
        
       int r,sum=0,temp;
       int n=450;//It is the number variable to be checked for palindrome

       temp=n;
       while(n>0){
           r=n%10;  //getting remainder
           sum=(sum*10)+r;
           n=n/10;
       }
       if(temp==sum)
           System.out.println("is palindrome number ");
       else
           System.out.println("is not palindrome");

    }
}

// Q 13 : Factorial Program In Java 

import java.util.Scanner;
public class factorial {

   public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      System.out .println("enter a number");
      int number= in.nextInt();
      int i;
      int fact=1;
      for(i=1;i<=number;i++){
          fact=fact*i;
    }
       System.out.println("Factorial of "+number+" is: "+fact);
}
}
