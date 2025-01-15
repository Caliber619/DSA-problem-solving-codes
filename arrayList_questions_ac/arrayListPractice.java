import java.util.ArrayList;
import java.util.Collections;

public class arrayListPractice{
    // static void func(){
    //     ArrayList<Integer> myList = new ArrayList<>();
    //     myList.add(1);
    //     myList.add(2);
    //     myList.add(4);
    //     myList.add(5);
    //     myList.add(6);
    //     for(int i=myList.size()-1;i>=0;i--){
    //         System.out.println(myList.get(i));
    //     }
    // }

    // static void func(ArrayList<Integer> list){
    //     int max = Integer.MIN_VALUE;
    //     for(int eachElement: list){
    //         if(eachElement > max){
    //             max = eachElement;
    //         }
    //     }
    //     System.out.println(max);
    // }

    //swap two indices
    // static void func(ArrayList<Integer> list, int index1, int index2){
    //     // int temp = list.get(index1);
    //     // int num1 = list.get(index1); 
    //     // int num2 = list.get(index2);
    //     // num1 = num2;
    //     // num2 = temp;
    //     // list.add(index1, num1);
    //     // list.add(index2, num2);
    //     // System.out.println(list.get(index1));
    //     // System.out.println(list.get(index2));

    //     //method 2
    //     int temp = list.get(index1);
    //     list.set(index1, list.get(index2));
    //     list.set(index2, temp);
    // }


    //sorting a list
    // static void func(ArrayList<Integer> list){
    //     Collections.sort(list);
    //     System.out.println(list);
    // }


    // multidimensional arraylist
    // static void func(ArrayList<Integer> list1, ArrayList<Integer> list2){
    //     ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
    //     mainList.add(list1);
    //     mainList.add(list2);
    //     System.out.println(mainList);
    //     System.out.println(list1);
    //     System.out.println(list2);

    //     for(int i=0;i<mainList.size();i++){
    //         // ArrayList<Integer> currentList = mainList.get(i);
    //         for(int j=0;j<mainList.get(i).size();j++){
    //             System.out.print(mainList.get(i).get(j));
    //         }
    //         System.out.println();
    //     }
    // }

    //container with most water ----------------------------------------
    static void func(ArrayList<Integer> list){
        // //brute force (TC: 0(n^2)) ++++++++++++++++
        // int maxWater = 0;
        // for(int i=0;i<list.size();i++){
        //     for(int j=i+1;j<list.size();j++){
        //         int height = Math.min(list.get(i),list.get(j));
        //         int width = j-i;
        //         int currentWater = height*width;
        //         maxWater = Math.max(maxWater, currentWater);
        //     }
        // }
        // System.out.println(maxWater);

        // optimized approach (TC: 0(n)) ++++++++++++++++ two pointer
        int maxWater =0;
        int leftPointer= 0;
        int rightPointer= list.size()-1;

        while(leftPointer<rightPointer){
            //calculate water
            int height = Math.min(list.get(leftPointer), list.get(rightPointer));
            int width = rightPointer - leftPointer;
            int currentWater = height*width;
            maxWater = Math.max(maxWater,currentWater);

            //update pointers
            if(list.get(leftPointer) < list.get(rightPointer)){
                leftPointer++;
            }else{
                rightPointer--;
            }
        }
        System.out.println(maxWater);

    }

    //approach 1 - for sorted array
    static boolean twoSum(ArrayList<Integer> list, int target){
        int lp = 0;
        int rp = list.size()-1;

        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp++;
            }
            if(list.get(lp)+list.get(rp)>target){
                rp--;
            }
        }
        return false;
    }


    //approach 2-  for rotated sorted array
    static boolean twoSum2(ArrayList<Integer> list, int target){
        //find pivot
        int pivot = -1;
        int n = list.size();
        
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                pivot = i;
                break;
            }
        }
        int lp = pivot+1;
        int rp = pivot;
        while(lp!=rp){
            if((list.get(lp)+list.get(rp)) == target){
                return true;
            }
            if((list.get(lp)+list.get(rp)) < target){
                lp = (lp+1)%n;
            }else{
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(11);
        list1.add(15);
        list1.add(6);
        list1.add(8);
        list1.add(9);
        list1.add(10);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        System.out.println(twoSum2(list1, 100));

    }
}