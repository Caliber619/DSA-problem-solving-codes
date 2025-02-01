import javax.naming.ldap.LdapName;

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
    void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = newNode;
    }

    //----------------------------------------detect loop
    // void detectLoop(){
    //     Node slow = head;
    //     Node fast = head;
    //     while(fast!=null && fast.next!=null && slow!=null){
    //         slow = slow.next;
    //         fast = fast.next.next;
    //         if(slow==fast){
    //             System.out.println("loop found");
    //             return;
    //         }
    //     }
    //     System.out.println("loop not found");
    // }

    void evenOrOdd(){
        if(head == null){
            System.out.println("this list is empty");
            return;
        }
        Node evenHead = null;
        Node evenTail = null;
        Node oddHead = null;
        Node oddTail = null;

        Node temp = head;
        while(temp!=null){
            int data = temp.data;
            if(data % 2 == 0){
                //even node
                if(evenHead == null){
                    evenHead = evenTail = temp;
                }else{
                    evenTail.next = temp;
                    evenTail = temp;
                }
            }else{
                //odd node
                oddTail.next = temp;
                oddTail = temp;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList evenList = new LinkedList();
        LinkedList oddList = new LinkedList();
        list.insertAtFirst(20);
        list.insertAtFirst(41);
        list.insertAtFirst(5);
        list.insertAtFirst(5);
        list.insertAtFirst(10);
        // list.head.next.next.next.next = list.head;
        // list.detectLoop(); 


        //----for even or odd we need to traverse each node and check for even or odd

    }
    
}
