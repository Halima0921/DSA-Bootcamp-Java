public class MInNum {
    public static void main(String[] args) {
        // find min number in element
        int[] arr= {18, 15, 66, 77, 55, 100};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for (int i =1; i< arr.length ; i++ ){
            if(arr[i] < ans ){
                ans = arr[i];
            }
        }
        return ans;
    }
}
