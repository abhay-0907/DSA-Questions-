package Queue;

import java.util.Stack;

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

        int queueSize = 0;
        Queue(){
            head = tail = null;
        }

        void push(int val){
            Node node = new Node(val);
            if(isEmpty()){
                head = tail = node;
                queueSize++;
            }
            else{
                tail.next = node;
                tail = node;
                queueSize++;
            }
        }

        void pop(){
            if(isEmpty()){
                return;
            }
            else{
                head = head.next;
                queueSize--;
            }
        }

        int peek(){
            return head.val;
        }

        boolean isEmpty(){
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

        void reverseQueue(){
            Stack<Integer> st = new Stack<>();
            Node temp = head;
            while(temp!=null){
                st.push(temp.val);
                temp = temp.next;
            }
            while(!st.isEmpty()){
                System.out.print(st.pop()+ " ");
            }
            System.out.println();
        }


    }


    public static void main(String[] args) {
        Queue qu = new Queue();
        qu.push(1);
        qu.push(2);
        qu.push(3);
        qu.push(5);

//        qu.printQueue();
        qu.reverseQueue();

    }
}
