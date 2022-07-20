package ADynamicPrograming;

public class StocksBuyAndSell {
    public static void main(String[] args) {
        //int a[] = {5,2,6,1,4};
        int a[] = {7,1,5,3,6,4};
        int profit = profit(a);
        System.out.println(profit);
    }
    static int profit(int a[]){
        int max_profit =0;
        int min_so_far = a[0];
        for(int i=0;i<a.length;i++){
            min_so_far = Math.min(a[i],min_so_far);
            int profit = a[i]-min_so_far;
            max_profit = Math.max(max_profit,profit);
        }
        return max_profit;
    }
}
