// ------------------------------------------------------------ MY linked List
public class practiceLL {




    // -------------------------------------------------------------node box
    public static class Node {
        int data;      // the data value
        Node next;      // the reference to the next Node in the linked list

        // Constructors
        Node(int data1, Node next1) {
            this.data = data1;  // Initialize data with the provided value
            this.next = next1;  // Initialize next with the provided reference
        }
        Node(int data1) {
            this.data = data1;  // Initialize data with the provided value
            this.next = null;   // Initialize next as null since it's the end of the list
        }

    }
    
    public static Node head;
    public static Node tail;
    public static int size;
    //--------------------------------------------------------------node box
    // ab is node box ke content ka hi use krke saare actions perform honge!!







    //-----------------------------------------------methods for adding and removing
    public void addFirst(int data){
        //step1 - create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head=tail=newNode;
            return;
        }
        // step2 - newNode next = head
        newNode.next = head;
        // step3 - head = new node
        head = newNode; 
    }

    public void addLast(int data){
        // creating a node
        Node newNode = new Node(data);
        size++;
        if(tail == null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    public void display(){
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int index, int data){
        if(index == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        //after this loop the temp will be at the index-1 so we will perform the linkage
        newNode.next = temp.next;
        temp.next = newNode;
    
    }
    
    //-------------------------------------------------------------removing
    public int removeFirst(){
        if(size==0){
            System.out.println("The list is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("The list is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        Node temp = head;
        for(int i=1;i<size-1;i++){
            temp = temp.next;
        }
        //at the end of this loop the temp will be at previous of tails
        int val = tail.data;
        temp.next = null;
        tail = temp;        
        size--;
        return val;
    }

    //------------------------------------------------------------searching in a linked list
    public int iterativeSearch(int target){
        // Node node = new Node(target);
        Node temp = head;
        int index = 0;
        while(temp != null){
            //check if any node.data == target
            if(temp.data == target){
                System.out.print("Target found at index : ");
                return index;
            }
            index++;
            temp = temp.next;
        }
        System.out.print("Target not found: ");
        return -1;
    }

    //--------------------------------------------------------------recursive searching
    // public int helper(Node head, int key){
    //      if(head == null){
    //         return -1;
    //      }

    //      if(head.data == key){
    //         return 0;
    //      }
    //      int index = helper(head.next, key);
    //      if(index == -1){
    //         return -1;
    //      }

    //      return index+1;
    // }

    public int recursiveSearch(Node temp, int key){
        // return helper(head,key);
        if(temp == null){
            return -1;
         }
         
         if(temp.data == key){
            return 0;
         }
         int index = recursiveSearch(temp.next, key);
         if(index == -1){
            return -1;
         }

         return index+1;

    }


    //*****/
    //------------------------------------------------------------reverse a linked list
    public void reverse(){
        //make three variables
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }
        tail = head;
        head = prev;
        
    }

    //------------------------------------------------------remove nth node from the end
    public void deleteNthFromEnd(int n){
        //calculate size
        int size = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }

        if(n>size){
            System.out.println("Give index within size range");
            return;
        }
        if(n==size){ //i.e nth from end here will be first node
            head = head.next; 
            size--;
            return;
        }

        // now we have to reach to the index(prev to the required index)
        int suitableIndex;
        Node temp2 = head;
        for(suitableIndex=1; suitableIndex<(size-n);suitableIndex++){
            temp2 = temp2.next;
        }
        //at the end of this loop temp2 will be at suitable index
        
        //now just change the link
        temp2.next = temp2.next.next;
        size--;
        return;

    }
//------------------------------------------------------------------------ MY linked list
    public static void main(String[] args) {
        //now to create a linked list in our main class
        practiceLL ll = new practiceLL();
        // ll.display();
        //now we will create nodes for our list for this we will make methods
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        // ll.display();

        ll.add(2, 3);
        ll.display();
        // System.out.println(ll.size);

        // ll.removeFirst();
        // ll.removeLast();
        // ll.display();
        // System.out.println(ll.size);

        // System.out.println(ll.iterativeSearch(1));
        // System.out.print("IterSearch; " );
        // System.out.println(ll.iterativeSearch(5));

        // Node temp = head;
        // System.out.println("RecurrSearch; Target found ar index : "+ll.recursiveSearch(temp, 5));


        System.out.println();
        // ll.reverse();
        // ll.display();

        ll.deleteNthFromEnd(3);
        ll.display();
        ll.deleteNthFromEnd(5);
        ll.display();


    }
}