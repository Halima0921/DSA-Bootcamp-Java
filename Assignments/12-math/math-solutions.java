## Easy

1- [Roman to Integer.](https://leetcode.com/problems/roman-to-integer/)

 public int romanToInt(String s) {
     
    int current = 0;
    int ans = 0;
    int previous = 0;
    //Read from Right to Left
    for (int i = s.length() - 1; i >= 0; i--) {
        switch(s.charAt(i)){
            case 'I':
                current = 1;
                break;
            case 'V':
                current = 5;
                break;
            case 'X':
                current = 10;
                break;
            case 'L':
                current = 50;
                break;
            case 'C':
                current = 100;
                break;
            case 'D':
                current = 500;
                break;
            case 'M':
                current = 1000;
                break;
        }
        // Here is the condition
        if ( previous > current) {
            ans -= current;
        }else{
            ans += current;
            previous = current;
        }
       
    }
    return ans;
}

}

2- [Power of Four](https://leetcode.com/problems/power-of-four/)


class Solution {
    public boolean isPowerOfFour(int n) {
         if (n == 0) return false;
        
         while (n % 4 == 0) n /= 4;
         
         if(n==1) return true;
         else return false;
        
  
        
    }
}

3- [Maximum Product of Three Numbers](https://leetcode.com/problems/maximum-product-of-three-numbers/)

class Solution {
public int maximumProduct(int[] nums) {
    final int n = nums.length;
    Arrays.sort(nums);
    return Math.max(nums[n - 1] * nums[0] * nums[1], nums[n - 1] * nums[n - 2] * nums[n - 3]);
  }
}


4- [Add Binary](https://leetcode.com/problems/add-binary/)

class Solution {
    public String addBinary(String a, String b) {
     
         StringBuilder result = new StringBuilder();
         
         int aLength = a.length() - 1;
         int bLength = b.length() - 1;
         
         int carry = 0;
         
         while(aLength >= 0 || bLength >= 0){
             
             int sum = carry;
             
             if(aLength >= 0) {
                 sum += (a.charAt(aLength--) - '0');        
             }
             
             if(bLength >= 0) {
                 sum += (b.charAt(bLength--) - '0');
             }
             
             result.insert(0, sum%2);
             
             carry = (sum / 2);
         }
         
         if (carry > 0) {
             result.insert(0, 1);
         }
         
          return result.toString();
     }
 }

## Hard

1- [Basic Calculator](https://leetcode.com/problems/basic-calculator/)

class Solution {
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




