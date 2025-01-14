public class reverseAnArray{
    static void func(int [] arr){
        for(int i=0, j=arr.length-1; i<=j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for(int element: arr){
            System.out.print(element+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        func(arr);
    }
}