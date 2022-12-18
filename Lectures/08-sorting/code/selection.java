import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 5};
        SelectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void SelectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find max item then swap
            int last = arr.length - i - 1;
            int maxIndex = getMaxindex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getMaxindex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
            return max;

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