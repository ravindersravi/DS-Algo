package AAAtodo;
//Question :https://codefreshers.com/check-if-matrix-is-x-matrix-solution-leetcode/
public class CheckIfMatrix {
    public static void main(String[] args) {
        int grid[][] = {{2, 0, 0, 1},
                {0, 3, 1, 0},
                {0, 5, 2, 0},
                {4, 0, 0, 2}};
        boolean b = checkXMatrix(grid);
        System.out.println(b);
    }

    public static boolean checkXMatrix(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == j) {
                    if (grid[i][j] == 0) return false;
                    ;
                } else if (i != j && i + j == grid.length - 1) {
                    if (grid[i][j] == 0) return false;
                } else if (i != j) {
                    if (grid[i][j] != 0) return false;
                }

            }

        }

        return true;
    }

}

/*
 int row = grid.length;
        int col = grid[0].length;
        int count=0;
        int i=0;
        int j=0;
        while(i<row && j<col){
            if(grid[i][j]!='0'){
                count++;
                i=i+1;
                j=j+1;
            }
        }
        if(count == row){
            return true;
        }
        return false;
    }
 */