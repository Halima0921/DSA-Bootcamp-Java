//

public class SmallestLetter {
     public static void main(String[] args) {
          //  char [] letters = {'b','f','d','a','s','n'};
         //   char target = 'f';
         //   char ans = smallestLetters(letters, target);
           // System.out.println(ans);
        }
        public char smallestLetters(char[] letters, char target) {
            int start = 0;
            int end = letters.length - 1;
            while (start <= end) {
                //find the middle element
                // int mid =(start + end)/2; //might be possible that (start + end) exceeds the range of int in java
                int mid = start + (end - start) / 2;
                if (target < letters[mid]) {
                    end = mid - 1;
                } else if (target > letters[mid]) {
                    start = mid + 1;
                }
            }

            return letters[start % letters.length];
        }
    }
