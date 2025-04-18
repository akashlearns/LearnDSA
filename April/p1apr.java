package April;
//Finding Nth node from last.
public class p1apr {
    public static Node Nthnode(Node head,int n){
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        int m = size - n +1;
        temp = head;
        for(int i  = 1;i<=m-1;i++){
            temp = temp.next;
        }
        return temp;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(27);
        Node b = new Node(9);
        Node c = new Node(66);
        Node d = new Node(54);
        Node e = new Node(99);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node temp = Nthnode(a,3);
        System.out.println(temp.data);

    }
}
