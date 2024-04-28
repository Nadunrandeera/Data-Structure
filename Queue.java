public class Queue {
    int front;
    int rear;
    int capacity;
    int noItem;

    int[] arr;

    Queue(int capacity){
        this.capacity = capacity;
        front = 0;
        rear = -1;

        arr = new int[capacity];
    }
    boolean isFull(){
        return rear+1==capacity;
    }
    void enQueue(int x){
        if (isFull()) {
            System.out.println("Queue is full..!");
        }
        else{
            rear++;
            arr[rear] = x;
            System.out.println("Insertin.."+x);
        }
    }
    boolean isEmpty(){
        return front>rear;
    }
    void deQueue(){
        if (isEmpty()) {
            System.out.println("Queue is Empry..!");
        }
        else{
            System.out.println("Removing..."+arr[front]);
            front++;
        }
    }
    void pritnQueue(){
        for (int i=front; i<=rear; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        queue.deQueue();
        queue.deQueue();

        queue.pritnQueue();
    }
}
