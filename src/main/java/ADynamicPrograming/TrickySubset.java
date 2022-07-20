package ADynamicPrograming;

import java.util.ArrayList;

/*
N children are made to stand in a queue. Each of them is given a number A[i]. The teacher writes a number S on a page and passes it to
the first child. Each child must add all the numbers they see on the page along with their own number, write the sum on the paper and
 pass it to the next person.
In the end, the teacher must determine if X can be formed by adding some of the numbers from the series of numbers written on the paper.

 Input:
S = 1, N = 4, X = 7
A = {1, 2, 4, 2}
Output: yes
Explaination: The final sequence of
numbers on the paper is 1, 2, 5, 12, 22.
Using 2 and 5 we can form 7.

 */
public class TrickySubset {
    public static void main(String[] args) {
        int N=4;
        long S=1,  X=7;
        long A[] = {1,2,4,2};
        isPossible(S,N,X,A);
    }
    static int isPossible(long S, int N, long X, long A[]){
        ArrayList<Long> temp = new ArrayList<>();
        temp.add(S);
        long sum =0;
        long runningsum=0;
        temp.add(S+A[0]);
        runningsum= temp.get(0)+temp.get(1);
        for(int i=1;i<N;i++){
            sum = A[i]+runningsum;
            if(sum>X)break;
            temp.add(sum);
            runningsum+=sum;
        }
        int res=0;
        for(int i=temp.size()-1;i>=0;i--){
            if(temp.get(i)>X){
                continue;
            }
            else {
                X-=temp.get(i);
            }
            if(X==0){
                return 1;
            }
        }
        return res;
    }
}
