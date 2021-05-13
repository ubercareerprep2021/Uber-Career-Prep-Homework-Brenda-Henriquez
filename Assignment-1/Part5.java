import java.util.*;

import org.graalvm.compiler.core.common.util.ReversedList;

class Part5{

    class Node
    { 
        int data;
        Node next;

        //constructor
        Node (int d){
            data = d;
            next = null;
        }
    }

    static Node head = null;
    static Node tail = null;
    static int size = 0;


    //Iterativley
    public static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
            System.out.println("oooo");
        }
        return prev;
    }

    //Using a stack
    public static Node reverseListStack (Node head) {
        Stack<Integer> st = new Stack<Integer>();

        Node curr = head;
        while (curr != null) {
            st.push(curr.data);
            curr = curr.next;
        }

        Node temp = head;
        while(!(st.empty())){
            temp.data = st.pop();
            temp = temp.next;
        }

        return head;
    }

    //Recursivley
    public static Node reverseListRec (Node head) {
        if (head == null || head.next == null) return head;
        Node p = reverseListRec(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }


    public static void main(String[] args){
 
        // Part4 ls = new Part4();
        // head.data = 0;
        // ls.head.data = 1;
        // ls.head.next.data = 2;
        // ls.head.next.next.data =3;
        // ls.head.next.next.next.data =4;

        LinkedList<Integer> ls = new LinkedList<Integer>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        System.out.println(reverseList(head));


    }



}






