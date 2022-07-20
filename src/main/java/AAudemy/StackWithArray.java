package AAudemy;

import epam.Inte;

import java.util.ArrayList;

public class StackWithArray<E> {
    ArrayList<E> sa;
    Integer count;
    public StackWithArray(){
        sa = new ArrayList<>();
    }
    void push(E e){
        sa.add(e);
        count++;
    }
    Boolean isEmpty(){
        return count==0;
    }
}
