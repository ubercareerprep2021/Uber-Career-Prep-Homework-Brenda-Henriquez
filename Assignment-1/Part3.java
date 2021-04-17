import java.util.*;

public class Part3{

    //stack implementation
   // 1

    // 5
    // 3
    // 2


    ArrayList<Integer> stack;
    //ArrayList<Integer> minStack;
    int top = 0;

    public Part3(){
        stack = new ArrayList<Integer>();
        //minStack = new ArrayList<Integer>();
        top = 0;
    }
    public void push(int x){
        stack.add(x);
        //minStack.add(x);
        top++;
    }

    public Integer pop(){
        if(!stack.isEmpty()){
            int temp = stack.get(top-1);
            stack.remove(top-1);
            top--;
            return temp;
        }
        return null; //return -1 if stack is empty
    }
    
    public Integer top(){
        if(!stack.isEmpty()){
            return stack.get(top-1);
        }
        return null; //return -1 if stack is empty      
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

class uberQueue{
    //linked list

    private Node front;
    private Node rear; 
    private int size; 

    private class Node
    { 
        int data;
        Node next;
    }

    public uberQueue()
    {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty()
    {
        if (size == 0) return true;
        return false;
    }

    public int dequeue()
    {
        int data = front.data;
        front = front.next;
        if (isEmpty()) 
        {
            rear = null;
        }
        size--;
        return data;
    }

    public void enqueue(int data)
    {
        Node temp = rear;
        rear = new Node();
        rear.data = data;
        rear.next = null;
        if (isEmpty()) 
        {
            front = rear;
        }
        else 
        {
            temp.next = rear;
        }
        size++;
    }

    public int size(){
        return size;
    }

    public int front(){
        return front.data;
    }

    public int rear(){
        return rear.data;
    }

    public static void main(String[] args){
        //testing queue

        // uberQueue ub = new uberQueue();
        // ub.enqueue(1);
        // ub.enqueue(2);
        // ub.enqueue(3);
        // System.out.println(ub.size());
        // System.out.println(ub.front());
        // System.out.println(ub.rear());
        // System.out.println(ub.dequeue());

    }

}
