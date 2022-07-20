package test;

import java.util.Random;

public class Demo {
    Random id;
    public Demo(int id) {
        this.id = new Random();
    }

    public static void main(String[] args) {
        Demo demo = new Demo(1);
        System.out.println(demo);
    }
}
