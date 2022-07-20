package AAADpseries;

import dto.udemy.AtomicIntegers;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

abstract class Example{
    static void display() {
        System.out.println("Static method in an abstract class");
    }
    static int x = 100;
    static void sample() {
        System.out.println("static method of the abstract class");
    }
    public void demo() {
        System.out.println("Method of the abstract class");
    }
}
class UserInfo extends Example{
    public static void main(String[] args) {
        Example.sample();
        UserInfo userInfo = new UserInfo();
        userInfo.demo();
        Example.display();
        System.out.println(Example.x+" Example::  ");
    }
}
public class AbstractClassNonStaticMethod {
    public static void main(String[] args) {
        Example.sample();
        AtomicInteger value = new AtomicInteger();
        value.incrementAndGet();
        value.decrementAndGet();
        value.addAndGet(1);
        int expectedValue = 0;
        int newValue = 0;
        value.compareAndSet( expectedValue, newValue);

        AtomicLong vales = new AtomicLong();
    }
}
