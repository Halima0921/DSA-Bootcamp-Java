// Q 1 : Write a program to print whether a number is even or odd, also take input from the user.

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

// Q 2 : Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class greetingMessage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name :");
        String name = input.next();
        System.out.println("nice to meet you " + name);


        //--Question Three
        Scanner b = new Scanner(System.in);
        System.out.println("enter principal value : ");
        int P = b.nextInt();
        System.out.println("enter time : ");
        int T = b.nextInt();
        System.out.println("enter rate :");
        int R = b.nextInt();
        int result = P * R * T / 100;
        System.out.println("RESULT IS " + result);
    }
}

// Q 3 :  Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

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

// Q 4 :Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        System.out.print("Enter the operator: ");
        char op = in.next().trim().charAt(0);
        if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
            System.out.print("Enter two numbers: ");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            if (op == '+') {
                ans = num1 + num2;
            }
            if (op == '-') {
                ans = num1 - num2;
            }
            if (op == '*') {
                ans = num1 * num2;
            }
            if (op == '/') {
                if (num2 != 0) {
                    ans = num1 / num2;
                }
            }
            if (op == '%') {
                ans = num1 % num2;
            }
        }else if (op == 'x' || op == 'X') {
        }else {
            System.out.println("Invalid operation!!");
        }
        System.out.println(ans);

    }
}

// Q 5 : Take 2 numbers as input and print the largest number.

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


// Q 6 : Input currency in rupees and output in USD.
        Float rupees;
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter rupees:");
        rupees = inp.nextLong();
        float dollars = rupees / 64;
        System.out.println(dollars + " Dollars");

// Q 7 : To calculate Fibonacci Series up to n numbers.
public class Fibonacci {
    public static void main(String[] args) {

        int n = 10, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
// Q 8 : To find out whether the given String is Palindrome or not.

public class Palindrome {
    public static void main(String[] args) {
        String str = "new", reverseStr = "";// here write any string word that you want to see
        int strLength = str.length();
        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }
        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }

    }

}

// Q 9 : To find Armstrong Number between two given number.
import java.util.Scanner;

public class hu {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ::");
        num1 = sc.nextInt();
        System.out.println("Enter the second number ::");
        num2 = sc.nextInt();
        for (int i = num1; i < num2; i++) {
            int check, rem, sum = 0;
            check = i;
            while (check != 0) {
                rem = check % 10;
                sum = sum + (rem * rem * rem);
                check = check / 10;
            }
            if (sum == i) {
                System.out.println("" + i + " is an Armstrong number.");
            }
        }
    }
}



