import java.util.ArrayList;

public class missingElement {
    static int func(int arr[]){
        //check for the max value in the array that will be the max no. of element in the array
        int max= Integer.MIN_VALUE;
        for(int x:arr){
            if(x>max){
                max=x;
            }
        }
        int i;
        int j;
        //now we got the max and just have to traverse each element to check which is not present;
        // either small or equal to max will be present in the array
        ArrayList<Boolean> arrList = new ArrayList<>();
        for(i=0;i<=max;i++){
            for(j=0;j<arr.length;j++){
                if(arr[j]==i){
                    arrList.add(i,true);
                    break;
                }
            }
            if(j==arr.length){
                arrList.add(i,false);
            }
        }
        return arrList.indexOf(false);
    }

    public static void main(String[] args) {
        int arr[]={4,2,0,1};
        System.out.println(func(arr));
    }
}
