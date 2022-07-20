/*
package Ajava8;

//https://www.geeksforgeeks.org/program-for-conways-game-of-life/
public class ConwayGameOfLife {
    public static void main(String[] args) {
        int M=10, N=10;
        int[][] grid = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 1, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
        };
        System.out.println("Original Generation");
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                if(grid[i][j]==0){
                    System.out.println(".");
                }
                else
                    System.out.println("*");
            }
        }
        System.out.println();
        nextGeneration(grid,M,N);
    }
    public static void nextGeneration(int grid[][], int M, int N){
        int future[][] =  new int[M][N];
        for(int l=0;l<M;l++){
            for(int m=0;m<N;m++){
                int aliveNeighbours =0;
                for(int i=-1;i<=1;i++)
                    for(int j=-1;j<=1;j++)
                      //  if()
            }
        }

    }
}
*/
