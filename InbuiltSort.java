import java.util.Arrays;
import java.util.Collections;
public class InbuiltSort {
     // Print function..
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }    
    public static void main(String[] args) {
        // Time complexity -> O(nlogn).....
        // int arr[] = {5, 4, 3, 1, 2};
        // asscending order..
        // Arrays.sort(arr);

        // Descending order..
        Integer arr[] = {5, 4, 3, 1, 2};
        Arrays.sort(arr, Collections.reverseOrder()); // Here reverse order works on an object..

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
}
