public class searchInRange {
    public static void main(String[] args) {
        int[] arr= {18, 15, 66, 77, 55, 100};
        int target = 77;
        System.out.println(linearSearch(arr, target, 2,6));

    }
    static int linearSearch(int[] arr, int target, int start , int end){
        if (arr.length ==0) {
            return -1;
        }
        for (int index=start; index <end ; index++){
            int element = arr[index];
            if (element == target ){
                return index;
            }
        }
        return -1;
    }
}

