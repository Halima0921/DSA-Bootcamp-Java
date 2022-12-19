// Easy
// Q : [Length of last word](https://leetcode.com/problems/length-of-last-word/)
class Solution {
    public int lengthOfLastWord(String s) {
         
         //Count the last word length
         int count = 0;
         
         //To Remove spaces from start and ends of the whole string
         s = s.trim();
         
         //From start we will start to read String
         int start = s.length() - 1;
         
         for(int i=start; i >= 0; i--){
             //Until we find space, we will iterate.
             if(s.charAt(i) == ' '){
                 break;
             }
             
             count++;
         }
         //This will be our answer
         return count;
     }
 }
 
 public String shiftingLetters(String S, int[] shifts) {
    StringBuilder ans = new StringBuilder();
    int X = 0;
    for (int shift: shifts)
        X = (X + shift) % 26;

    for (int i = 0; i < S.length(); ++i) {
        int index = S.charAt(i) - 'a';
        ans.append((char) ((index + X) % 26 + 97));
        X = Math.floorMod(X - shifts[i], 26);
    }

    return ans.toString();
}
}