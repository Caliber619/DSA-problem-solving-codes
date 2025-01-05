public class firstOccurence {
    static int func(int arr[],int index,int target){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return func(arr, index+1, target);
        
        }
    public static void main(String[] args) {
        int arr[]={1,9,2,6,8,2,2,9,22};
        System.out.println(func(arr, 0,8));
    }
}
