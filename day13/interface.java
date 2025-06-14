import java.util.PriorityQueue;
public class Queueinterface
{
    public static void main(String[] args) 
    {
        priorityQueue<Integer>queue=new PriorityQueue<Integer>();
        System.out.println("The remove element is:" +queue.remove());
        System.out.println("The head is:" +queue.element());