public class newLL {
    //phle node class banao jisse node object le sako
    public static class Node{
        //ek node me do cheez hoti hain 
        int data;
        Node next;
        
        // ye Constructors h Node class ka object construct krne ke liye ki maan lo ek node(matlb Node ka object) kis kis tarh se construct krskte h 
        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }// ab humara node ka structure ban gya h -> [node(data)]

    //lets play with it now; - lets create two basic Nodes 
    public static Node head;
    public static Node tail;









    //--------------insert at first
    static void insertAtFirst(int data){
        //phle vo node banao jise insert karoge
        Node newNode = new Node(data);
        if(head==null){
            //mtlb list empty hai
            head = tail =  newNode;
            return; //important hai ki bas tham jaao itna krke
        }
        // agar list empty nahi h to?
        //--simply head ki jagah new node daal do
        newNode.next = head;
        head = newNode;
    }




    //---------------insert at last
    static void insertAtLast(int data){
        Node newNode = new Node(data);
        if(tail==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }




    //--------------how to print a linked list
    static void printLL(){
        //edge cases kya honge
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        // to print ek temporary head banake use traverse kro
        Node tempNode = head;
        while(tempNode!=null){
            System.out.print(tempNode.data+"->");
            tempNode = tempNode.next;
        }
        System.out.print("null");
    }





    //------------add at a specific index
    static void add(int index,int data){
        
    }












    public static void main(String[] args) {
        
    }
}
