import java.util.EmptyStackException;

public class MyQueue {
    private int capacity;
    private int myList[];
    private int head = 0;
    private int tail = -1;
    private int currentSize;
    public MyQueue(int queueSize){
        myList = new int[queueSize];
        this.capacity = queueSize;
    }
    public void enQueue(int element){
        if(isQueueFull()){
            System.out.println("Cannot add element: " + element);
        } else{
            tail++;
            if(tail == capacity-1){
                tail = 0;
            }
            myList[tail] = element;
            currentSize++;
        }
    }
    public void deQueue(){
        if(isEmpty()){
            System.out.println("Cannot deQueue of empty Queue");
        } else {
            head++;
            if(head == capacity-1){
                System.out.println("DeQueue element: "+ myList[head-1]);
                head = 0;
            }
            System.out.println("DeQueue element: "+ myList[head-1]);
            currentSize--;

        }
    }
    public boolean isQueueFull(){
        if(currentSize == capacity ){
            return true;
        }else {
            return false;
        }
    }
    public boolean isEmpty(){
        if(currentSize ==0){
            return true;
        } else {
            return false;
        }
    }
}
