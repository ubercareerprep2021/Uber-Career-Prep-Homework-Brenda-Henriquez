import java.util.*;

public class Part3{

    //stack implementation

    ArrayList<Integer> stack;
    int top = 0;

    public Part3(){
        stack = new ArrayList<Integer>();
        top = 0;
    }
    public void push(int x){
        stack.add(x);
        top++;
    }

    public int pop(){
        if(!stack.isEmpty()){
            int temp = stack.get(top-1);
            stack.remove(top-1);
            top--;
            return temp;
        }
        return -1; //return -1 if stack is empty
    }
    
    public int top(){
        if(!stack.isEmpty()){
            return stack.get(top-1);
        }
        return -1; //return -1 if stack is empty      
    }

    public boolean isEmpty(){
        if(top == 0) return true;
        return false;
    }

    public int size(){
        return top;
    }


    public static void main(String[] args){
        //testing stack

        // Part3 p = new Part3();
        // p.push(3);
        // p.push(5);
        // p.push(7);
        // System.out.println(p.pop());
        // System.out.println(p.size());
        // System.out.println(p.isEmpty());
        // System.out.println(p.top());
    }

}

// class uberQueue{
//     //linked list

//     class Node{
//         int data;
//         Node next;
//     }

//     Node start;
//     int size = 0;
//     public uberQueue(){
//         start = new Node();
//         size = 0;
//     }

//     public void enqueue(int x){
//         Node nextNode = new Node();
//         start.data = x;
//         start.next = nextNode;
//         start = nextNode;
//         size++;
//     }

//     public void dequeue(){
//         start.next = null;
//         size--;
//     }

//     public Node rear(){
       
//         return start.data

//     }

//     public boolean isEmpty(){
//         if(start.data == null ) return true;
//         return false;
//     }



// }
