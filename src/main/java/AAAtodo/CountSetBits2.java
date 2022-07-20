package AAAtodo;

import java.util.Arrays;

public class CountSetBits2 {
    public static void main(String[] args) {
        int i = 9;
        int[] ints = countBits(i);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] countBits(int n) {
        int[] answer = new int[n+1];

        for(int i=0;i<=n;i++){
            int num =i;
            int count =0;
            while(num!=0){
                count += num%2;
                System.out.println("count :"+count);
                num=num/2;
            }
            answer[i]=count;
        }
        return answer;
    }
}
