public class kadanes {
    //brute force;
    static void func(int [] arr){
        //lets try to print all the sub-arrays
        // int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int n = arr.length;
        int maxCount = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int subArrayCount = 0;
                for(int k=i;k<=j;k++){
                    // System.out.print(arr[k]+" ");
                    subArrayCount += arr[k];
                }
                if(subArrayCount > maxCount){
                   maxCount = subArrayCount; 
                }
                // System.out.println();
            }
            // System.out.println();
        }
        System.out.println(maxCount);
        
    }

    //optimal (two pointers)
    //keep in mind that the suba
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        func(arr);
        // func2(arr);
    }
    
}
