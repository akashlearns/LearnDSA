package April;
//Finding Nth node from last in one traversal.
public class p1apr1 {
    public static Node Nthnode(Node head,int n){
        Node fast = head;
        Node slow = head;
        for(int i =1;i<=n;i++){// int i = 1, mind it;
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
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
        Node temp = Nthnode(a,3);
        System.out.println(temp.data);

    }
}

