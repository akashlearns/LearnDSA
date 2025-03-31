package March;
//linked List Practice ffor the first time.
public class p31mar {
    public static void displayRecursive(Node head){
        if(head == null) return;
        System.out.print(head.data + " ");
        displayRecursive(head.next);

    }
    public static void reverseDisplay(Node head){
        if(head == null) return;
        reverseDisplay(head.next);
        System.out.print(head.data + " ");
    }
    public static int size(Node head){
        int count = 0;
        while (head!=null) {
            count++;
            head = head.next;
        }
        return count;

    }

    public static void display(Node head){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }
    public static class Node{
        int data;
        Node next;
        Node( int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(6);
        Node e = new Node(9);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        
        /*  System.out.println(c.data); is Equal to 
            System.out.println(a.next.next.data);
                for (int i = 0; i <= 3; i++) {
                System.out.print(temp.data +" ");
                temp = temp.next;}
        */
        
        display(a);
        System.out.println();
        displayRecursive(a);
        System.out.println();
        reverseDisplay(a);
        System.out.println();
        System.out.println(size(a));

    }
}
