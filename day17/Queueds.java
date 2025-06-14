package day17;

public class Queueds {
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot add " + value);
            return;
        }
        rear++;
        queue[rear] = value;
        size++;
        System.out.println(value + " enqueued to the queue.");
    }
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Cannot dequeue.");
            return -1;
        }
        return capacity;
    }
    int front = 0, rear = -1, size = 0;
    int capacity = 100;
    int[] queue = new int[capacity];

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}