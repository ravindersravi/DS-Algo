package ADynamicPrograming;

import java.util.Scanner;

public class ReverseOfAnArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfElements = sc.nextInt();
        int[] n = new int[noOfElements];
        for(int i=0;i<noOfElements;i++){
            n[i]=sc.nextInt();
        }
        // int n = al.stream().toArray(String[]::new);
        // ArrayList<Integer> al = new ArrayList<>();
        for(int i=n.length-1;i>=0;i--){
            System.out.println(n[i]);
        }

    }


}
