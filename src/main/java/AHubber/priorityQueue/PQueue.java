package AHubber.priorityQueue;

import java.util.*;

public class PQueue <T extends Comparable<T>> {

    //no of elements currently
    private int heapSize = 0;

    //the initial capacity of the heap
    private int heapCapacity =0;
    //dynamic list to track the elements inside the heap
    private List<T> heap = null;

    private Map<T, TreeSet<Integer>> map = new HashMap<>();

    public PQueue(){
        this(1);
    }
    public PQueue(int sz){
        heap = new ArrayList<>(sz);
    }


}
