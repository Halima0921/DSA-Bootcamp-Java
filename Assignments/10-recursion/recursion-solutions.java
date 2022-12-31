## Easy
1- [Sum Triangle from Array](https://www.geeksforgeeks.org/sum-triangle-from-array/) `GFG`

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String[] args)
    {
        //input Array
        int[] x = { 1, 2, 3, 4, 5 };
        //Recursive function that will print answer
        printTriangle(x);
        System.out.println(Arrays.toString(x));
    }
    static void printTriangle(int[] x)
    {
        //base condition
        if (x.length == 1) {
            return;
        }
    /*temprory Array of input array in print(int[] arr) function
    for example arr = {1,2,3,4,5}
    then temp[] = {3,5,7,9} of size(arr.length-1)=4*/
        int[] temp = new int[x.length - 1];
        //Recursive function to fill elements in temp Array according to Que.
        helper(temp, x, 0);
        //Recursive call for print(int[] arr) function
        printTriangle(temp);
        //prints String format of temp Array//
        System.out.println(Arrays.toString(temp));
    }
    //Recursive function to fill elements in temp Array//
    static int[] helper(int[] temp, int[] x, int index)
    {
        //base condition//
        if (index == x.length - 1) {
            return temp;
        }
        temp[index] = x[index] + x[index + 1];
        //Recursive Call for helper() function//
        return helper(temp, x, index + 1);
    }
}

2-[Maximum and Minimum value in an array](https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/) `GFG`
import java.util.*;

class GFG {

    // function to return maximum element using recursion
    public static int findMaxRec(int A[], int n)
    {
        // if size = 0 means whole array
        // has been traversed
        if(n == 1)
            return A[0];

        return Math.max(A[n-1], findMaxRec(A, n-1));
    }

    // Driver code
    public static void main(String args[])
    {
        int A[] = {1, 4, 45, 6, -50, 10, 2};
        int n = A.length;

        // Function calling
        System.out.println(findMaxRec(A, n));
    }
}
- [Binary Search using recursion](https://leetcode.com/problems/binary-search/) `leetcode`
class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
         int start = 0; 
         int end = nums.length-1; 
         while(start <= end) {  
         int mid = start + (end - start) / 2;
          if (nums [mid] == target) {
               return mid;    
            } else if (nums [mid] > target) { 
                end = mid-1; 
                } else {
                     start = mid + 1;
        
    }
}
return -1 ;
    }
}

3- [Reverse String](https://leetcode.com/problems/reverse-string/) `leetcode`

class Solution {
    public void reverseString(char[] s) 
     {		
         int n = s.length;
         for(int i = 0; i<n/2; i++)
         {
             char x = s[i];
             s[i] = s[n-1-i];
             s[n-1-i] = x;
         }
 }
 }
4-[Write a recursive function that returns the factorial of a number.]
 
public class Fact {
    public static void main(String[] args) {
        int ans = fact(5);
        System.out.println(ans);
    }

    static int fact(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * fact(n-1);
    }
}

5- [Fibonacci Number](https://leetcode.com/problems/fibonacci-number/) `leetcode`

class Solution {
    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}

## Hard
1- Basic Calculator](https://leetcode.com/problems/basic-calculator/) `leetcode`

 public int calculate(String s) {
    Stack<Integer> stack = new Stack<>();
    int result = 0;
    int number = 0;
    int sign = 1;
    for (char c: s.toCharArray()) {
        if (Character.isDigit(c)) {
            number *= 10;
            number += c - '0';
        } else if (c == '+' || c == '-') {
            result += sign * number;
            number = 0;
            sign = c == '+' ? 1 : -1;
        } else if (c == '(') {
            stack.push(result);
            stack.push(sign);
            result = 0;
            sign = 1;
        } else if (c == ')') {
            result += sign * number;
            number = 0;
            result *= stack.pop();
            result += stack.pop();
        }
    }
    if (number != 0) {
        result += sign * number;
    }
    return result;
}
}