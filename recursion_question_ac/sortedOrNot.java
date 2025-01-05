public class sortedOrNot {
    static boolean func(int arr[],int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return func(arr, index+1);
        
        }
    public static void main(String[] args) {
        int arr[]={12,23,45,64,78};
        System.out.println(func(arr, 0));
    }
    
}
