// Easy
 // Q : [Search Insert Position](https://leetcode.com/problems/search-insert-position/)

class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        int start = 0;
        int end = nums.length -1;
        while(start <= end)
        {
            int mid = start + (end - start )/2;
            if(nums[mid] == target )
                return mid;
            else if(nums[mid] < target)
                start = mid+1;
            else 
                end = end-1;
        }
        return start ;
    }
}

// Q : Find Smallest Letter Greater Than Target](https://leetcode.com/problems/find-smallest-letter-greater-than-target/)
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
         boolean[] seen = new boolean[26];
         for (char c: letters)
             seen[c - 'a'] = true;
 
         while (true) {
             target++;
             if (target > 'z') target = 'a';
             if (seen[target - 'a']) return target;
         }
     }
 }

// Hard
// Q : [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/)


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums2.length < nums1.length)
            return findMedianSortedArrays(nums2, nums1);
        return helper(nums1, 0, nums1.length, nums2);
    }
    private double helper(int[] nums1, int l, int h, int[] nums2){
        while(l <= h){
            int m1 = l+(h-l)/2;                                                     
            int m2 = (nums2.length+nums1.length+1)/2-m1;                            
            if(m1 > 0 && m2 < nums2.length && nums1[m1-1] > nums2[m2])           
                h = m1-1;
            else if(m2 > 0 && m1 < nums1.length && nums2[m2-1] > nums1[m1])
                l = m1+1;
            else{
                int total = nums1.length+nums2.length;
                int maxLeft = -Integer.MAX_VALUE;
                if(m1 > 0)
                    maxLeft = Math.max(maxLeft, nums1[m1-1]);
                if(m2 > 0)
                    maxLeft = Math.max(maxLeft, nums2[m2-1]);
                if(total % 2 != 0)
                    return maxLeft;
                int minRight = Integer.MAX_VALUE;
                if(m1 < nums1.length)
                    minRight = Math.min(minRight, nums1[m1]);
                if(m2 < nums2.length)
                    minRight = Math.min(minRight, nums2[m2]);
                return (maxLeft+minRight)/2.0;
            }
        }
        return 0;
    }
}
