public class InsertionSort {
    // Insertion sort -> O(n2)
    public static void sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            // Insertion.....
            arr[prev+1] = curr;
        }
    }

    // Print function..
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 1, 2};

        sort(arr);
        printArray(arr);
    }
}
