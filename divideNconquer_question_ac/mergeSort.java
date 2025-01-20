public class mergeSort {
    static void func(int arr[], int start,int end){
        // BASE CASE
        if(start >= end){
            return;
        }

        // KAAM
        int mid = start+(end-start)/2;
        func(arr, start, mid);      //sort left side
        func(arr, mid+1, end);      //sort right side
        merge(arr,start,mid,end);
    }
    static void merge(int arr[],int start,int mid,int end){
        // assume left(0,3) and right (4,6)
        int temp[] = new int[end-start+1];
        int i = start;  //iterator for left part
        int j = mid+1;  //iterator for right part
        int k = 0;      //iterator for temp array

        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }else{
                temp[k] = arr[j];
                j++;
                k++;
            }
        }

        //left part me kuch bacha ho to
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        //right part me kuch bacha ho to
        while(j<=end){
            temp[k++] = arr[j++];
        }

        // ab temp to ban gya now we have to copy
        //copy item to original array
        for(k=0, i=start; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }

    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        func(arr, 0, arr.length-1);
        for(int element: arr){
            System.out.print(element+" ");
        }
    }
}
