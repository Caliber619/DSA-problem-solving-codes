public class countOccurence {
    static int func(int arr[], int target){
        int first = binarySearchForFirst(arr, target);
        int last = binarySearchForLast(arr, target);

        if(first == -1 && last == -1){
            return -1;
        }
        return (last-first+1);
    }
    //standard binary search
    static int binarySearchForFirst(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        int index = -1;

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
                index = mid;
                end = mid-1;

            }
        }
        return index;
    }
    static int binarySearchForLast(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        int index = -1;

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
                index =  mid;
                start = mid+1;
            }
        }
        return index;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,2,3};
        System.out.println(func(arr, 2));
    }
}
