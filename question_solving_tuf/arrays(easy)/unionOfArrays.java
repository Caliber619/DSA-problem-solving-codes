import java.util.ArrayList;

public class unionOfArrays {
    static ArrayList<Integer> func(int arr1[], int arr2[], int n, int m){
        //answer list
        ArrayList<Integer> answerList = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<n && j<m){
            //case1 - if the arr[i]==arr[j] or arr[i]<arr[j] or arr[i] already exists in the last position of the list
            if(arr1[i]<=arr2[j]){ //arr1 ka element chota ho
                if(answerList.size()==0 || answerList.get(answerList.size()-1)!=arr1[i]){
                    answerList.add(arr1[i]);
                }
                i++;
            }else{ //arr2 ka element chota ho
                if(answerList.size()==0 || answerList.get(answerList.size()-1)!=arr2[j]){
                    answerList.add(arr2[j]);
                }
                j++;
            } 

        }
        // cases where some elements are left to add
        while(i<n){
            if(answerList.get(answerList.size()-1)!=arr1[i]){
                answerList.add(arr1[i]);
            }
            i++;
        }
        while(j<m){
            if(answerList.get(answerList.size()-1)!=arr2[j]){
                answerList.add(arr2[j]);
            }
            j++;
        }

        return answerList;
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,3};
        int arr2[] = {2,3,3,4,5};
        ArrayList<Integer> ans = func(arr1, arr2, arr1.length, arr2.length);
        System.out.println(ans);
    }
}
