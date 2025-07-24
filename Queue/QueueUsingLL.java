package Queue;

public class QueueUsingLL {

    // Node of linked list
    static class Node{
        int val;
        Node next;
        Node(int data) {
            this.val = data;
            next = null;
        }
    }

    // Queue Implementation
    static class Queue{
        Node head;
        Node tail;

        Queue(){
            head = tail = null;
        }

        void push(int val){
            Node node = new Node(val);
            if(empty()){
                head = tail = node;
            }
            else{
                tail.next = node;
                tail = node;
            }
        }

        void pop(){
            if(empty()){
                return;
            }
            else{
                head = head.next;
            }
        }

        int peek(){
            return head.val;
        }

        boolean empty(){
            return head==null;
        }
        void printQueue(){
            Node temp = head;
            if(temp==null){
                return;
            }
            while(temp!=null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
        }

    }


    public static void main(String[] args) {
        Queue qu = new Queue();
        qu.push(1);
        qu.push(2);
        qu.push(3);
        qu.push(4);
        qu.pop();
        qu.pop();
        qu.pop();
        qu.pop();
        qu.pop();
        qu.printQueue();

    }
}
