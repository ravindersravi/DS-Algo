package AAADpseries;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scanner.nextInt();
        if(isArmStrong(num)){
            System.out.println("yes");
        }
        else
            System.out.println("No");
    }
    public static boolean isArmStrong(int n){
        int temp =n;
        int digits=0;
        int remainder, result = 0;
        while (temp!=0){
            remainder = temp%10;  //3
            result+=Math.pow(remainder,3);
            temp=temp/10;  // 153  //15
        }
        return result==n? true: false;
    }
}
