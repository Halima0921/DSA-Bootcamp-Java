## Easy

1- [Remove All Adjacent Duplicates In String](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/) `leetcode`
 
class Solution {

public String removeDuplicates(String s) {
        //It keeps all the elements in the stack
        Stack<Character> stack = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            
            char c = s.charAt(i);
            
            //If the top of the stack is equal to the current character we pop that element from the stack.
            if(!stack.isEmpty() && stack.peek()==c){
                stack.pop();
            }
            //else we add that character into the stack
            else{
                stack.add(c);
            }
            
        }
        //We will store the characters in an stringbuilder.
        StringBuilder sb = new StringBuilder("");
        
        
        while(!stack.isEmpty()){
            sb.append(stack.pop());
            
        }
               
        
        String x = String.valueOf(sb);        
        
        //as we get the reverse output from the stack , 
        return reverse(x);
    }
    
    
    //Reverse a string 
    private String reverse(String s){
        
        char[] ar = s.toCharArray();
        
        int left = 0;
        int right = ar.length-1;
        
        while(left<right){
            
            char c = ar[right];
            ar[right] = ar[left];
            ar[left] = c;
            
            left++;
            right--;            
            
        }     
        
        return new String(ar);
          
    }
     }
    
}
## Medium
1- [132 Pattern](https://leetcode.com/problems/132-pattern/) `leetcode`

class Solution {
    public boolean find132pattern(int[] nums) {
    Deque<Integer> stack = new ArrayDeque<>(); // Max stack
    int ak = Integer.MIN_VALUE;                // We want to find a seq ai < ak < aj

    for (int i = nums.length - 1; i >= 0; --i) {
      if (nums[i] < ak) // Ai < ak, we're done because ai must also smaller than aj
        return true;
      while (!stack.isEmpty() && stack.peek() < nums[i])
        ak = stack.pop();
      stack.push(nums[i]); // nums[i] is a candidate of aj
    }

    return false;
  }
}
