package AHackerEarth;

import java.util.Scanner;

public class PerfectSubarray {
    public static boolean checkPerfectSquare(double s) {
        double sqr;
        sqr = Math.sqrt(s);
        int sqroot = (int) sqr;   //obtaining "sqr" without the decimal digits
        return (sqr - sqroot == 0.0);  //if s is a perfect square then digits after decimal in sqr should be 0.If not then sqr-sqroot will be greater than 0.
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        double sum = 0;
        boolean b;
        int numbers[] = new int[n];
        for (int i = 0; i < n; i++)
            numbers[i] = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + numbers[j];      //checking every possible sub array
                b = checkPerfectSquare(sum);
                if (b == true)
                    count++;
            }
        }
        System.out.println(count);
    }
}
