import java.util.Arrays;

//swap
public class bubbleSort {
    public static void main(String[] args) {
        int[] arr ={ 1,2,3,4,5};
                bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
static void bubble(int[] arr){
        boolean swapped;
        // run the steps n-1 times
    for (int i=0; i<arr.length-1; i++) {
        swapped=false;
        // for each step,max item will come at the last respective index
        for (int j = 1; j < arr.length - 1; j++) {
            //swap if the item is smaller than the previous index
            if (arr[j] < arr[j-1]) {
                // swap
                int temp= arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
                swapped=true;

            }

        }
        // if you didn't swap that's mean array sorted
        if (!swapped){ //! false=true
            break;
        }

        }
    }
}