// Q 1 :

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

// Q 2 : 

import java.util.Scanner;
public class evenOdd {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if (num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");

    }
}

// Q 3 : 

import java.util.Scanner;
public class eligible {
    public static void main(String[] args) {
        int age, diff;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        age = scan.nextInt();
        if(age>=18)
        {
            System.out.println("You are eligible for voting.");
        }
        else
        {
            diff = (18 - age);
            System.out.println("Sorry,You can vote after: "+ diff + " years");
        }
    }
}

// Q 4 :

import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Input the first number: ");
        int num1 = input.nextInt();
        System.out.print("Input the second number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println();
        System.out.println("Sum: "+sum);

    }
}

// Q 5 :


import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
    }
}

// Q 6 :

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


// Q 7 :
import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPrime(n));
    }
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return  c * c > n ;
    }
}

// Q 8 :


import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        int count, i;
        float totalMarks = 0, percentage, average;
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Enter Number of Subject");
        count = scanner.nextInt();

        System.out.println("Enter Marks of " + count + " Subject");
        for (i = 0; i < count; i++) {
            totalMarks += scanner.nextInt();
        }
        System.out.println("Total MArks : " + totalMarks);
                percentage = (totalMarks / (count * 100)) * 100;

        /* Printing grade of a student using switch case statement */
        switch ((int) percentage / 10) {
            case 9:
                System.out.println("Grade : A+");
                break;
            case 8:
            case 7:
                System.out.println("Grade : A");
                break;
            case 6:
                System.out.println("Grade : B");
                break;
            case 5:
                System.out.println("Grade : C");
                break;
            default:
                System.out.println("Grade : D");
                break;
        }


    }
}

// Q 9 :

public class factorial {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String args[]) {
        int fact = 1;
        int number = 4;//It is the number to calculate factorial
        fact = factorial(number);
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}

// Q 10 : 

import java.util.Scanner;


public class palindrome {
    public static void main(String[] args) {
        int x, number, y = 0, temp = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number: ");
        number = s.nextInt();
        x = number;
        while (number > 0) {
            x = number % 10;
            number = number / 10;
            temp = temp * 10 + x;
        }
        if (temp == y) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("not Palindrome");
        }
    }
}

// Q 12 :

public class PythagoreanTriplet {
    public static void main(String[] args) {
        int ar[] = {3, 1, 4, 6, 5};
        int ar_size = ar.length;
        if (isTriplet(ar, ar_size) == true)
            System.out.println("Yes");
        else
            System.out.println("No");


    }

    static boolean isTriplet(int ar[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int x = ar[i] * ar[i], y = ar[j] * ar[j], z = ar[k] * ar[k];

                    if (x == y + z || y == x + z || z == x + y)
                        return true;
                }
            }
        }

        return false;
    }


    }

    // Q 13:
    
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, i, j, flag;

        System.out.printf("Enter lower bound of the interval: ");
        a = sc.nextInt(); // Take input

        System.out.printf("\nEnter upper bound of the interval: ");
        b = sc.nextInt(); // Take input

        System.out.printf("\nPrime numbers between %d and %d are: ", a, b);

        for (i = a; i <= b; i++) {

            if (i == 1 || i == 0)
                continue;
                    flag = 1;
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }


            if (flag == 1)
                System.out.println(i);
        }
    }
}

// Q 14 :

import java.util.Scanner;
public class sumFunctions {
    public static void main(String[] args) {

        sum();
    }
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number1 : ");
        int num1= in.nextInt();
        System.out.print("Enter number1 : ");
        int num2= in.nextInt();
        int sum = num1 + num2 ;
        System.out.println("The sum=" + sum);


    }

}

