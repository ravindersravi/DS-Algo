package AAjenny;

public class AAIsland {
    public static void main(String[] args) {
        char [][] grid = {{'1','1','1'},
                          {'0','1','0'},
                          {'1','1','1'}};
        int number = numIslands(grid);
        System.out.println(number);
    }
    static int numIslands(char grid[][]){
        int rows = grid.length;
        if(rows==0) return 0;

        int cols = grid[0].length;

        int no_of_islands =0;
        for(int i=0;i<rows;++i){
            for(int j=0;j<cols;++j){
                if(grid[i][j]=='1'){
                    mark_current_island(grid,i,j,rows,cols);
                    no_of_islands +=1;
                }
            }
        }

        return no_of_islands;
    }
    static void mark_current_island(char[][] grid, int x, int y, int r, int c){
      //  System.out.println("x :"+x+ "y :"+y);
        if(x<0 ||x>=r ||y>=c ||y<0 || grid[x][y]!='1') return;

        grid[x][y]='0';


        mark_current_island(grid,x+1,y,r,c); //LEFT
        mark_current_island(grid,x-1,y,r,c); //TOP
        mark_current_island(grid,x,y+1,r,c); //RIGHT
        mark_current_island(grid,x,y-1,r,c); //DOWN

    }
}

