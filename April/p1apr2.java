package April;
//Deleting Nth node from last in one traversal.
public class p1apr2 {
    public static void Nthnode(Node head,int n){
        Node fast = head;
        Node slow = head;
        for(int i = 1; i<= n;i++){
            fast = fast.next;
        }
        if(fast == null){
            head = head.next;
            return;
        }
        while(fast.next!=null){
            fast = fast.next;
            slow =slow.next;
        }
        //slow.data = slow.next.data;
        slow.next =slow.next.next;


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
        d.next = e;//27 9 66 54 99
        Node temp = a;
        Nthnode(a, 5);
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }
}

