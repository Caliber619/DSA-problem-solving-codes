public class pairsInArray {
    static void func(int[] arr){
        int i=0;
        while(i<arr.length){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
            i++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        func(arr);
    }
}
