public class findX{

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
        return -1;
    }

    //recursive approach
    static int func2(int arr[], int target, int start, int end){
        // if(start>end){
        //     return -1;
        // }
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if(target<arr[mid]){
                //call again the function but end will change
                return func2(arr, target, start, mid-1);
            }
            else{
                //call again the function but the start will change
                return func(arr, target, mid+1, end);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //I have given an integer array, integer target
        int arr[] = {
            3,4,6,7,9,12,17
        };
        int target = 12;
        System.out.println(func(arr,target,0,arr.length-1));
        System.out.println(func2(arr, target, 0, arr.length-1));

    }
}