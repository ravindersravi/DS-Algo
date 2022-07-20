package AHubber.stack;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

public class StackC<T> implements Iterable<T> {
    LinkedList<T> list = new LinkedList<>();

    public StackC() {
    }

    public StackC(T firstElem) {
        push(firstElem);
    }

    public int size(){
        return list.size();
    }
    public boolean isEmpty(){
        return size() ==0;
    }
    public void push(T ele){
        list.addLast(ele);
    }
    public T pop(){
        if(isEmpty()) throw new EmptyStackException();
        return list.removeLast();
    }

    public T peek(){
        if(isEmpty()) throw new EmptyStackException();
        return list.peekLast();
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
