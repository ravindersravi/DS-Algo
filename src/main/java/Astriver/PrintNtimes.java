package Astriver;

import java.util.LinkedList;

//print Name N times using recursion
public class PrintNtimes {
    public static void main(String[] args) {
        PrintNtimes printNtimes = new PrintNtimes();
        int count=0;
        printNtimes.printer(5,count);
    }
    public void printer(int n,int count){
        System.out.println("count :"+count);
        count++;
        LinkedList de = new LinkedList();

        if(n>0){
            System.out.println("java");
           n= n-1;
          printer(n, count);
            //return de;
        }//
       // if(n==0)
            //return -1;
    //    return de;
    }
}
