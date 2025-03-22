package stack_questions_ac;
import java.util.*;

public class _06StockSpan {
    public static void main(String args[]){
        int stock [] = {100,80,60,70,60,85,100};
        //array to store stock span
        int span [] = new int[stock.length];

        // stockSpan(stock,span);
        stockSpan2(stock,span);

        // for(int i =0; i<span.length; i++){
        //     System.out.println(span[i]);
        // }
        System.out.println(Arrays.toString(span));
    }

    public static void stockSpan2(int []stock, int[] span){
        // stack indexes rkhne ke liye
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0); //because phle element ka index stack me dalna padega

        for(int i=1;i<stock.length;i++){
            //stock ek ek krke check krege
            // int stock [] = {100,80,60,70,60,85,100};
            int current = stock[i];

            while(!s.isEmpty() && current >= stock[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                int prevHigh = s.peek();
                span[i] = i - prevHigh; 
            }
            s.push(i);
        }

    }
    public static void stockSpan(int []stock, int []span){
        
        //this stack is storing the indexes of the stock prices
        Stack <Integer> s = new Stack<>();
        //span for first element is always 1
        span[0] = 1;
        //putting the index of the first value
        s.push(0);

        //i will start from 1 because it is done for first value
        for(int i = 1; i< stock.length; i++){
            int currPrice = stock[i];

            while(!s.isEmpty() && currPrice >= stock[s.peek()]){
                s.pop();
            } 

            //while removing the value if the stack became empty then add i(of current price) +1 i the span array
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                int prevHigh = s.peek();
                span[i] = i-prevHigh;
            }
            //if the value is greater than the previous stock then push the index in the stack
            s.push(i);
        }


    }
    
}
