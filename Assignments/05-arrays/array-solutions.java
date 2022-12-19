// Easy
// Q : [Build Array from Permutation](https://leetcode.com/problems/build-array-from-permutation/)

class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            nums[i] *= n;
        }
        for(int i=0;i<n;i++){
            nums[i] += nums[nums[i]/n]/n;
        }
        for(int i=0;i<n;i++){
            nums[i] %= n;
        }
        return nums;
    }
}

// Q : [Transpose Matrix](https://leetcode.com/problems/transpose-matrix/)

class Solution {
    public int[][] transpose(int[][] A) {
        int R = A.length, C = A[0].length;
        int[][] ans = new int[C][R];
        for (int r = 0; r < R; ++r)
            for (int c = 0; c < C; ++c) {
                ans[c][r] = A[r][c];
            }
        return ans;
    }
}


// Q : [Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/)
class Solution {
    public int[] shuffle(int[] nums, int n) {
         int[] res = new int[2 * n];
         for (int i = 0, j = n, idx = 0; idx < res.length; i++, j++) {
             res[idx++] = nums[i];
             res[idx++] = nums[j];
         } 
         return res;
     }
 }
 
// medium
// Q : 1 [Spiral Matrix](https://leetcode.com/problems/spiral-matrix/)
class Solution {
    public int[] shuffle(int[] nums, int n) {
         int[] res = new int[2 * n];
         for (int i = 0, j = n, idx = 0; idx < res.length; i++, j++) {
             res[idx++] = nums[i];
             res[idx++] = nums[j];
         } 
         return res;
     }
 }

 // Hard
 // Q : [First Missing Positive](https://leetcode.com/problems/first-missing-positive/)
 class Solution {
    public static int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }

        // case 2
        return arr.length + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
}
}


