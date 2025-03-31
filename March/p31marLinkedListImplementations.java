package March;

public class p31marLinkedListImplementations {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class LinkedList{
        Node head = null;
        Node tail = null;
        int size = 0;
        void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head == null) head = temp;
            else tail.next = temp;
            tail = temp;
            size++;

        }
        void insertAtHead(int data){
            Node temp = new Node(data);
            if(head == null) insertAtHead(data);
            else {
                temp.next =head;
                head = temp;
            }
            size++;
        }
        void inserAt(int idx,int data){
            Node newNode = new Node(data);
            Node temp = head;
            if(idx==size()){
                insertAtEnd(data);
                return;
            }
            else if(idx==0){
                insertAtHead(data);
                return;
            }
            else if(idx<0||idx>size()){
                System.out.println("Index is not valid");
            }
            for (int i = 1; i <=idx-1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
        void display(){
            Node temp =head;
            while (temp!=null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        void deleteAt(int idx){
            if (idx < 0 || idx >= size) {
                System.out.println("Invalid index");
                return;
            }
        
            if (idx == 0) { // Special case: Deleting head node
                head = head.next;
                size--;
                return;
            }
        
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {  // Corrected loop range
                temp = temp.next;
            }
        
            if (temp.next != null) {
                temp.next = temp.next.next;  // Bypass the node to delete
            }
        
            size--;
        }
        int getAt( int idx){
            Node temp = head;
            for (int i = 1; i <=idx; i++) {
                temp= temp.next;
            }
            return temp.data;
        }
        int size(){
            int count =0;
            Node temp = head;
            while (temp!=null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(1);
        ll.insertAtEnd(3);
        ll.insertAtEnd(6);
        ll.inserAt(1 ,96);
        ll.display();
        ll.deleteAt(1);
        ll.display();
        System.out.println("Size is:"+ll.size());
        System.out.println(ll.getAt(1));
        //System.out.println(ll.size); we can do this also.

    }
}
