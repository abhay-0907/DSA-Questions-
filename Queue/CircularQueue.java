package Queue;

import java.sql.SQLOutput;

public class CircularQueue {

    static class Cqueue{
        int f = 0;
        int r = -1;
        int cap = 0;
        int size = 0;
        int[] queue;

        Cqueue(int c){
            this.cap = c;
            queue = new int [cap];
        }

        void push(int data){
            if(size==cap) return;
            r = (r+1) % cap;
            queue[r] = data;
            size++;
        }

        void pop(){
            if(size==0) return;
            f = (f+1)%cap;
            size--;

        }
        int front(){
            if(size==0){
                System.out.println("Queue is Empty");
                return -1;
            }
            return queue[f];

        }
        boolean isEmpty(){
            return size==0;

        }
        void display(){
            if(isEmpty())return;
            for(int i = 0;i<cap;i++){
                System.out.print(queue[i]+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Cqueue cirQ = new Cqueue(4);
        cirQ.push(1);
        cirQ.push(2);
        cirQ.push(3);
        cirQ.push(4);
        cirQ.pop();
        cirQ.push(8);
        cirQ.display();
    }
}
