package greedyAlgorithm_questions_ac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class _01ActivitySelection {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        //we have end time based sorted activities

        int activities[][] = new int[start.length][3];
        for(int i = 0; i< start.length; i++){
            activities[i][0] = i; //index
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
 
        //lambda function -> sortform
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2])); //here 2 is showing coloum no. three


        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i=1; i<end.length; i++){
            // activity select start>lastEnd
            if(activities[i][1] >= lastEnd){
                //select activity
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("max Activities = "+ maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
