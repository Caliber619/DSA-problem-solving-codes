public class maxSubarraySum {

    static int func(int arr[]){
        int maxSum = 0; //it should be global for all the subarrays
        for(int i=0;i<arr.length;i++){
            //phle first index element se saare subArray nikalege and fir rest of the element ki subarry
            for(int j=i;j<arr.length;j++){
                int currSubarraySum = 0;
                for(int k=i;k<=j;k++){ // k will run till j ---> this is to get every subarray possible
                    currSubarraySum += arr[k];
                }
                if(maxSum < currSubarraySum){
                    maxSum = currSubarraySum;
                }
            }
        }
        return maxSum;
    }


    // kadane's algorithm
    static void kadanes(int arr[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currentSum += arr[i];
            if(currentSum < 0){   //kadane me negative ko nahi lenge bs 0 maan lenge
                currentSum = 0;
            }
            if(maxSum<currentSum){
                maxSum = currentSum;
            } //can be written as maxSum = Math.max(currentSum, maxSum);
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int arr1[] = {-1,-2,6,-1,3};
        int arr2[] = {2,4,6,8,10};
        System.out.println(func(arr1));
        System.out.println(func(arr2));
        int arr3[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(arr3);
    }
    
}
