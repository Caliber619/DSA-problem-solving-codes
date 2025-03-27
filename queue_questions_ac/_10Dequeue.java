package queue_questions_ac;
import java.util.*;
import java.util.Deque;
import java.util.LinkedList;

public class _10Dequeue {
        public static void main(String args[]){
        Deque<Integer> d = new LinkedList<>();

        d.addFirst(1);
        d.addLast(2);
        d.addFirst(3);
        d.addLast(4);
        
        System.out.println(d);

        d.removeLast();
        
        System.out.println(d);

        d.removeFirst();

        System.out.println(d);

        

    }
}
