package studentLib;

import java.util.Random;

public class Student implements Runnable {
    private int id;
    private Book[] books;
    private Random random;

    public Student(int id, Book[] books) {
        this.id = id;
        this.books = books;
        this.random = new Random();
    }


    @Override
    public void run() {
        while (true) {
            int bookId = random.nextInt(Constant.NUM_OF_BOOKS);
            try {
                books[bookId].read(this);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return "Student " +
                "#" + id;

    }
}
