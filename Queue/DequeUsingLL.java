package Queue;

public class DequeUsingLL {
    static class Node{
        int val;
        Node next;
        Node(int data){
            this.val = data;
            next = null;
        }
    }

    static class Deque{
        Node head;
        Node tail;
        Deque(){
            head = tail = null;
        }
        void front_push(int val){
            Node node = new Node(val);

            if(isEmpty()){
                head = tail = node;
            }
            else{
                node.next = head;
                head = node;
            }
        }

        int front_pop(){
            if(isEmpty()) return -1;
            int data = head.val;
            head = head.next;
            return data;
        }

        void rear_push(int val){

            Node node = new Node(val);
            if(isEmpty()){
                head = tail = node;
            }

            else{
                tail.next = node;
                tail = node;
            }
        }

        int rear_pop(){
            if(isEmpty()) return -1;

            if(head==tail){
                int data = tail.val;
                head = tail = null;
                return data;
            }

            Node temp = head;
            while(temp.next!=tail){
                temp = temp.next;
            }
            int data = tail.val;
            tail = temp;
            tail.next = null;
            return data;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        boolean isEmpty(){
            return head==null;
        }
    }

    public static void main(String[] args) {
        Deque dq = new Deque();
        dq.front_push(1);
        dq.front_push(2);
        dq.front_push(3);
        dq.front_pop();
        dq.rear_push(4);
        dq.rear_push(5);
        dq.rear_push(6);
        dq.rear_pop();
        dq.rear_pop();

        dq.display();



    }
}
