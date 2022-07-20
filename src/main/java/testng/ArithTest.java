package testng;

import java.util.Scanner;

public class ArithTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value");
        int a = sc.nextInt();
        System.out.println("enter b value");
        int b = sc.nextInt();
        int c = 0;
        try{
             c = a/b;
        } catch (Exception e){
            System.out.println("b value can not be 0");
        }


        System.out.println(" c vale : " +c);
        System.out.println("my name is ravi");
    }
}
