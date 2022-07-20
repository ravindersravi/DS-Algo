package AwilliamFiset;

import org.omg.CORBA.Object;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Array<T> implements Iterable<T> {

    private T[] arr;
    private int len = 0; //length the user thinks
    private int capacity = 0; // Actual array size

    public Array() {
        this(16);
    }

    public Array(int capacity) {
        if (capacity < 0) throw new IllegalArgumentException("Illegal Capacity" + capacity);
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
    }

    public int size() {
        return len;
    }
    public boolean isEmpty(){return  size()==0;}

    public void clear(){
        for(int i=0;i<capacity;i++)
            arr[i]=null;
        len=0;
    }

    public void add(T elem){
        //Time to resize!
        if(len+1>=capacity){
            if(capacity==0) capacity =1;
            else capacity*=2; // double the size
            T[] newArr = (T[]) new Object[capacity];
            for(int i=0;i<len;i++)
                newArr[i]= arr[i];
            arr=newArr;
        }
        arr[len++]= elem;
    }

    public T removeAt(int rm_index){
        if(rm_index>=len && rm_index<0) throw new IndexOutOfBoundsException("index is outof limits"+rm_index);
        T data = arr[rm_index];
        T[] new_arr = (T[]) new Object[len-1];
        for(int i=0,j=0;i<len;i++,j++)
           if(i==rm_index) j--;
           else new_arr[j]= arr[i];
        arr = new_arr;
         capacity=--len;
         return data;
    }

    public boolean remove(Object obj){
        for(int i=0;i<len;i++){
            if(arr[i].equals(obj))
                removeAt(i);
                return true;
        }
        return false;
    }

    public int indexOf(Object obj){
        for(int i=0;i<len;i++){
            if(arr[i].equals(obj))
                return i;
        }
        return -1;
    }

    public boolean contains(Object obj){
        return indexOf(obj) != -1 ;
    }
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index=0;
            @Override
            public boolean hasNext() {
                return index<len;
            }

            @Override
            public T next() {
                return arr[index++];
            }
        };
    }


}
