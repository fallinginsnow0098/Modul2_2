package bai11.baitap.queue;

public class Solution {

    public Solution(){
    }

    class Node {
        private int data;
        private Node link;

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }
    }

    static class Queue {
        public Node front = null;
        public Node rear = null;

        public Queue() {
        }
    }

    public boolean isEmpty(Queue queue) {
        boolean status = false;
        if (queue.rear == null && queue.front == null) {
            status = true;
        }
        return status;
    }

    public void enQueue(Queue queue, int data) {
        Node node = new Node(data);
        if (isEmpty(queue)) {
            queue.front = queue.rear = node;
        } else
            queue.rear.link = node;
        queue.rear = node;
        queue.rear.link = queue.front;
    }

    public int deQueue(Queue queue){
        if(isEmpty(queue)){
            System.out.println("Queue is empty");
            return -1;
        }
        int value;
        if(queue.rear == queue.front){
            value = queue.front.data;
            queue.rear = queue.front = null;
        }else {
            Node temp = queue.front;
            value = temp.data;
            queue.front = queue.front.link;
            queue.rear.link = queue.front;
        }
        return value;
    }

    public void displayQueue(Queue queue){
        Node temp = queue.front;
        System.out.println("Element in queue: ");
        while (temp.link != queue.front){
            System.out.printf("%d", temp.data);
            temp = temp.link;
        }
        System.out.printf("%d", queue.rear.data);
    }
}