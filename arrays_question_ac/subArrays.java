public class subArrays {
    // static void func(int arr[]){
    //     int i=0;
    //     while(i<arr.length){
    //         int loop=0;
    //         int end = arr.length-1;
    //         while(loop<arr.length){
    //             for(int j=i;j<=end;j++){
    //                 System.out.print(arr[j]);
    //             }
    //             end = end-1;
    //             System.out.print(" ");
    //             loop++;
    //         }
    //         i++;
    //         System.out.println();
    //     }

    // }
    static void func(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        func(arr);
    }
}
