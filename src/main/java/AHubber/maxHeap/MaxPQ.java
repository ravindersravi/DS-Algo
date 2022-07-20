package AHubber.maxHeap;


//Max priorityQueue is nothing but our MaxHeap
public class MaxPQ {
    Integer[] heap;
    int n;

    public MaxPQ(int capacity) {
        this.heap = new Integer[capacity+1];
        this.n = 0;
    }

    public boolean isEMpty(){
        return n==0;
    }
    public int size(){
        return n;
    }

    public static void main(String[] args) {
        MaxPQ maxPQ = new MaxPQ(3);
        System.out.println(maxPQ.isEMpty());
        System.out.println(maxPQ.size());
    }
}
