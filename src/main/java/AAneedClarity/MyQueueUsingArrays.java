package AAneedClarity;

// https://www.programiz.com/dsa/deque
//program is not complete from jenny YTD refer above link
public class MyQueueUsingArrays {
    public static void main(String[] args) {
        int n = 5;
        int queue[] = new int[n];
        int front = -1;
        int rear = -1;
        processQueue(queue, front, rear);
    }

    private static void processQueue(int[] queue, int front, int rear) {
        //calling logic is incorrect
        int[] ints = enQueue(2, front, rear, queue);
        enQueue(5, front, rear, ints);
        enQueue(2, front, rear, ints);
        deQueue(2, front, rear, ints);
    }

    static int[] enQueue(int x, int front, int rear, int[] queue) {
        //overflow condition
        if (rear == queue.length - 1) {
            System.out.println("Queue is Full");
        } else if (front == -1 && rear == -1) {
            front = rear = 0;
            queue[rear] = x;
        } else {
            rear++;
            queue[rear] = x;
        }
        return queue;
    }

    static void deQueue(int x, int front, int rear, int[] queue){
        if(front==-1 && rear ==-1){
            System.out.println("under flow");
        }else if(front==rear){
            front = rear = -1;
        }
        else{
            queue[front]=x;
            front++;

        }
    }
}
