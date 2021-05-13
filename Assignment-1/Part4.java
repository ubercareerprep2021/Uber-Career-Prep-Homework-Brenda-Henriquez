
class Part4{

    Node head;
    Node rear; 
    int size; 

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

    part4(){
        head = null;
        rear = null;
        size = 0;
    }

    void push (Node node){
        head = node;
        size++;
    }

    Node pop(){
        if(head == null) return null;
        int res = rear.data;

        return null;
    }

    
    void insert(int index, Node node){

    }

    void remove(int index){

    }

    Node elementAt(int index){
        return null;
    }

    int size(){
        return -1;
    }

    void printList(){

    }

    public static void main(String[] args){

    }

}



