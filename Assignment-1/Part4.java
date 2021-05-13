class Part4{

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

    Node head = null;
    Node tail = null;
    int size = 0;

    //add node to the end of the list
    void push (Node node){
        if(head == null){ //if list is empty
            head = node;
            tail = node;
        }
        else{
            //old tail will point to the newly added node
            tail.next = node;
            //the new node that was added will become the new tail
            tail = node;
        }
        size++;
    }

    //remove last node and return data
    Integer pop(){

        if(head == null) return null;
        if(head.next == null) return null;

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        int result = temp.data;
        temp.next = null;
        size--;
        return result;
    }

    ////
    void insert(int index, Node node){
        if((index > size) || (index < 0)) return;

        Node temp = head;
        Node prev = null;
        int count = 0;
        while(count != index){
            count++;
            temp = node;
            temp = temp.next;
            if(index == 1){
                
            }

        }
        head = head.next;
    }
/////--------------
    void remove(int index){
        if((index < 0) || (index > size)) return;
        if(head ==null) return;

        Node temp = head;
 

        if (index == 0){
            head = temp.next; 
            return;
        }

        for (int i=0; temp!=null && i<index-1; i++)
            temp = temp.next;

        if (temp == null || temp.next == null)
            return;

        Node next = temp.next.next;
 
        temp.next = next;  // Unlink the deleted node from list
  
    }

    Node elementAt(int index){
        if((index < 0) || (index > size)) return null;

        int count = 0;
        Node temp = head;
        while(count <= index){
            temp = temp.next;
            count++;
        }
        return temp;
    }

    int size(){
        return size;
    }

    void printList(){
        Node temp = head;
        String res = "";
        while(temp != null){
            res += temp.data;
            temp = temp.next;
            if(temp != null){
                res += ",";
            }
        }
        System.out.print(res);
    }

    public static void main(String[] args){

    }

}



