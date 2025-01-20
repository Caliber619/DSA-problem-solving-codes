package arrays_easy;

import java.util.ArrayList;

public class maxConsecutiveOnes {
    static int func(int arr[]){
        ArrayList<Integer> arrList = new ArrayList<>();
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
            }
            if(arr[i]==0){
                arrList.add(count);
                count=0;
            }
            if(i==n-1){
                arrList.add(count);
            }
        }

        int maximum = 0;
        for (int j = 0; j < arrList.size(); j++) {
            if (maximum < arrList.get(j))
                maximum = arrList.get(j);
        }
        return maximum;
    }
    public static void main(String[] args) {
        int arr[]= {0,1,1,0,1,1,1,0,1,1,0,1,1,1,1};
        System.out.println(func(arr));
    }
}
