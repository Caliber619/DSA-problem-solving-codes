import java.util.*;

public class searchInsertProblem {

    public static int searchInsert(int [] arr, int x) {
        int n = arr.length; // size of the array
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] >= x) {
                //look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return high+1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7};
        int x = 6;
        int ind = searchInsert(arr, x);
        System.out.println("The index is: " + ind);
    }
}