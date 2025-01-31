public class LinkedList {
    //node structure
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }        
    }

    //ab is node se Head and tail bana lo
    Node head;
    Node tail;

    void insertAtFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    //detect loop
    void detectLoop(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null && slow!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                System.out.println("loop found");
                return;
            }
        }
        System.out.println("loop not found");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtFirst(20);
        list.insertAtFirst(41);
        list.insertAtFirst(5);
        list.insertAtFirst(10);
        // list.head.next.next.next.next = list.head;
        list.detectLoop(); 
    }
    
}
