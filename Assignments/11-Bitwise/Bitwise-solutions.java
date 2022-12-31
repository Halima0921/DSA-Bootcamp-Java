## Easy

1- [Add Binary](https://leetcode.com/problems/add-binary/)

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

2 - [Reverse Bits](https://leetcode.com/problems/reverse-bits/)

public int reverseBits(int n) {
    int result = 0;
    int mask = 1;
    for (int i = 0; i < 32; i ++) {
        int digit = n & mask;
        result = (result << 1);
        if (digit != 0) {
             result = result + 1;
        }
        mask = (mask << 1);
    }
    return result;
}
}
class Solution {
    public int singleNumber(int[] nums) {
        int sum = nums[0];
        for(int i=1; i< nums.length; i++){
            sum = sum ^ nums[i];
        }
        return sum;
    }
        
    }

    4 - [Prime Number of Set Bits in Binary Representation](https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/)

    class Solution {
        public int countPrimeSetBits(int L, int R) {
        final int magic = 665772;
        int ans = 0;
        for (int n = L; n <= R; ++n)
          if ((magic & 1 << Integer.bitCount(n)) > 0)
            ++ans;
    
        return ans;
      }
    }