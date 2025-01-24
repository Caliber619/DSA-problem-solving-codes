public class lowerBoundOfX {
    static int func(int arr[], int target, int start, int end){
        while (start<=end) {
            int mid = start + (end-start)/2;

            if (target < arr[mid]) {
                end = mid-1;
                
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                //ans found
                return mid;
            }
        }
        return start;
    }
}
