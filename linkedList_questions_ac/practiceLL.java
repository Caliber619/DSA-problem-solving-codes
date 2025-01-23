public class practiceLL {
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

    //methods for adding and removing
    public void addFirst(int data){
        //step1 - create new node
        Node newNode = new Node(data);
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
    
    public static void main(String[] args) {
        //now to create a linked list in our main class
        practiceLL ll = new practiceLL();
        ll.display();
        //now we will create nodes for our list for this we will make methods
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.display();


    }
}