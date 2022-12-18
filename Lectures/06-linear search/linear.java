public class linear {
    public static void main(String[] args) {
        int[] nums ={ 23, 45, 20, 55, 100, -65, -3, 2};
        int target = 2;
        int ans= linearSearch(nums, target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int target){
        if (arr.length ==0) {
            return -1;
        }
        for (int index=0; index <arr.length ; index++){
            int element = arr[index];
            if (element == target ){
                return index;
            }
        }
        return -1;
    }
}