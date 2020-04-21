public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue myList = new MyQueue(5);

        myList.enQueue(1);
        myList.enQueue(2);
        myList.enQueue(3);
        myList.enQueue(4);
        System.out.println(        myList.isEmpty());
        System.out.println(        myList.isQueueFull());
        myList.deQueue();
        myList.deQueue();
        myList.deQueue();
    }
}
